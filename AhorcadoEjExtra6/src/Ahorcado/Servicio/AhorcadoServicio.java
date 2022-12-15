/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado.Servicio;

import Ahorcado.Entidades.AhorcadoEntidades;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);
    AhorcadoEntidades ae = new AhorcadoEntidades();

    public void crearJuego() {
        System.out.println("ingrese la palabra a adivinar");
        ae.setPalabra(leer.next());
        System.out.println("ingrese la cantidad de jugadas maxima");
        ae.setMaxJug(leer.nextInt());
        for (int i = 0; i < ae.getPalabra().length(); i++) {
            ae.getpABusc()[i] = ae.getPalabra().substring(i, i + 1);
        }
        ae.setLetrasEnc(0);
    }

    public void longitud() {
        int longitud = ae.getpABusc().length;
        System.out.println("la palabra tiene " + longitud + " letras.");
    }

    public void buscarLetra() {
        ae.setNoEnc(ae.getPalabra().length());
        System.out.println("ingrese una letra");
        ae.setLetra(leer.next());
        int esta = 0;
        for (int i = 0; i < ae.getPalabra().length(); i++) {
            if (ae.getpABusc()[i].equals(ae.getLetra())) {
                esta += 1;
                ae.setLetrasEnc(ae.getLetrasEnc() + 1);
            }
        }
        if (esta != 0) {
            System.out.println("Letra encontrada!");
        } else {
            System.out.println("no se encontro la letra");
            ae.setMaxJug(ae.getMaxJug() - 1);
        }
    }

    public void encontradas() {
        int faltantes = ae.getPalabra().length() - ae.getLetrasEnc();
        System.out.println("numero de letras (encontradas, faltantes): [" + ae.getLetrasEnc() + " - " + faltantes + "]");

    }

    public void intentos() {

        System.out.println("las oportunidades restantes son : " + ae.getMaxJug());

    }

    public void juego() {
        crearJuego();
        longitud();
        while( ae.getLetrasEnc() != ae.getPalabra().length() && ae.getMaxJug()!=0){
            buscarLetra();
            encontradas();
            intentos();
        }
            
        if (ae.getMaxJug() == 0) {
            System.out.println("se ha quedado sin intentos!!!");
        } else if (ae.getLetrasEnc() == ae.getPalabra().length()) {
            System.out.println("ha descubierto la palabra!!!");
        }

    }

}
