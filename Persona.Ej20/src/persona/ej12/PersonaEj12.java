/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona.ej12;

import persona.Entidades.PersonaEntidades;
import persona.Servicio.PersonaServicio;

/**
 *
 * @author Martin Norton
 */
public class PersonaEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        PersonaEntidades pe = new PersonaEntidades();
        ps.crearPersona();
        ps.calcularEdad();
        ps.menorQue(pe.getEdad());
        ps.mostarPersona();
       
    }
    
}
