/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.modelos;

import com.personal.utiles.ModeloTabla;
import entidades.reportes.RptAsistencia;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Francis
 */
public class MTAsistencia extends ModeloTabla<RptAsistencia>{
    private final DecimalFormat formatoDecimal;

    public MTAsistencia(List<RptAsistencia> datos) {
        super(datos);
        this.formatoDecimal = new DecimalFormat("#.00");
        this.nombreColumnas = new String[]{"DNI","Empleado","Ingreso 1","Salida 1","Ingreso 2","Salida 2","Tardanza","Marc. Pend.","Ausencia","Extra"};
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 2: 
            case 3: 
            case 4: 
            case 5:
                return Date.class;
            case 7:
                return Integer.class;
            case 8:
                return Boolean.class;
            case 6:
            case 9:
                return Double.class;
            default:
                return Object.class;
        }
    }
    
    @Override
    public Object getValorEn(int rowIndex, int columnIndex) {
        RptAsistencia asistencia = this.datos.get(rowIndex);
        int marcacionesPendientes = this.numeroMarcacionesPendientes(asistencia);
        switch(columnIndex){
            case 0:
                return asistencia.getEmpleado().getNroDocumento();
            case 1:
                return asistencia.getEmpleado().getNombreCompleto();
            case 2:
                return asistencia.getDetalle1().getHoraEntrada();
            case 3:
                return asistencia.getDetalle1().getHoraSalida();
            case 4:
                return asistencia.getDetalle2().getHoraEntrada();
            case 5:
                return asistencia.getDetalle2().getHoraSalida();
            case 6:
                return tardanza(asistencia.getDetalle1().getDetalleJornada().getEntradaTolerancia(),asistencia.getDetalle1().getHoraEntrada());
            case 7:
                return marcacionesPendientes == 4 ? null : marcacionesPendientes;
            case 8:
                return marcacionesPendientes == 4;
            case 9:
                return extra(asistencia.getDetalle2().getHoraSalida(),asistencia.getDetalle2().getHoraSalida());
            default:
                return null;
        }
    }

    private String tardanza(Date horaTolerancia, Date horaMarcada) {
        Long diferencia = horaMarcada == null ? 0 : horaMarcada.after(horaTolerancia) ? horaMarcada.getTime() - horaTolerancia.getTime() : 0;
        double diferenciaMin = diferencia.intValue() / (60*1000);
        return this.formatoDecimal.format(diferenciaMin);
    }

    private Integer numeroMarcacionesPendientes(RptAsistencia asistencia) {
        int conteo = 0;
        
        if(asistencia.getDetalle1().getHoraEntrada() == null){
            conteo++;
        }
        
        if(asistencia.getDetalle1().getHoraSalida() == null){
            conteo++;
        }
        
        if(asistencia.getDetalle2().getHoraEntrada() == null){
            conteo++;
        }
        
        if(asistencia.getDetalle2().getHoraSalida() == null){
            conteo++;
        }
        
        return conteo;
    }

    private String extra(Date horaSalida, Date horaMarcada) {
        Long diferencia = horaMarcada == null ? 0 : horaMarcada.after(horaSalida) ? horaMarcada.getTime() - horaSalida.getTime() : 0;
        double diferenciaMin = diferencia.intValue() / (60*1000);
        return this.formatoDecimal.format(diferenciaMin);
    }
    
}
