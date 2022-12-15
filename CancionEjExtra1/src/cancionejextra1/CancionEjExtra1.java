/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancionejextra1;

import Cancion.Entidades.CancionEntidades;

/**
 *
 * @author Martin Norton
 */
public class CancionEjExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CancionEntidades ce1 = new CancionEntidades("pont de la caile", "hidden empire");
        String esa = ce1.toString();
        System.out.println(esa);
        
    }
    
}
