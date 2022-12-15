/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movilej14;

import Movil.Entidades.MovilEntidades;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
class MovilServicio {
    Scanner leer = new Scanner(System.in);
    MovilEntidades me = new MovilEntidades();
    public void ingresarCodigo(){
        System.out.println("ingrese el codigo del celular");
        for (int i = 0; i < me.getCodigo().length; i++) {
            System.out.println("ingrese parte del codigo n° " + (i+1));
            me.getCodigo()[i]= leer.nextInt();
        }
    }
    public void cargarCelular(){
        //marca, precio, modelo, memoriaRam, almacenamiento
        System.out.println("ingrese la marca del celular");
        me.setMarca(leer.next());
        System.out.println("ingrese el modelo del celular");
        me.setModelo(leer.next());
        System.out.println("ingrese la memoria ram del telefono");
        me.setMemoriaRam(leer.nextInt());
        System.out.println("ingrese la capacidad de almacenamiento del celular");
        me.setAlmacenamiento(leer.nextInt());
        System.out.println("ingrese el precio del celular");
        me.setPrecio(leer.nextInt());
        ingresarCodigo();
    }
    
}
