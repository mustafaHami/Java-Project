/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence4;

import java.util.Scanner;

/**
 *
 * @author perringe
 */
public abstract class ReelContraint {

    //Attributs//
    private float min;
    private float max;
    private float valeur;

    //Constructeurs//
    ReelContraint(float min, float max) {
        this.min = min;
        this.max = max;
        this.valeur = min;
    }

    //Methodes//
    //Accesseurs//
    public float getValeur() {
        return valeur;
    }

    //Setteurs//
    public void setValeur(float valeur) {
        if (valeur >= min && valeur <= max) {
            this.valeur = valeur;
        }
    }

    public void saisir() {
        Scanner entree = new Scanner(System.in);

        System.out.print("Saisir une valeur dans l'intervalle [" + min + "; " + max + "] :  ");

        float vallue = entree.nextFloat();

        while (vallue < min || vallue > max) {
            System.out.print("Erreur, Saisir une valeur dans l'intervalle [" + min + "; " + max + "] :  ");
            vallue = entree.nextFloat();
        }
        // vallue >= min && vallue <=max ){;

        this.valeur = vallue;

    }

    @Override
    public String toString() {
        return String.valueOf(getValeur());
    }
}
