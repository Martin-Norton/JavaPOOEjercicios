/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Op.Entidades;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class OP {

    Scanner leer = new Scanner(System.in);
    Entidades Eo = new Entidades();

    public void crearOperacion() {
        System.out.println("ingrese el primer numero");
        Eo.setNumero1(leer.nextInt());
        System.out.println("ingrese el segundo numero");
        Eo.setNumero2(leer.nextInt());
    }

    public void sumar() {
        int suma = Eo.getNumero1() + Eo.getNumero2();
        System.out.println("la suma de ambos numeros es : " + suma);

    }

    public void restar() {
        int resta = Eo.getNumero1() - Eo.getNumero2();
        System.out.println("la resta de ambos numeros es : " + resta);

    }

    public void multiplicar() {
        if (Eo.getNumero1() != 0 && Eo.getNumero2() != 0) {
            int mult = Eo.getNumero1() * Eo.getNumero2();
            System.out.println("la multiplicacion de ambos numeros es : " + mult);

        } else {
            System.out.println("uno de los numeros es 0!!");
        }

    }

    public void dividir() {
        if (Eo.getNumero1() != 0 && Eo.getNumero2() != 0) {
            int div = Eo.getNumero1() / Eo.getNumero2();
            System.out.println("la division de ambos numeros es : " + div);

        } else {
            System.out.println("uno de los numeros es 0!!");
        }

    }

}
