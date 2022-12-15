/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raices.Servicio;

import Raices.Entidades.RaicesEntidades;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class RaicesServicio {
    RaicesEntidades re = new RaicesEntidades();
    Scanner leer = new Scanner(System.in);
    /*
    getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    public void llenarNumeros(){
        System.out.println("ingrese A");
        re.setA(leer.nextDouble());
        System.out.println("ingrese B");
        re.setB(leer.nextDouble());
        System.out.println("ingrese C");
        re.setC(leer.nextDouble());
    
    }
    public double getDiscriminante(){
        double discriminante = (Math.pow(re.getB(),2)-4*re.getA()*re.getC());
        
        return discriminante;
    }
    public boolean tieneRaices(){
        boolean tieneRaices=false;
        if (getDiscriminante() >= 0) {
            tieneRaices=true;
        }
     return tieneRaices;
    }
    public boolean tieneRaiz(){
        boolean tieneRaiz = false;
         if (getDiscriminante() == 0) {
            tieneRaiz=true;
            
        }
        return tieneRaiz;
    }
    public void obtenerRaices(){
        /*(-b±√((b^2)-(4*a*c)))/(2*a)*/
        if (tieneRaices() == true) {
           double x1 = (-re.getB()+Math.sqrt((Math.pow(re.getB(), 2))-(4*re.getA()*re.getC())))/(2*re.getA());
           double x2 = (-re.getB()-Math.sqrt((Math.pow(re.getB(), 2))-(4*re.getA()*re.getC())))/(2*re.getA());
            System.out.println("las posibles soluciones son : "+ x1 + "--" + x2);
        }
    }
    public void obtenerRaiz(){
        /*(-b±√((b^2)-(4*a*c)))/(2*a)*/
        if (tieneRaiz() == true) {
           double x1 = (-re.getB()+Math.sqrt((Math.pow(re.getB(), 2))-(4*re.getA()*re.getC())))/(2*re.getA());
            System.out.println("la solucion posible es: " + x1);
        }
    }
    /*
    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
    */
    public void calcular(){
        llenarNumeros();
        
        getDiscriminante();
        tieneRaices();
        tieneRaiz();
        
        if (tieneRaices() == true) {
            obtenerRaices();   
        }else if (tieneRaiz() == true) {
            obtenerRaiz();  
        }else{
            System.out.println("no existe solucion");
        
        }
        
    
    }
}

    
    
    

