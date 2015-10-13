/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.reportes;

import entidades.Feriado;
import entidades.Jornada;
import entidades.Permiso;
import entidades.Vacacion;
import entidades.escalafon.Empleado;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Francis
 */
public class RptAsistencia {
    private final Calendar calendar = Calendar.getInstance();
    private Empleado empleado;
    private Date fecha;
    private String tipoAsistencia;
    private RptAsistenciaDetalle detalle1;
    private RptAsistenciaDetalle detalle2;
    private Jornada jornada;
    private Permiso permiso;
    private Vacacion vacacion;
    private Feriado feriado;
    private String tipo;

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

    public Vacacion getVacacion() {
        return vacacion;
    }

    public void setVacacion(Vacacion vacacion) {
        this.vacacion = vacacion;
    }

    public Feriado getFeriado() {
        return feriado;
    }

    public void setFeriado(Feriado feriado) {
        this.feriado = feriado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(String tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }

    public RptAsistenciaDetalle getDetalle1() {
        return detalle1;
    }

    public void setDetalle1(RptAsistenciaDetalle detalle1) {
        this.detalle1 = detalle1;
    }

    public RptAsistenciaDetalle getDetalle2() {
        return detalle2;
    }

    public void setDetalle2(RptAsistenciaDetalle detalle2) {
        this.detalle2 = detalle2;
    }
    
    public int getMes(){
        calendar.setTime(this.fecha);
        return calendar.get(Calendar.MONTH) + 1;
    }
        
}
