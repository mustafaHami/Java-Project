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
public class TestEtudiant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Etudiant et1 = new Etudiant("dupont", "pierre", "dupOntp");
        Etudiant et2 = new Etudiant("martin", "francis", "MarTinf");
        
        et1.setAdresse("14 Rue des Mouettes");
        et2.setAdresse("26 Avenue de la Liberté");
        
       
        
        et1.addNote(11);
        et1.addNote(12);
        et1.addNote(8);
        et1.addNote(15);
        et1.addNote(15);
        et1.addNote(15);
          
        et2.addNote(14);
        et2.addNote(7);
        et2.addNote(13);
 
        et1.affiche();
        et2.affiche();
        
        
        
    }
        
}

