/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import com.personal.utiles.ReporteUtil;
import controladores.EmpleadoControlador;
import controladores.JornadaControlador;
import entidades.Jornada;
import entidades.escalafon.Empleado;
import entidades.reportes.RptAsistencia;
import entidades.reportes.RptAsistenciaDetalle;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Francis
 */
public class PruebaReporteSUNARP {
    public static void main(String[] args) {
        ReporteUtil reporteador = new ReporteUtil();
        EmpleadoControlador empc = new EmpleadoControlador();
        JornadaControlador jornc = JornadaControlador.getInstance();
        String prueba = "H:\\PROYECTOS\\JasperStudio\\MyReports\\registro_asistencia.jasper";
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 0, 1);
        Date fechaInicio = calendar.getTime();
        calendar.set(2015, 0, 31);
        Date fechaFin = calendar.getTime();
        String usuario = "admin";
        String reporte_logo = "admin";
        String reporte_institucion = "ZONA REGISTRAL N° II - SEDE CHICLAYO";
        String reporte_ruc = "20314210396";
        
        Jornada jornada = jornc.buscarPorId("1");
        Empleado empleado = empc.buscarPorId("43628623");
        if(empleado == null){
            System.out.println("EMPLEADO NULL");
        }
        
        Calendar iterador = Calendar.getInstance();
        
        iterador.set(2015, 0, 1);
        
        RptAsistencia asistencia;
        List<RptAsistencia> asistenciaList = new ArrayList<>();
        for(int i = 1; i <= 31; i++){
            iterador.set(Calendar.DAY_OF_MONTH, i);
            asistencia = new RptAsistencia();
            RptAsistenciaDetalle detalle1 = new RptAsistenciaDetalle();
            RptAsistenciaDetalle detalle2 = new RptAsistenciaDetalle();

            asistencia.setDetalle1(detalle1);
            asistencia.setDetalle2(detalle2);
            
            asistencia.setEmpleado(empleado);
            asistencia.setFecha(iterador.getTime());
            asistencia.setJornada(jornada);
            asistencia.setTipoAsistencia("R");
            
            detalle1.setDetalleJornada(jornada.getDetalleJornadaList().get(0));
            detalle1.setHoraEntrada(jornada.getDetalleJornadaList().get(0).getEntradaTolerancia());
            detalle1.setHoraSalida(jornada.getDetalleJornadaList().get(0).getSalida());
            
            detalle2.setDetalleJornada(jornada.getDetalleJornadaList().get(1));
            detalle2.setHoraEntrada(jornada.getDetalleJornadaList().get(1).getEntradaTolerancia());
            detalle2.setHoraSalida(jornada.getDetalleJornadaList().get(1).getSalida());
            
            asistenciaList.add(asistencia);
        }
        
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("usuario", usuario);
        parametros.put("reporte_institucion", reporte_institucion);
        parametros.put("reporte_ruc", reporte_ruc);
        parametros.put("fecha_inicio", fechaInicio);
        parametros.put("fecha_fin", fechaFin);
        
        reporteador.verReporte(asistenciaList, new File(prueba), parametros, null);
        
        System.exit(0);
        
    }
}
