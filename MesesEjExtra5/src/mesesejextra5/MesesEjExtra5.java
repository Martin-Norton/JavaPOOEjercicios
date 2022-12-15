/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesesejextra5;

import Meses.Entidades.MesesEntidades;
import Meses.Servicio.MesesServicio;

/**
 *
 * @author Martin Norton
 */
public class MesesEjExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MesesServicio ms = new MesesServicio();
        MesesEntidades me = new MesesEntidades();
        ms.llenarMeses();
        ms.adivinanza();
        
    }
    
}
