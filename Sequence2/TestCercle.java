/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence2;

/**
 *
 * @author perringe
 */
public class TestCercle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cercle Cercle00 = new Cercle(10);
    
        Cercle CercleQcq = new Cercle(10,5,10);
        
        
        Cercle00.affiche();
        CercleQcq.affiche();
        
        CercleQcq.deplaceCentre(-10, 33);
        
        
        CercleQcq.affiche();
    }
}

