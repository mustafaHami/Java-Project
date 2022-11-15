/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence5;

import java.util.TreeSet;

/**
 *
 * @author perringe
 */
public class Groupe {

    //Attributs//
    private String libelle;
    private TreeSet<Etudiant> etudiants = new TreeSet<>();

    //Constructeur//
    Groupe(String libelle) {
        setLibelle(libelle);
    }

    //Methodes//
    //Accesseurs//
    public String getLibelle() {
        return libelle;
    }

    //Mutateurs//
    public void setLibelle(String Libelle) {
        this.libelle = Libelle;
    }

    public void addEtudiant(Etudiant etudiant) {
        if (this.contientEtudiant(etudiant) == false) { //SI JE NE CONTIENS PAS DJEA UN ETU
            if (etudiant.getGroupe() != null) {         //SI ETU A DEJA UN GROUPE
                if (etudiant.getGroupe() == this) {     //SI ETU EST CHEZ MOI
                    this.etudiants.add(etudiant);       //JE LE METS DANS LE TREESET
                }
            } else {
                etudiant.setGroupe(this);               //SI IL N A PAS DE GROUPE, SET GROUPE !

            }

        }

    }

    public boolean contientEtudiant(Etudiant etudiant) {
        return this.etudiants.contains(etudiant);
    }

    public TreeSet<Etudiant> getEtudiants() {
        return this.etudiants;
    }

}
