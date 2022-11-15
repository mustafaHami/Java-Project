/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence1;

import java.util.Scanner;

/**
 *
 * @author perringe
 */
public class ppm3 {
    private static int ppm3(int val){
        if (val % 3 == 0) {
            return val;
        } else if(val % 3 == 1) {
            return val - 1;
        } else {
            // val %3 == 2
            return val + 1;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entree = new Scanner(System.in);
        
        System.out.print("Saisir un entier : ");
        
        int val;
        
        val = entree.nextInt();
        
        System.out.println("L'entier saisi est : " + ppm3(val));
    }
}   
