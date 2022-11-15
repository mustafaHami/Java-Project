/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence3;

/**
 *
 * @author PERRIN GEROME
 */
public abstract class  Personne {
    //Attributs//
    private String login;
    private String nom;
    private String prenom;
    private String adresse;
    
    //Constructeurs//
    Personne(String nom, String prenom, String login){
        this.nom=nom;
        this.prenom=prenom;
        this.login=login;
    }
    
    Personne(String nom, String prenom, String login, String adresse){
        this.nom=nom;
        this.prenom=prenom;
        this.login=login;
        setAdresse(adresse);
    }
    
    //Methodes//
    
    //Accesseurs//
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public String getLogin(){
        return login.toLowerCase();
    }
    
    public String getNomComplet(){
        return prenom + ' ' + nom;
    }
    
    public abstract String getMail();
    
    public String getAdresse(){
        return adresse;
    }
    
    //Setteurs//
    
    public void setAdresse(String adresse){
        this.adresse=adresse;
    }
    
    public void affiche(){
        System.out.println("Nom complet : " + getNomComplet() + "\nLogin : " + getLogin() + "\nAdresse : " + getAdresse() + "\nMail : " + getMail());
    }

    
}
















