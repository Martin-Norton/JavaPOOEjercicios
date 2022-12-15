/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Meses.Servicio;

import Meses.Entidades.MesesEntidades;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class MesesServicio {
    Scanner leer = new Scanner(System.in);
    MesesEntidades me = new MesesEntidades();
    public void llenarMeses(){
      me.getMeses()[0]= "enero";
      me.getMeses()[1]= "febrero";
      me.getMeses()[2]= "marzo";
      me.getMeses()[3]= "abril";
      me.getMeses()[4]= "mayo";
      me.getMeses()[5]= "junio";
      me.getMeses()[6]= "julio";
      me.getMeses()[7]= "agosto";
      me.getMeses()[8]= "septiembre";
      me.getMeses()[9]= "octubre";
      me.getMeses()[10]= "noviembre";
      me.getMeses()[11]= "diciembre";
      me.setMesSecreto(me.getMeses()[9]);
    }
    
    public void adivinanza(){
        System.out.println("ingrese un mes en minusculas para adivinar el MES SECRETO!!");
        me.setMes(leer.next());
         if (me.getMesSecreto().equals( me.getMes())) {
            System.out.println("acerto");
        }else{
              do {
                  System.out.println("no acerto. digite otro mes");
                  me.setMes(leer.next());
            
        } while (!me.getMesSecreto().equals( me.getMes()));
         }
         System.out.println("acerto");
       
        
       
      
    }
    
}
