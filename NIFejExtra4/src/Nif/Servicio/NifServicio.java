/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nif.Servicio;

import Nif.Entidades.NifEntidades;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class NifServicio {
    Scanner leer = new Scanner(System.in);
    NifEntidades ne = new NifEntidades();
    String [] vector = new String [23];

    public void crearNif(){
        vector[0]= "T";
        vector[1]= "R";
        vector[2]= "W";
        vector[3]= "A";
        vector[4]= "G";
        vector[5]= "M";
        vector[6]= "Y";
        vector[7]= "F";
        vector[8]= "P";
        vector[9]= "D";
        vector[10]= "X";
        vector[11]= "B";
        vector[12]= "N";
        vector[13]= "J";
        vector[14]= "Z";
        vector[15]= "S";
        vector[16]= "Q";
        vector[17]= "V";
        vector[18]= "H";
        vector[19]= "L";
        vector[20]= "C";
        vector[21]= "K";
        vector[22]= "E";
        System.out.println("ingrese su numero de dni");
        ne.setDNI(leer.nextLong());
        long num = ne.getDNI()%23;
        for (int i = 0; i < 23; i++) {
            if (num == i) {
                ne.setLetra(vector[i]);
            }
            
        }      
    }
    public void mostrarNIF(){
        System.out.println(ne.getDNI() + "-"+ne.getLetra());
    
    }
    
    
}
