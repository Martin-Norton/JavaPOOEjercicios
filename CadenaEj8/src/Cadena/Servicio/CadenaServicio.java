/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadena.Servicio;

import Cadena.Entidades.CadenaEntidades;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CadenaEntidades ce = new CadenaEntidades();

    public void mostrarVocales() {
        int cantVocales = 0;
        System.out.println("ingrese la frase");
        ce.setFrase(leer.nextLine());
        ce.setLongitud(ce.getFrase().length());
        for (int i = 0; i < ce.getLongitud(); i++) {
            if (ce.getFrase().substring(i, i + 1).equalsIgnoreCase("a") || ce.getFrase().substring(i, i + 1).equalsIgnoreCase("e") || ce.getFrase().substring(i, i + 1).equalsIgnoreCase("i") || ce.getFrase().substring(i, i + 1).equalsIgnoreCase("o") || ce.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {
                cantVocales += 1;
            }
        }
        System.out.println("la cantidad de vocales de la frase son :" + cantVocales);

    }

    public void invertirFrase() {
        for (int i = ce.getLongitud() - 1; i >= 0; i--) {
            System.out.print(ce.getFrase().substring(i, i + 1));
        }
        System.out.println("");
    }

    public void vecesRepetido() {
        System.out.println("ingrese el caracter a buscar");
        String letra = leer.next();
        int cont = 0;
        for (int i = 0; i < ce.getLongitud(); i++) {
            if (ce.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont += 1;
            }
        }
        System.out.println("el caracter " + letra + " aparece en la frase: " + cont + " veces.");
    }

    public void compararLongitud() {
        System.out.println("ingrese una frase para comparar su longitud");
        String frase2 = leer.next();
        int long2 = frase2.length();
        if (long2 == ce.getLongitud()) {
            System.out.println("las longitudes de las frases son iguales");
        } else if (long2 > ce.getLongitud()) {
            System.out.println("la longitud de la 2da frase es mayor que la primera");
        } else if (long2 < ce.getLongitud()) {
            System.out.println("la longitud de la 2da frase es menor que la primera");
        }
    }

    public void unirFrases() {
        System.out.println("ingrese una frase para unir");
        String frase2 = leer.next();
        System.out.println(ce.getFrase() + " " + frase2);
    }

    public void reemplazarA() {
        System.out.println("ingrese el caracter por el que quiere reemplazar las (a)");
        String letra = leer.next();
        String fraseInv = ce.getFrase().replace("a", letra);
        System.out.println(fraseInv);
    }

    public void contiene() {
        System.out.println("ingrese el caracter a buscar");
        String letra = leer.next();
        Boolean contiene = false;
        if (ce.getFrase().contains(letra)) {
            contiene = true;
        }
        System.out.println(contiene);

    }

}
