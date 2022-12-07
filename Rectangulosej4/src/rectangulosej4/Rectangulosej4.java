/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulosej4;

import RectangulosEntidades.Rectangulos;

/**
 *
 * @author Martin Norton
 */
public class Rectangulosej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulos rec = new Rectangulos();
        rec.crearRectangulo();
        rec.superficie();
        rec.perimetro();
        rec.dibujarRec();
        
    }
    
}
