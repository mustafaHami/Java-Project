/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence4;

/**
 *
 * @author perringe
 */
public class TestNoteEtudiant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Etudiant et1 = new Etudiant("perrin","gerome","perringe");
        
        Etudiant et2 = new Etudiant("maraz","kaan","marazk","21 Avenue du chant","8 Boulevard madeleine");
        
        //et1//
        et1.addNote(15);
        et1.addNote(11);
        et1.addNote(11);
        System.out.println("Notes : " + et1.getNotes());
        System.out.println("Moyenne de l'étudiant 1 : " + et1.getMoyenne());
        
        //et2//
        et2.addNote(25);        
        et2.addNote(4);       
        et2.addNote(8);
        System.out.println("Notes : " + et2.getNotes());
        System.out.println("Moyenne de l'étudiant 2 : " + et2.getMoyenne());
    }
    
}
