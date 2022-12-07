/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaej7;

import Persona.Servicios.PersonaServicios;

/**
 *
 * @author Martin Norton
 */
public class PersonaEj7 {

    /**
     * @param args the command line arguments
     */
    static int contPers = 0;

    public static void main(String[] args) {
        int ideal = 0;
        int sobre = 0;
        int under = 0;
        int mayores = 0;
        int menores = 0;

        PersonaServicios p1 = new PersonaServicios();
        PersonaServicios p2 = new PersonaServicios();
        PersonaServicios p3 = new PersonaServicios();
        PersonaServicios p4 = new PersonaServicios();

        System.out.println("persona 1");
        p1.crearPersona();
        p1.calcularIMC();
        p1.esMayorDeEdad();
        int pers1imc = p1.calcularIMC();
        if (pers1imc == -1) {
            under += 1;
        } else if (pers1imc == 0) {
            ideal += 1;
        } else if (pers1imc == 1) {
            sobre += 1;
        }
        Boolean pers1edad = p1.esMayorDeEdad();
         if (pers1edad== true) {
             mayores +=1;
        }else{
             menores+=1;
         }

        System.out.println("persona 2");
        p2.crearPersona();
        p2.calcularIMC();
        p2.esMayorDeEdad();
        int pers2imc = p2.calcularIMC();
         if (pers2imc == -1) {
            under += 1;
        } else if (pers2imc == 0) {
            ideal += 1;
        } else if (pers2imc == 1) {
            sobre += 1;
        }
         Boolean pers2edad = p2.esMayorDeEdad();
         if (pers2edad== true) {
             mayores +=1;
        }else{
             menores+=1;
         }

        System.out.println("persona 3");
        p3.crearPersona();
        p3.calcularIMC();
        p3.esMayorDeEdad();
        int pers3imc = p3.calcularIMC();
         if (pers3imc == -1) {
            under += 1;
        } else if (pers3imc == 0) {
            ideal += 1;
        } else if (pers3imc == 1) {
            sobre += 1;
        }
         Boolean pers3edad = p3.esMayorDeEdad();
          if (pers3edad== true) {
             mayores +=1;
        }else{
             menores+=1;
         }

        System.out.println("persona 4");
        p4.crearPersona();
        p4.calcularIMC();
        p4.esMayorDeEdad();
        int pers4imc = p4.calcularIMC();
         if (pers4imc == -1) {
            under += 1;
        } else if (pers4imc == 0) {
            ideal += 1;
        } else if (pers4imc == 1) {
            sobre += 1;
        }
         Boolean pers4edad = p4.esMayorDeEdad();
          if (pers4edad== true) {
             mayores +=1;
        }else{
             menores+=1;
         }

            int porIdeal = (ideal * 100) / 4;
            int porSobre = (sobre * 100) / 4;
            int porUnder = (under * 100) / 4;
            System.out.println("el porcentaje de personas con peso por debajo del ideal es: " + porUnder);
            System.out.println("el porcentaje de personas con peso ideal es: " + porIdeal);
            System.out.println("el porcentaje de personas con sobre es: " + porSobre);
        

            int porMayores = (mayores * 100) / 4;
            int porMenores = (menores * 100) / 4;
            System.out.println("el porcentaje de personas +18 es: " + porMayores);
            System.out.println("el porcentaje de personas -18 es: " + porMenores);
        
    }

}
