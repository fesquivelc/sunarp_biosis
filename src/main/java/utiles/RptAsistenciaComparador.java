/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

import entidades.reportes.RptAsistencia;
import java.util.Comparator;

/**
 *
 * @author RyuujiMD
 */
public class RptAsistenciaComparador implements Comparator<RptAsistencia> {

    @Override
    public int compare(RptAsistencia primero, RptAsistencia segundo) {
        int comparacionEmpleado = primero.getEmpleado().getNombreCompleto().compareTo(segundo.getEmpleado().getNombreCompleto());
        if (comparacionEmpleado == 0) {
            int comparacionFecha = primero.getFecha().compareTo(segundo.getFecha());
            return comparacionFecha;
        } else {
            return comparacionEmpleado;
        }
    }

}
