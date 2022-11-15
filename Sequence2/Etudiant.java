/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence2;

/**
 *
 * @author PERRIN GEROME
 */
public class Etudiant {

    /* Attributs */
    private String login;
    private String nom;
    private String prenom;
    private String adresse;

    private float[] notes;
    private int nbNotes;  // nombre de notes renseignées

    /* Constructeurs */
    Etudiant(String nom, String prenom, String login) {
        setLogin(login);
        this.nom = nom;
        this.prenom = prenom;
        notes = new float[5];
        nbNotes = 0;
    }

    /* Méthodes */

 /* Accesseurs */
    public String getLogin() {
        return login;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomComplet() {
        return nom + prenom;
    }

    public String getMail() {
        return (nom + "." +prenom +"@etu.univ-grenobles-alpes.fr");
    }

    public String getAdresse() {
        return adresse;
    }

    public float getMoyenne() {
        int j = 0;  //indices pour faire la moyenne 
        float total = 0;

        while (j < nbNotes) {
            total = total + notes[j];
            j++;
        }
        return total / j;
    }

    /* Setteurs */
    public void setLogin(String login) {
        this.login = login.toLowerCase();
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void addNote(float uneNote) {
        if (nbNotes < 5) {
            this.notes[nbNotes] = uneNote;
            nbNotes++;
        }

    }

    public void affiche() {
        System.out.println("Etudiant " + "\n" + "Login : " + login + "\n" + "nom complet : " + prenom + " " + nom + "\n" + "Adresse : " + adresse + "\n" +"Adresse mail : " + getMail() + "\n" + "Moyenne de l'élève : " + getMoyenne() + "\n");
    }


}







