/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencebonus;

/**
 *
 * @author perringe
 */
public class Guerrier {
    //Attributs//
    private int force;
    private int pointsDeVie;
    
    //Constructeurs//
    Guerrier(){
        this.force = 10;
        this.pointsDeVie=100;
    }
    
    //Getteurs//
    public int getForce(){
        return force;
    }
    
    public int getPointsDeVie(){
        return pointsDeVie;
    }
    
    //Setteurs//
    public void setPointDeVie(int pointDeVie){
        this.pointsDeVie=pointDeVie;
    }
    
    public boolean estVivant(){
        return getPointsDeVie() > 0;
    }
    
    public void attaquer(Guerrier guerrier){
        int degats = PlateauUtilitaire.De3(getForce());
        System.out.print(degats + " dégats ");
        guerrier.subirDegats(degats);
    }
    
    public void subirDegats(int degats){
        pointsDeVie = pointsDeVie - degats;
    }
}
