/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacioneseje3;

import Servicios.OP;

/**
 *
 * @author Martin Norton
 */
public class OperacionesEje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OP so = new OP();
        so.crearOperacion();
        so.sumar();
        so.multiplicar();
        so.restar();
        so.dividir();
    }
    
}
