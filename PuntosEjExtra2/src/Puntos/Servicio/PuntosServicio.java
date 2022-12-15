/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puntos.Servicio;

import Puntos.Entidades.PuntosEntidades;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class PuntosServicio {
    Scanner leer = new Scanner(System.in);
    PuntosEntidades pe = new PuntosEntidades();
    
    public void crearPuntos(){
        System.out.println("ingrese las coordenadas del punto n°1");
        System.out.println("X=");
        pe.setX1(leer.nextInt());
        System.out.println("Y=");
        pe.setY1(leer.nextInt());
        System.out.println("ingrese las coordenadas del punto n°2");
        System.out.println("X=");
        pe.setX2(leer.nextInt());
        System.out.println("Y=");
        pe.setY2(leer.nextInt());
    }
    public void calcularDist(){
        double dist = Math.sqrt(Math.pow((pe.getX2()- pe.getX1()), 2)+ Math.pow((pe.getY2()-pe.getY1()), 2));
        System.out.println("la distancia entre ambos puntos es :" + dist);
    }
    
    
}
