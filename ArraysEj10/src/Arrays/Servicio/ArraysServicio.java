/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Servicio;

import Arrays.Entidades.ArraysEntidades;
import java.util.Arrays;

/**
 *
 * @author Martin Norton
 */
public class ArraysServicio {

    ArraysEntidades ae = new ArraysEntidades();
    
    public void vectores() {
        for (int i = 0; i < 50; i++) {
            ae.getVectorA()[i] = Math.random() * 10.3;
            System.out.print(ae.getVectorA()[i] + " - ");
        }
        System.out.println("");

        Arrays.sort(ae.getVectorA());

        for (int i = 0; i < 50; i++) {

            System.out.print(ae.getVectorA()[i] + " - ");
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            if (i <= 10) {
                ae.getVectorB()[i] = ae.getVectorA()[i];
                 
            } else {
               ae.getVectorB()[i] = 0.5;
            }
        }
         for (int i = 0; i < 20; i++) {

            System.out.print(ae.getVectorB()[i] + " - ");
        }
        
    }

}
