/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona.Servicios;

import Persona.Entidades.PersonaEntidades;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */

public class PersonaServicios {

    Scanner leer = new Scanner(System.in);
    PersonaEntidades Pe = new PersonaEntidades();
   

    int contPers=0;

    public void crearPersona() {
        contPers+=1;

        System.out.println("ingrese el nombre de la persona");
        Pe.setNombre(leer.next());

        System.out.println("ingrese la edad de la persona");
        Pe.setEdad(leer.nextInt());
        Boolean correcto=false ;

        
        do {
            System.out.println("ingrese el sexo de la persona: h / m / o");
             String sexx = leer.next().substring(0, 1).toLowerCase();
        if (sexx.equals("h") || sexx.equals("m") || sexx.equals("o")) {
            Pe.setSexo(sexx);
            correcto=true;
        } else {
            System.out.println("opcion no valida");
        }
            
        } while (correcto=false);
        
       
    }

    public int calcularIMC() {
        System.out.println("ingrese su altura en mts2");
        Float alt = leer.nextFloat();
        System.out.println("ingrese su peso en kg");
        Float peso = leer.nextFloat();
        int ret=0 ;
        Double imc = peso / (Math.pow(alt, 2));
        if (imc < 20) {
            System.out.println("esta por debajo de su peso ideal");
            ret=-1;
        } else {
            if (imc >= 20 || imc <= 25) {
                System.out.println("en en su peso ideal");
                ret=0;
            } else {
                if (imc > 25) {
                    System.out.println("esta por sobre su peso ideal");
                    ret=1;
                }
            }
        }
        return ret;
    }

    public Boolean esMayorDeEdad() {
        System.out.println(contPers);
        Boolean es;
        if (Pe.getEdad() >= 18) {
            System.out.println("es mayor de edad");
            es = true;
        } else {
            System.out.println("es menor de edad");
            es = false;
        }
      return es;
    }
}
