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
public class Etudiant extends Personne {
    //Attributs//
    private String adresseParents;
    
    //Constructeurs//
    Etudiant(String nom, String prenom, String login){
        super(nom,prenom,login);
    }
    
    Etudiant(String nom, String prenom, String login, String adresseE, String adresseP){
        super(nom,prenom,login,adresseE);
        this.adresseParents = adresseP;
        
    }
    
    //Methodes//
    
    //Accesseurs//
    @Override
    public String getMail(){
        return getNom().toLowerCase() +'.'+ getPrenom().toLowerCase() +"@etu.univ-grenobles-alpes.fr";
    }
    
    public String getAdresseParents(){
        return adresseParents;
    }
    
    
    //Setteurs//
    
    public void setAdresse(String adresseE, String adresseP){
        super.setAdresse(adresseE);
        this.adresseParents = adresseP;
        
    }
    
    
    
}






 














