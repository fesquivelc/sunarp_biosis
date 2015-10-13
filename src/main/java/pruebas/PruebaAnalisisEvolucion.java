/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import algoritmo.AnalisisEvolucion;
import com.personal.utiles.FechaUtil;
import com.personal.utiles.ReporteUtil;
import controladores.EmpleadoControlador;
import entidades.escalafon.Empleado;
import entidades.reportes.RptAsistencia;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import utiles.RptAsistenciaComparador;

/**
 *
 * @author Francis
 */
public class PruebaAnalisisEvolucion {

    public static void main(String[] args) {
        EmpleadoControlador empc = new EmpleadoControlador();
        List<Empleado> empleadosAnalizar = empc.buscarTodos();
        AnalisisEvolucion analisis = new AnalisisEvolucion();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 0, 1);
        Date fechaInicio = FechaUtil.soloFecha(calendar.getTime());
        calendar.set(2015, 0, 31);
        Date fechaFin = FechaUtil.soloFecha(calendar.getTime());
        Date inicioAnalisis = new Date();
        List<RptAsistencia> asistencia = analisis.iniciarAnalisis(empleadosAnalizar, fechaInicio, fechaFin);
        Date finAnalisis = new Date();
        System.out.println("ANALISIS: "+(finAnalisis.getTime() - inicioAnalisis.getTime()));
        RptAsistenciaComparador comparador = new RptAsistenciaComparador();
        asistencia.sort(comparador);

        ReporteUtil reporteador = new ReporteUtil();
        String prueba = "H:\\PROYECTOS\\JasperStudio\\MyReports\\registro_asistencia.jasper";
        String usuario = "admin";
        String reporte_logo = "admin";
        String reporte_institucion = "ZONA REGISTRAL N° II - SEDE CHICLAYO";
        String reporte_ruc = "20314210396";
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("usuario", usuario);
        parametros.put("reporte_institucion", reporte_institucion);
        parametros.put("reporte_ruc", reporte_ruc);
        parametros.put("fecha_inicio", fechaInicio);
        parametros.put("fecha_fin", fechaFin);

        reporteador.verReporte(asistencia, new File(prueba), parametros, null);

        System.exit(0);

    }
}
