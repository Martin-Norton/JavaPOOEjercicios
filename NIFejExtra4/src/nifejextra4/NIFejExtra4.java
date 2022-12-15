/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifejextra4;

import Nif.Servicio.NifServicio;

/**
 *
 * @author Martin Norton
 */
public class NIFejExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifServicio ns = new NifServicio();
        ns.crearNif();
        ns.mostrarNIF();
    }
    
}
