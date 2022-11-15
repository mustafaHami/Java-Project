/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence4;

import java.util.ArrayList;

/**
 *
 * @author PERRIN GEROME
 */
public class Etudiant extends Personne {
    //Attributs//
    private String adresseParents;
    private ArrayList<Note> notes;
    
    //Constructeurs//
    Etudiant(String nom, String prenom, String login){
        super(nom,prenom,login);
        notes = new ArrayList<>();
    }
    
    Etudiant(String nom, String prenom, String login, String adresseE, String adresseP){
        super(nom,prenom,login,adresseE);
        this.adresseParents = adresseP;
        notes = new ArrayList<>();
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
    
    public float getMoyenne(){
        float somme = 0;
        for (Note uneNote : notes){
            somme = somme + uneNote.getValeur();
        }
        return (somme/notes.size());
    }
    
    public ArrayList<Note> getNotes(){
        return notes;
    }
    
    
    //Setteurs//
    
    public void setAdresse(String adresseE, String adresseP){
        super.setAdresse(adresseE);
        this.adresseParents = adresseP;
        
    }
    
    public void addNote(float uneNote){
        notes.add(new Note(uneNote));
    }
    
    
    
}






 




























