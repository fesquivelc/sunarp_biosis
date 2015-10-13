/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.reportes;

import entidades.escalafon.Empleado;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Francis
 */
public class RptTardanza {
    private Empleado empleado;
    private Date fecha;
    private BigDecimal[] tardanzas;
    private BigDecimal totalMes;
    private final Calendar calendar = Calendar.getInstance();

    public Empleado getEmpleado() {
        return empleado;
    }

    public BigDecimal getTotalMes() {
        return totalMes;
    }

    public void setTotalMes(BigDecimal totalMes) {
        this.totalMes = totalMes;
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

    public BigDecimal[] getTardanzas() {
        return tardanzas;
    }

    public void setTardanzas(BigDecimal[] tardanzas) {
        this.tardanzas = tardanzas;
    }
    
    public int getMes(){
        calendar.setTime(fecha);
        return calendar.get(Calendar.MONTH) + 1;
    }
    
}
