/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import com.personal.utiles.FechaUtil;
import entidades.escalafon.Contrato;
import entidades.escalafon.Empleado;
import entidades.escalafon.FichaGeneral;
import entidades.escalafon.FichaLaboral;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author fesquivelc
 */
public class EmpleadoControlador extends Controlador<Empleado> {

    public EmpleadoControlador() {
        super(Empleado.class);
    }

    @Override
    public void prepararCrear() {
        super.prepararCrear(); //To change body of generated methods, choose Tools | Templates.
        FichaLaboral fichaLaboral = new FichaLaboral();
        fichaLaboral.setEmpleado(this.getSeleccionado());
        
        FichaGeneral fichaGeneral = new FichaGeneral();
        fichaGeneral.setEmpleado(this.getSeleccionado());
        
        this.getSeleccionado().setContratoList(new ArrayList<Contrato>());
        this.getSeleccionado().setFichaLaboral(fichaLaboral);
        this.getSeleccionado().setFichaGeneral(fichaGeneral);
        
    }
    
    public List<Empleado> buscarXNoMarcacion(Date fechaInicio, Date horaInicio, Date fechaFin, Date horaFin){
        String jpql = "SELECT e FROM Empleado e WHERE "
                + "e NOT EXISTS (SELECT m.empleado FROM Marcacion m WHERE m.fechaHora BETWWEEN fechaHoraInicio AND fechaHoraFin) ";
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("fechaHoraInicio", FechaUtil.unirFechaHora(fechaInicio, horaInicio));
        parametros.put("fechaHoraFin", FechaUtil.unirFechaHora(fechaFin, horaFin));
        return this.getDao().buscar(jpql, parametros);
    }

    public List<Empleado> buscarXPatron(String patron) {
        String jpql = "SELECT e FROM Empleado e WHERE "
                + "UPPER(CONCAT(nombre,paterno,materno)) LIKE CONCAT('%',UPPER(:patron),'%') OR e.nroDocumento = UPPER(:patron) "
                + "ORDER BY e.paterno,e.materno,e.nombre";
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("patron", patron);
        return this.getDao().buscar(jpql, mapa);
    }
    
    public List<Empleado> buscarXPatron(String patron, int desde, int tamanio) {
        String jpql = "SELECT e FROM Empleado e WHERE "
                + "UPPER(CONCAT(nombre,paterno,materno)) LIKE CONCAT('%',UPPER(:patron),'%') OR e.nroDocumento = UPPER(:patron) OR e.fichaLaboral.codigoTrabajador = UPPER(:patron)"
                + "ORDER BY e.paterno,e.materno,e.nombre";
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("patron", patron);
        return this.getDao().buscar(jpql, mapa, desde, tamanio);
    }
    
    public int totalXPatron(String patron){
        String jpql = "SELECT COUNT(e.nroDocumento) FROM Empleado e WHERE "
                + "UPPER(CONCAT(e.nombre,' ',e.paterno,' ',e.materno)) LIKE CONCAT('%',UPPER(:patron),'%') OR e.nroDocumento = UPPER(:patron)  OR e.fichaLaboral.codigoTrabajador = UPPER(:patron)";
        Long cont = (Long)this.getDao().getEntityManager().createQuery(jpql)
                .setParameter("patron", patron).getSingleResult();
        int conteo = cont.intValue();
        return conteo;
    }

    public List<Empleado> buscarPorLista(List<String> lista) {
        String jpql = "SELECT e FROM Empleado e WHERE "
                + "e.nroDocumento IN :lista";
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("lista", lista);
        return this.getDao().buscar(jpql, mapa);
    }
    
    

    public Empleado buscarPorId(int id) {
        String jpql = "SELECT e FROM Empleado e WHERE "
                + "CAST(e.nroDocumento AS integer) = :id ";
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("id", id);

        List<Empleado> empleados = this.getDao().buscar(jpql, mapa, -1, 1);
        if (empleados.isEmpty()) {
            return null;
        } else {
            return empleados.get(0);
        }
    }

}
