/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence2;

/**
 *
 * @author perringe
 */
public class TestPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Point point00 = new Point();
        Point pointQcq = new Point(4,5);
        
        point00.affiche();
        pointQcq.affiche();
        
        System.out.println("Valeur en abscisse du point 00 : " + point00.getX());
        System.out.println("Valeur en ordonnée du point Qcq : "+ pointQcq.getY());
        
        point00.deplaceXY(27,33);
        point00.affiche();

    }
    
    
}
