/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence1;

import java.util.Scanner;

/**
 *
 * @author PERRIN GEROME
 */
public class Triangle {
    private static void afficheLigne(int val) {
    // {} => {affiche une ligne comportant val caractères *}
        for (int x = 0; x < val; x++ ){
             System.out.print("*");
        }
    }
    
    private static void demiTriangleIsocele(int val) {
    // {} => {affiche le demi triangle isocèle de hauteur val}
        for (int x = 1; x <= val;x++){
            afficheLigne(x);
            System.out.println();
        }
    }
    
    private static void triangleIsocele(int val) {
    // {} => {affiche le triangle isocèle de hauteur val}
        demiTriangleIsocele(val);
        for (int x = val -1; x != 0; x--){
            afficheLigne(x);
            System.out.println();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entree = new Scanner (System.in);
        
        System.out.print("Saisir un entier : ");
        
        int val;
        
        val = entree.nextInt();
        if (val == 0){
            System.out.println("Vous ne pouvez pas construire un triangle isocele de longueur 0");
        } else {triangleIsocele(val);
        
        }
        
        
        
    }
    
}

