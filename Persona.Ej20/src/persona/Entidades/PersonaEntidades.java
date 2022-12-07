/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona.Entidades;

import java.util.Date;

/**
 *
 * @author Martin Norton
 */
public class PersonaEntidades {
    private String nombre;
    private Date fechaNac;
    private int edad;

    public PersonaEntidades() {
    }

    public PersonaEntidades(String nombre, Date fechaNac , int edad) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
