/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona.Servicio;

import java.util.Date;
import java.util.Scanner;
import persona.Entidades.PersonaEntidades;

/**
 *
 * @author Martin Norton
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    PersonaEntidades pe = new PersonaEntidades();
    public void crearPersona(){
        System.out.println("ingrese el nombre de la persona");
        pe.setNombre(leer.next());
        System.out.println("ingrese la fecha de nacimiento");
        System.out.println("dia");
        int dia = leer.nextInt();
        System.out.println("mes");
        int mes = leer.nextInt();
        System.out.println("anio");
        int anio = leer.nextInt();
        Date fecha = new Date(anio, mes, dia);
        fecha.setYear(fecha.getYear()-1900);
        fecha.setMonth(fecha.getMonth()-1);
        pe.setFechaNac(fecha);
    }
    public void calcularEdad(){
        Date fechaAct = new Date();
        Date fecha= pe.getFechaNac();
        int edad = fechaAct.getYear()-fecha.getYear();
        System.out.println( "la edad de " + pe.getNombre() +" es :" + edad);
        pe.setEdad(edad);
    }
    public void menorQue(int edad){
        System.out.println("ingrese la edad a comparar");
        int edad1 = leer.nextInt();
        boolean menorQue = false;
         if (edad1 > edad) {
             menorQue = true;
        }else{
          menorQue=false; 
         }
          System.out.println(menorQue);
        }
    public void mostarPersona(){
        System.out.println("el nombre de la persona creada es " + pe.getNombre());
        System.out.println("la fecha de nacimiento es "+ pe.getFechaNac());
        System.out.println("la edad es "+ pe.getEdad());
    
    }
        
    }

