/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntosejextra2;

import Puntos.Servicio.PuntosServicio;

/**
 *
 * @author Martin Norton
 */
public class PuntosEjExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntosServicio ps = new PuntosServicio();
        ps.crearPuntos();
        ps.calcularDist();
    }
    
}
