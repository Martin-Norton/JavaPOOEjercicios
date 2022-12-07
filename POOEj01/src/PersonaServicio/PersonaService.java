/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaServicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
    Persona personaCompleta = new Persona();
        System.out.println("ingrese el nombre de la persona");
        
        personaCompleta.getNombre();
        
        return personaCompleta;
    
    }
}
