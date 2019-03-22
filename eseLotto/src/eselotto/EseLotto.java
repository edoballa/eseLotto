/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eselotto;

import java.util.Scanner;

/**
 *
 * @author ballabio_edoardo
 */
public class EseLotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero di estrazioni da effettuare");
        int estrazioni = input.nextInt();
        System.out.println("Inserire due numeri su cui puntare");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        CDatiCondivisi dati = new CDatiCondivisi();
        dati.setPrimoNumero(num1);
        dati.setSecondoNumero(num2);
    }
    
}
