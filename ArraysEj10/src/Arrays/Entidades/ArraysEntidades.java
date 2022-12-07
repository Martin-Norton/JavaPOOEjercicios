/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Entidades;

/**
 *
 * @author Martin Norton
 */
public class ArraysEntidades {

    private double[] vectorA = new double[50];
    private double[] vectorB = new double[20];

    public ArraysEntidades() {
    }

    public double[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(double[] vectorA) {
        this.vectorA = vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }

    @Override
    public String toString() {
        return "ArraysEntidades{" + "vectorA=" + vectorA + ", vectorB=" + vectorB + '}';
    }
    
  
    

}
