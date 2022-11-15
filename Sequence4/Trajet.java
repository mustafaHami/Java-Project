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
public class Trajet {

    //Attributs//
    private String depart;
    private String arrivee;
    private int distance;

    //Constructeurs//
    Trajet(String depart, String arrivee, int distance) {
        setDepart(depart);
        setArrivee(arrivee);
        setDistance(distance);
    }

    //Methodes//
    //Accesseurs//
    public String getDepart() {
        return depart.toUpperCase();
    }

    public String getArrivee() {
        return arrivee.toUpperCase();
    }

    public int getDistance() {
        return distance;
    }

    //Setteurs//
    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setArrivee(String arrivee) {
        this.arrivee = arrivee;
    }

    public void setDistance(int distance) {
        if ((distance >= 5) || distance <= 2000) {
            this.distance = distance;
        } else if (distance < 5) {
            this.distance = 5;
        } else if (distance > 2000) {
            this.distance = 2000;
        }

    }
}
