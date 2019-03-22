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
}
