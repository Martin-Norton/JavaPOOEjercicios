/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferenciaej2poo.Entidades;

import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class EntidadesCircunf {

    private int radio;

    public EntidadesCircunf(int radio) {
        this.radio = radio;
    }

    public EntidadesCircunf() {
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "EntidadesCircunf{" + "radio=" + radio + '}';
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el radio de la circunferencia");
        setRadio(leer.nextInt());
    }
    public void Area(){
        
        Double area = Math.PI * Math.pow(radio, 2);
        System.out.println("el area es " + area);
   }
    public void Perim(){
        
        Double perim = 2*Math.PI * radio ;
        System.out.println("el perimetro es " + perim);
   }
    

}
