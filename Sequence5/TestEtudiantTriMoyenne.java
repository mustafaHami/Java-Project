/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author perringe
 */
public class TestEtudiantTriMoyenne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Etudiant et1 = new Etudiant("perrin", "gerome", "perringe");

        Etudiant et2 = new Etudiant("maraz", "kaan", "marazk");

        Etudiant et3 = new Etudiant("hacquard", "gregorie", "hacquagre");

        Etudiant et4 = new Etudiant("richalland", "paul", "richalp");

        Etudiant et5 = new Etudiant("demir", "mustafa", "demirmu");

        et1.addNote(15);
        et1.addNote(12);
        et1.addNote(12);
        et1.addNote(12);

        et2.addNote(8);
        et2.addNote(18);
        et2.addNote(6);

        et3.addNote(15);
        et3.addNote(8);
        et3.addNote(8);

        et4.addNote(12);

        et5.addNote(14);

        ArrayList<Etudiant> mesEtudiantsTriesMoyenne = new ArrayList<>();

        mesEtudiantsTriesMoyenne.add(et1);
        mesEtudiantsTriesMoyenne.add(et2);
        mesEtudiantsTriesMoyenne.add(et3);
        mesEtudiantsTriesMoyenne.add(et4);
        mesEtudiantsTriesMoyenne.add(et5);
        
        Collections.sort(mesEtudiantsTriesMoyenne,Etudiant.TriMoy);

        for (Etudiant etudiant:mesEtudiantsTriesMoyenne){
            System.out.println(etudiant.getMoyenne() + etudiant.getNomComplet());
        }
    }

}
