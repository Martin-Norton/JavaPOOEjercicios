/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date.ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class DateEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una fecha");
        System.out.println("dia");
        int dia = leer.nextInt();
        System.out.println("mes");
        int mes = leer.nextInt();
        System.out.println("anio");
        int anio = leer.nextInt();
        Date fecha = new Date(anio, mes, dia);
        fecha.setYear(fecha.getYear()-1900);
        fecha.setMonth(fecha.getMonth()-1);
        Date fechaActual = new Date();
        diferenciaAnios(fecha,fechaActual);
    }
   public static void diferenciaAnios(Date fecha , Date fechaActual){
       int dif = fechaActual.getYear()-fecha.getYear();
       System.out.println("la diferencia de años entre la fecha actual y la fecha ingresada es : " + dif);
       
    }
    
}
