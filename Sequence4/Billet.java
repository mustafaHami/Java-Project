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
public class Billet {

    //Attributs//
    private float prixAuKm;
    private Trajet trajet;

    //Constructeurs//
    Billet(Trajet trajet, float prixAuKm) {
        setPrixAuKm(prixAuKm);
        this.trajet = new Trajet(trajet.getDepart(),trajet.getArrivee(), trajet.getDistance());
    }

    //Methodes//
    //Getteurs//
    public String getDepart() {
        return trajet.getDepart();
    }

    public String getArrivee() {
        return trajet.getArrivee();
    }

    public int getDistance() {
        return trajet.getDistance();
    }

    public float getPrixAuKm() {
        return prixAuKm;
    }

    public float getPrix() {
        return (getPrixAuKm() * getDistance());
    }

    //Setteurs//
    public void setPrixAuKm(float prixAuKm) {
        if (prixAuKm >= 0.1 || prixAuKm <= 2.0) {
            this.prixAuKm = prixAuKm;
        } else if (prixAuKm < 0.1) {
            this.prixAuKm = 0.1f;
        } else if (prixAuKm > 2) {
            this.prixAuKm = 2;
        }

    }

    public void affiche() {
        System.out.println(" Depart : " + getDepart() + "\n Arrivee : " + getArrivee() + "\n Distance : " + getDistance() + "\n Prix au km : " + getPrixAuKm());
    }
}
