/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence5;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author perringe
 */
public class TestOrdreNaturelEtudiant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Etudiant> mesEtudiantsOrdreQcq = new ArrayList<>();
        
        TreeSet<Etudiant> mesEtudiantsTries = new TreeSet<>();
        
        Groupe g1 = new Groupe("D1");
        
        Groupe g2 = new Groupe("D2");
        
        Groupe g3 = new Groupe("C1");
        
        Groupe g4 = new Groupe("C2");
        
        Etudiant et1 = new Etudiant("perrin","gerome","perringe",g1);
        
        Etudiant et2 = new Etudiant("maraz","kaan","marazk",g1);
        
        Etudiant et3 = new Etudiant ("hacquard","gregorie","hacquagre",g2);
        
        Etudiant et4 = new Etudiant("richalland","paul","richalp",g3);
        
        Etudiant et5 = new Etudiant ("demir","mustafa","demirmu",g4);
        
        
        mesEtudiantsOrdreQcq.add(et1);
        mesEtudiantsOrdreQcq.add(et2);
        mesEtudiantsOrdreQcq.add(et3);
        mesEtudiantsOrdreQcq.add(et4);
        mesEtudiantsOrdreQcq.add(et5);
        
        mesEtudiantsTries.add(et1);
        mesEtudiantsTries.add(et2);
        mesEtudiantsTries.add(et3);
        mesEtudiantsTries.add(et4);
        mesEtudiantsTries.add(et5);
        
        System.out.println("");
        System.out.println("Etudiants dans l'ArrayList : ");
        for(Etudiant etudiant : mesEtudiantsOrdreQcq){
            System.out.println(etudiant.getNomComplet());
        }
        
        System.out.println("");
        System.out.println("Etudiants dans le TreeSet : ");
        for(Etudiant etudiant : mesEtudiantsTries){
            System.out.println(etudiant.getNomComplet());
        }
        
        
    }
    
}
