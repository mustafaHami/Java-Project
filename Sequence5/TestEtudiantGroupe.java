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
public class TestEtudiantGroupe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Groupe g1 = new Groupe("D1");
        
        Groupe g2 = new Groupe("D2");
        
        Groupe g3 = new Groupe("C1");
        
        Groupe g4 = new Groupe("C2");
        
        Groupe g5 = new Groupe("C3");
        
        
        Etudiant et1 = new Etudiant("perrin","gerome","perringe");
        
        Etudiant et2 = new Etudiant("maraz","kaan","marazk",g2);
        
        Etudiant et3 = new Etudiant ("hacquard","gregorie","hacquagre");
        
        Etudiant et4 = new Etudiant("richalland","paul","richalp");
        
        Etudiant et5 = new Etudiant ("demir","mustafa","demirmu",g2);
        
        
        g1.addEtudiant(et1);
        g3.addEtudiant(et3);
        g4.addEtudiant(et4);
        
        
        System.out.println("Affichage numéro I des étudiants : ");
        
        System.out.println(" groupe 1 : " + g1.getEtudiants());

        System.out.println(" groupe 2 : " + g2.getEtudiants());
        
        System.out.println(" groupe 3 : " + g3.getEtudiants());
        
        System.out.println(" groupe 4 : " + g4.getEtudiants());
        
        et2.setGroupe(g5);
        g2.addEtudiant(et5);
        
        
        System.out.println("Affichage numéro II des étudiants : ");
        
        System.out.println(" groupe 1 : " + g1.getEtudiants());

        System.out.println(" groupe 2 : " + g2.getEtudiants());
        
        System.out.println(" groupe 3 : " + g3.getEtudiants());
        
        System.out.println(" groupe 4 : " + g4.getEtudiants());
        
        System.out.println(" groupe 5 : " + g5.getEtudiants());
    }
    
}
