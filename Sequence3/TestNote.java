/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence3;

/**
 *
 * @author perringe
 */
public class TestNote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Note n1 = new Note();
        n1.setValeur(50);
        System.out.println("La note est : " + n1.getValeur());
        
        Note n2 = new Note(75);
        n2.saisir();
        System.out.println(n2.ToString());
        
    }
    
}
