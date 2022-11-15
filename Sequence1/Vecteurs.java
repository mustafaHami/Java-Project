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
public class Vecteurs {
    private static void initRandomVectEnt(int[] leVecteur) {
        for (int i = 0; i < leVecteur.length; i++) {
            leVecteur[i] = (int) (Math.random() * 100);
        }
       }
    private static void afficheVect(int[] unVectEnt) {
        for (int i = 0; i < unVectEnt.length; i++) {
            System.out.print(unVectEnt[i] + " ");
        }
    } 
 
    private static int max(int[] v) {
    // {v.length>0} => {résultat = plus grande des valeurs contenues dans v}
    // c’est un parcours complet
        int i = 0;
        int max = v[0];
        while (i < v.length){
            if (v[i] > max){
                max = v[i];
            }
            i++;
        }
        return max;
    }
    
    private static boolean estValPresente(int[] v, int valeur) {
    // {} => {résultat = true si valeur est présente dans v, false sinon}
    // c’est un parcours qui risque d’être partiel
        int i = 0;
        while ((i < v.length) && (valeur != v[i])) {
            i++;
        }
        
        return i < v.length;

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] monvect;
        monvect = new int[15];
        initRandomVectEnt(monvect);
        afficheVect(monvect);
        System.out.print("\n");
        System.out.println("Le plus grand entier se trouvant dans monvect vaut : " + max(monvect));
        
        Scanner entree = new Scanner (System.in);
        
        System.out.print("Saisissez la valeur recherchée : ");
        int  valcherchee;
        valcherchee = entree.nextInt();
        
        boolean presente;
        presente = estValPresente(monvect,valcherchee);
        
        if (presente){
            System.out.println("la valeur valeur_de_valcherchee est présente dans le " +
"vecteur");
        } else{
            System.out.println("la valeur valeur_de_valcherchee n'est pas présente dans le " +
"vecteur");
        }
        
        
        
        
        
        
    }
    
}





























