/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence5;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author PERRIN GEROME
 */
public class Etudiant extends Personne implements Comparable<Etudiant> {

    //Attributs//
    private String adresseParents;
    private ArrayList<Note> notes;
    private Groupe groupe;

    //Constructeurs//
    Etudiant(String nom, String prenom, String login) {
        super(nom, prenom, login);
        notes = new ArrayList<>();
    }

    Etudiant(String nom, String prenom, String login, Groupe groupe) {
        super(nom, prenom, login);
        setGroupe(groupe);
        notes = new ArrayList<>();
    }

    Etudiant(String nom, String prenom, String login, String adresseE, String adresseP) {
        super(nom, prenom, login, adresseE);
        this.adresseParents = adresseP;
        notes = new ArrayList<>();
    }

    //Methodes//
    //Accesseurs//
    @Override
    public String getMail() {
        return getNom().toLowerCase() + '.' + getPrenom().toLowerCase() + "@etu.univ-grenobles-alpes.fr";
    }

    public String getAdresseParents() {
        return adresseParents;
    }

    public float getMoyenne() {
        float somme = 0;
        for (Note uneNote : notes) {
            somme = somme + uneNote.getValeur();
        }
        return (somme / notes.size());
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    //Setteurs//
    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        if (this.groupe == null) {
            this.groupe = groupe;
            groupe.addEtudiant(this);
        }
    }

    public boolean estDansGroupe(Groupe groupe) {
        if (groupe == null) {
            return false;
        } else {
            return true;
        }
    }

    public void setAdresse(String adresseE, String adresseP) {
        super.setAdresse(adresseE);
        this.adresseParents = adresseP;

    }

    public void addNote(float uneNote) {
        notes.add(new Note(uneNote));
    }

    @Override
    public int compareTo(Etudiant et1) {
        if (this.getNom().compareTo(et1.getNom()) == 0) {
            return (this.getPrenom().compareTo(et1.getPrenom()));
        } else {
            return (this.getNom().compareTo(et1.getNom()));
        }
    }

    @Override
    public String toString() {
        return getNomComplet();
    }

    public static final Comparator<Etudiant> TriMoy
            = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant o1, Etudiant o2) {
            if (o1.getMoyenne() > o2.getMoyenne()) {
                return 1;
            } else if (o1.getMoyenne() < o2.getMoyenne()) {
                return -1;
            } else {
                return 0;
            }
        }
    };
}
