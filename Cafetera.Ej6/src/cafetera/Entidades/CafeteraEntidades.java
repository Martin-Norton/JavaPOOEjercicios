/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera.Entidades;

/**
 *
 * @author Martin Norton
 */
public class CafeteraEntidades {
    private int capMax , cantAct;

    public CafeteraEntidades() {
    }

    public CafeteraEntidades(int capMax, int cantAct) {
        this.capMax = capMax;
        this.cantAct = cantAct;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCantAct() {
        return cantAct;
    }

    public void setCantAct(int cantAct) {
        this.cantAct = cantAct;
    }
    
}
