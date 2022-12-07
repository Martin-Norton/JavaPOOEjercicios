/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RectangulosEntidades;

import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class Rectangulos {

    private Double base;
    private Double altura;

    public Rectangulos() {
    }

    public Rectangulos(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la base del rectangulo");
        setBase(leer.nextDouble());
        System.out.println("ingrese la altura del rectangulo");
        setAltura(leer.nextDouble());
    }

    public void superficie() {
        Double sup = base * altura;
        System.out.println("la superficie del rectangulo es " + sup);
    }

    public void perimetro() {
        Double perim = (base + altura) * 2;
        System.out.println("el perimetro del rectangulo es " + perim);
    }
    public void dibujarRec(){
        String aux="";
        
        for (int fila = 0; fila < altura; fila++) {
             System.out.print("*");
        }
        System.out.println(" ");
        
        for (int fila = 0; fila <= altura -3; fila++) {
             aux+="*";
             
            for (int col = 0; col<=base-3; col++) {
                aux += "  ";
              
            }
            aux += "*";
            System.out.println(aux);
            aux = " ";
            
        }
             
        
        for (int fila = 0; fila < altura; fila++) {
            System.out.print("*");
        }
    
    }

}
