/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionesEj3;

import Operacion.Entidades.Operacion;

/**
 *
 * @author Martin Norton
 */
public class OperacionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Operacion op = new Operacion();
       op.crearOperacion();
       op.sumar();
       op.restar();
       op.multiplicar();
       op.dividir();
               
    }
    
}
