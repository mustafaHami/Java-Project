/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence2;

import java.util.Scanner;

/**
 *
 * @author perringe
 */
public class TestString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entree = new Scanner (System.in);
        String maChaine;
        System.out.println("Ecrivez une chaîne de charactères : ");
        maChaine = entree.nextLine();
        System.out.println("Voici maChaine : " + maChaine);
        
        int nbchar = maChaine.length();
        System.out.println("Voici la longueur de maChaine : " + nbchar);
        
        System.out.println("Voici maChaine en majuscule : " + maChaine.toUpperCase());
        
        String maChaine2;
        System.out.println("Ecrivez une autre chaîne de charactères : ");
        maChaine2 = entree.nextLine();
        
        if (maChaine.equalsIgnoreCase(maChaine2)){
            System.out.println("Les deux chaînes sont égales si on ne tient pas compte de la casse");
        }else {
            System.out.println("Les deux chaînes ne sont pas égales si on ne tient pas compte de la casse");
        }
        
        if (maChaine.equals(maChaine.toLowerCase())){
            System.out.println("La chaîne maChaine est bien en minuscule");
        }
        
        System.out.println("maChaine sans les blancs en majuscules : " + maChaine.trim().toUpperCase());
        
    }
    
}
