/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence5;

/**
 *
 * @author perringe
 */
public class Personnel extends Personne {
    //Attributs//
    private int echelon;
    private float valeurPointIndice;
    
    //Constructeurs//
    Personnel(String nom, String prenom, String login){
        super(nom,prenom,login);
    }
    
    Personnel(String nom, String prenom, String login, int echelon, float valeurPoint){
        super(nom,prenom,login);
        setEchelon(echelon);
        setValeurPointIndice(valeurPoint);
    }
    
    //Methodes//
    
    //Accesseurs//
    
    public int getEchelon(){
        return echelon;
    }
    
    public float getValeurPointIndice(){
        return valeurPointIndice;
    }
    
    public float getSalaire(){
        return echelon * valeurPointIndice;
    }
    
    @Override
    public String getMail(){
        return getNom() + '.' + getPrenom() + "@iut2.univ-grenoble-alpes.fr";
    }
    
    //Setteurs//
    
    public void setEchelon(int echelon){
        this.echelon = echelon;
    }
    
    public void setValeurPointIndice(float valeurPoint){
        this.valeurPointIndice = valeurPoint;
    }
    
    @Override
    public void affiche(){
        super.affiche();
        System.out.println("Echelon : " + getEchelon() + "\nValeurPointIndice : " + getValeurPointIndice() + "\nSalaire : " + getSalaire()+"\n");
    }
    
}
