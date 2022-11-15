/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencebonus;

/**
 *
 * @author perringe
 */
public class TestGuerrier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Guerrier g1 = new Guerrier();
        Guerrier g2 = new Guerrier();
        
        
        
        while (g1.estVivant() && g2.estVivant()){
            
            System.out.print("Le guerrier 1 inflige : ");
            g1.attaquer(g2);
            System.out.print("au guerrier 2");
            System.out.println("");
            
            System.out.print("Le guerrier 2 inflige : ");
            g2.attaquer(g1);
            System.out.print("au guerrier 1");
            System.out.println("");
            
            System.out.println("Nombre de points de vie du guerrier 1 : " + g1.getPointsDeVie());
            System.out.println("Nombre de points de vie du guerrier 2 : " + g2.getPointsDeVie());
            
            
        }
        
        System.out.println("Fin de la partie");
    }
    
}
