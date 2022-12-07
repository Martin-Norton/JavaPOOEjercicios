/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion.Entidades;

import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero 1");
        setNumero1(leer.nextInt());
         System.out.println("ingrese el numero 2");
        setNumero2(leer.nextInt());
    }
     public int sumar(){
         System.out.println("suma");
     int suma = numero1 + numero2;
         return suma;
     }
     public int restar(){
          System.out.println("resta");
     int resta = numero1 - numero2;
         return resta;
     }
     public int multiplicar(){
          System.out.println("multiplicacion");
         int mult =0;
      if (numero1 == 0 || numero2 == 0) {
          System.out.println("error");
      }else{
          mult= numero1 * numero2; 
              }
      return mult;
     }
     public int dividir(){
          System.out.println("division");
          int div =0;
          if (numero1 == 0 || numero2 == 0) {
          System.out.println("error");
      }else{
          div= numero1 / numero2; 
              }
          return div;
     }
}
