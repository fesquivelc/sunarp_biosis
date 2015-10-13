/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.math.BigDecimal;

/**
 *
 * @author Francis
 */
public class PruebaDouble {
    public static void main(String[] args) {
        long numero = 100231012;
        Long numero2 = numero;
        
        Double doble = numero2.doubleValue();
        BigDecimal bigDecimal = BigDecimal.valueOf(numero);
        System.out.println("NUMERO: "+bigDecimal.divide(BigDecimal.valueOf(3.0)));
    }
}
