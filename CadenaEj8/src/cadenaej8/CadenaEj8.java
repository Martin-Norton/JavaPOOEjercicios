/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaej8;

import Cadena.Servicio.CadenaServicio;

/**
 *
 * @author Martin Norton
 */
public class CadenaEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cs = new CadenaServicio();
        cs.mostrarVocales();
        cs.invertirFrase();
        cs.vecesRepetido();
        cs.compararLongitud();
        cs.unirFrases();
        cs.reemplazarA();
        cs.contiene();
    }
    
}
