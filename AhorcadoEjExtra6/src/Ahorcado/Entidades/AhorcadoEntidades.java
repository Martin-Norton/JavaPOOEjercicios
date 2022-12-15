/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado.Entidades;

/**
 *
 * @author Martin Norton
 */
public class AhorcadoEntidades {
   private int letrasEnc , maxJug , noEnc;
   private String palabra , letra;
   private String [] pABusc = new String [5];

    public AhorcadoEntidades() {
    }

    public AhorcadoEntidades(int letrasEnc, int maxJug, int noEnc, String palabra, String letra) {
        this.letrasEnc = letrasEnc;
        this.maxJug = maxJug;
        this.palabra = palabra;
        this.letra = letra;
        this.noEnc = noEnc;
    }

    public int getLetrasEnc() {
        return letrasEnc;
    }

    public void setLetrasEnc(int letrasEnc) {
        this.letrasEnc = letrasEnc;
    }

    public int getMaxJug() {
        return maxJug;
    }

    public void setMaxJug(int maxJug) {
        this.maxJug = maxJug;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String[] getpABusc() {
        return pABusc;
    }

    public void setpABusc(String[] pABusc) {
        this.pABusc = pABusc;
    }

    public int getNoEnc() {
        return noEnc;
    }

    public void setNoEnc(int noEnc) {
        this.noEnc = noEnc;
    }
    
    

}
