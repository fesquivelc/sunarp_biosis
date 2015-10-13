/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import com.personal.utiles.ReporteUtil;
import controladores.EmpleadoControlador;
import controladores.JornadaControlador;
import entidades.escalafon.Empleado;
import entidades.reportes.RptTardanza;
import java.io.File;
import java.math.BigDecimal;
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
public class PruebaReporteTardanzas {
    public static void main(String[] args) {
        ReporteUtil reporteador = new ReporteUtil();
        EmpleadoControlador empc = new EmpleadoControlador();
        JornadaControlador jornc = JornadaControlador.getInstance();
        String prueba = "H:\\PROYECTOS\\JasperStudio\\MyReports\\reporte_tardanzas_mensual.jasper";
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 0, 1);
        Date fechaInicio = calendar.getTime();
        calendar.set(2015, 0, 31);
        Date fechaFin = calendar.getTime();
        String usuario = "admin";
        String reporte_logo = "admin";
        String reporte_institucion = "ZONA REGISTRAL N° II - SEDE CHICLAYO";
        String reporte_ruc = "20314210396";
        Empleado empleado = empc.buscarPorId("43628623");
        Calendar iterador = Calendar.getInstance();
        
        iterador.set(2015, 0, 1);
        
        RptTardanza rptTardanza;
        List<RptTardanza> tardanzaList = new ArrayList<>();
        BigDecimal[] tardanzasArray = new BigDecimal[31];
        tardanzasArray[0] = BigDecimal.ZERO;
        for(int i = 1; i <= 2; i++){
            iterador.set(Calendar.MONTH, i - 1);
            
            rptTardanza = new RptTardanza();
            rptTardanza.setEmpleado(empleado);
            rptTardanza.setFecha(iterador.getTime());
            rptTardanza.setTardanzas(tardanzasArray);
            
            tardanzaList.add(rptTardanza);
        }
        
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("usuario", usuario);
        parametros.put("reporte_institucion", reporte_institucion);
        parametros.put("reporte_ruc", reporte_ruc);
        
        reporteador.verReporte(tardanzaList, new File(prueba), parametros, null);
        
        System.exit(0);
    }
}
