/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence4;

import java.util.ArrayList;

/**
 *
 * @author perringe
 */
public class TestPolymorphismePersonne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Personne> mesPersonnes = new ArrayList<> ();
        Etudiant et1 = new Etudiant("perrin","gerome","perringe");
        Etudiant et2 = new Etudiant("maraz","kaan","marazk");
        Etudiant et3 = new Etudiant("richalland","paul","richalp");
        Etudiant et4 = new Etudiant("nesan","loris","nezanlo");
        Etudiant et5 = new Etudiant ("hacquard","gregorie","hacquagre");
        
        Personnel p1 = new Personnel("blachon","herve","blachonhe");
        Personnel p2 = new Personnel("goulian","jerome","goulianje");
        Personnel p3 = new Personnel("lejeune","anne","lejeuan");
        Personnel p4 = new Personnel("fontaine","sophie","fontaso");
        Personnel p5 = new Personnel("demir","mustafa","demirmu");
        
        mesPersonnes.add(et1);
        mesPersonnes.add(et2);
        mesPersonnes.add(et3);
        mesPersonnes.add(et4);
        mesPersonnes.add(et5);
        
        mesPersonnes.add(p1);
        mesPersonnes.add(p2);
        mesPersonnes.add(p3);
        mesPersonnes.add(p4);
        mesPersonnes.add(p5);
        
        for (Personne unePersonne : mesPersonnes){
            System.out.println(unePersonne.getMail());
        }
                
                
    }
    
}
