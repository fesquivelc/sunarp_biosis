/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.reportes;

import entidades.DetalleJornada;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Francis
 */
public class RptAsistenciaDetalle {
    private final DateFormat dfHora = new SimpleDateFormat("HH:mm");
    private DetalleJornada detalleJornada;
    private Date horaEntrada;
    private Date horaSalida;

    public DetalleJornada getDetalleJornada() {
        return detalleJornada;
    }

    public void setDetalleJornada(DetalleJornada detalleJornada) {
        this.detalleJornada = detalleJornada;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }
    
}
