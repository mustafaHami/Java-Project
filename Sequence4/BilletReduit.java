/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence4;

/**
 *
 * @author perringe
 */
public class BilletReduit extends Billet {

    //Attributs//
    private float tauxDeReduction;

    //Constructeurs//
    BilletReduit(Trajet trajet, float prixAuKm, float tauxDeReduction) {
        super(trajet, prixAuKm);
        setTauxDeReduction(tauxDeReduction);
    }

    //Methodes//
    //Getteurs//
    public float getTauxDeReduction() {
        return tauxDeReduction;
    }

    @Override
    public float getPrix() {
        return super.getPrix() -(getTauxDeReduction() * super.getPrix());
    }

    //Setteurs//
    public void setTauxDeReduction(float tauxDeReduction) {
        if (tauxDeReduction >= 0.05 || tauxDeReduction <= 0.5) {
            this.tauxDeReduction = tauxDeReduction;
        } else if (tauxDeReduction < 0.05) {
            this.tauxDeReduction = 0.05f;
        } else if (tauxDeReduction > 0.5) {
            this.tauxDeReduction = 0.5f;
        }

    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println(" Prix avant réduction : " + super.getPrix());
        System.out.println(" Taux de reduction : " + getTauxDeReduction() + "\n Prix après réduction : " + getPrix());
    }
}
