/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence3;

/**
 *
 * @author PERRIN GEROME
 */
public class TestPersonneEtudiant {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Personne p1 = new Personne("perrin","gerome","perringe");
        Personne p2 = new Personne("maraz","kaan","marazk","Avenue des rochers");
        
       
        
        p1.affiche();
        p2.affiche();
        //Tests pour obets de classe personne//
        p1.setAdresse("Avenue des cailloux");
        System.out.println("nouvelle adresse pour p1 : " + p1.getAdresse());
        
        p2.setAdresse("Avenue de l'eau");
        System.out.println("nouvelle adresse pour p2 : " + p2.getAdresse());
        
        System.out.println("Mail de p1 : " + p1.getMail());
        
        System.out.println("Mail de p2 : " + p2.getMail());
        */

        System.out.println("-----------------------------------");
        
        Etudiant et1 = new Etudiant("dupont","michel","dupontmi");
        Etudiant et2 = new Etudiant("marne","richard","marneri","Avenue beaufort","Rue de la verdure");
        
        et1.affiche();
        et2.affiche();
        
        //Test pour objets de classe etudiant//
        et1.setAdresse("La rue de la fontaine");
        System.out.println("Nouvelle adresse pour et1 : " + et1.getAdresse());
        
        et1.setAdresse("La rue de la sécheresse","Boulevard oiseaux");
        System.out.println("Nouvelle adresse pour et1 : " + et1.getAdresse());
        System.out.println("Nouvelle adresse pour les parents de et1 : " + et1.getAdresseParents());
        
        et2.setAdresse("24 rue des fleurs","Avenue des lapins");
        System.out.println("adresse etu2 : " + et2.getAdresse());
        System.out.println("adresse parents2 : " + et2.getAdresseParents());
        
        System.out.println("Mail de etu1 : " + et1.getMail());
        
        System.out.println("Mail de etu2 : " + et2.getMail());

        
        
        
    }
    
}









































