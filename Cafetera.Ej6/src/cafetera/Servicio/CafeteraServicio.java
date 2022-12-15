/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera.Servicio;

import cafetera.Entidades.CafeteraEntidades;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    CafeteraEntidades ce = new CafeteraEntidades();
    public void iniciarCafetera(){
        System.out.println("ingrese la capacidad maxima en mililitros de su cafetera Nespresso");
        ce.setCapMax(leer.nextInt());
    }
    public void llenarCafetera(){
        ce.setCantAct(ce.getCapMax());
        System.out.println("se lleno la cafetera a " + ce.getCantAct() + " ml ");
    }
    public void servirTaza(){
        System.out.println("ingrese el tamaño de la taza en mililitros");
        int taza = leer.nextInt();
        System.out.println("llenando la taza...");
        if (ce.getCantAct() < taza) {
            taza = ce.getCantAct();
            System.out.println("la taza no se alcanzo a llenar completamente , se lleno hasta: " + taza + "ml");
        }else{
            System.out.println("la taza se lleno completamente!");
        }
    }
    public void vaciarCafetera(){
        ce.setCantAct(0);
        System.out.println("se vacio la cafetera");
    }
    public void agregarCafe(){
        System.out.println("ingrese la cantidad de cafe que quiere agregar en ml");
        int cafe = leer.nextInt();
        ce.setCantAct(ce.getCantAct()+cafe);
    }
    public void menu(){
        iniciarCafetera();
        llenarCafetera();
        int point = 0;
        do {
            System.out.println("seleccione la opcion deseada");
            System.out.println("       1) servir taza       ");
            System.out.println("       2) vaciar cafetera   ");
            System.out.println("       3) agregar cafe      ");
            System.out.println("       4) salir             ");
            point = leer.nextInt();
            switch (point) {
                case 1:
                    servirTaza();
                    
                    break;
                case 2:
                    vaciarCafetera();
                    break;
                case 3:
                    agregarCafe();
                    break;
            }
        } while (point != 4 );
        System.out.println("hasta pronto!");
    }
}
