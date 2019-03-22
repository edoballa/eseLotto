/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eselotto;

/**
 *
 * @author ballabio_edoardo
 */
public class CDatiCondivisi {
    private int PrimoNumero;
    private int SecondoNumero;
    private boolean PrimoTrovato;
    private boolean SecondoTrovato;
    private int[] ruota;

    public CDatiCondivisi(int PrimoNumero, int SecondoNumero, boolean PrimoTrovato, boolean SecondoTrovato, int[] ruota) {
        this.PrimoNumero = PrimoNumero;
        this.SecondoNumero = SecondoNumero;
        this.PrimoTrovato = PrimoTrovato;
        this.SecondoTrovato = SecondoTrovato;
        this.ruota = ruota;
    }
    
    public CDatiCondivisi() {
        this.PrimoNumero = 0;
        this.SecondoNumero = 0;
        this.PrimoTrovato = true;
        this.SecondoTrovato = true;
    }

    public int getPrimoNumero() {
        return PrimoNumero;
    }

    public void setPrimoNumero(int PrimoNumero) {
        this.PrimoNumero = PrimoNumero;
    }

    public int getSecondoNumero() {
        return SecondoNumero;
    }

    public void setSecondoNumero(int SecondoNumero) {
        this.SecondoNumero = SecondoNumero;
    }

    public boolean isPrimoTrovato() {
        return PrimoTrovato;
    }

    public void setPrimoTrovato(boolean PrimoTrovato) {
        this.PrimoTrovato = PrimoTrovato;
    }

    public boolean isSecondoTrovato() {
        return SecondoTrovato;
    }

    public void setSecondoTrovato(boolean SecondoTrovato) {
        this.SecondoTrovato = SecondoTrovato;
    }

    public int[] getRuota() {
        return ruota;
    }

    public void setRuota(int[] ruota) {
        this.ruota = ruota;
    }
    
    
}
