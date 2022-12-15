/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Meses.Entidades;

/**
 *
 * @author Martin Norton
 */
public class MesesEntidades {
    private String [] meses = new String[12];
    private String mesSecreto;
    private String mes;
    

    public MesesEntidades() {
    }

    public MesesEntidades(String mesSecreto, String mes) {
        this.mesSecreto = mesSecreto;
        this.mes = mes;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    
    
}
