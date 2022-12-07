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
    double[] vectorA = new double[50];
    double[] vectorB = new double[20];

    public void vectores() {
        for (int i = 0; i < 50; i++) {
            vectorA[i] = Math.random() * 10.3;
            System.out.print(vectorA[i] + " - ");
        }
        System.out.println("");

        Arrays.sort(vectorA);

        for (int i = 0; i < 50; i++) {

            System.out.print(vectorA[i] + " - ");
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            if (i <= 10) {
                vectorB[i] = vectorA[i];
                 
            } else {
                vectorB[i] = 0.5;
            }
        }
         for (int i = 0; i < 20; i++) {

            System.out.print(vectorB[i] + " - ");
        }
        ae.setVectorA(vectorA);
        ae.setVectorB(vectorB);
        
    }

}
