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
public class Cercle {
    //Atributs//
//  private int x;
//  private int y;
    private int rayon;
    private Point centre;
    //Constructeurs//
    Cercle(int monRayon){   //Cercle en x=0 et y=0
//      this.x = 0;
//      this.y =0;
        this.centre= new Point();
        this.rayon = monRayon;
    }
    
    Cercle(int xOrigine, int yOrigine, int monRayon){
        this.centre = new Point(xOrigine,yOrigine);
        this.rayon = monRayon;
    }
    //Accesseurs//
    public int getRayon(){
        return rayon;
    }
    
    public double getPerimetre(){
        return 2*Math.PI*rayon;
    }
    
    public double getSurface(){
        return Math.PI*rayon*rayon;
    }
    
    
    
    //Setteurs//
    public void setRayon(int nouveauRayon){
        this.rayon = nouveauRayon;
    }
    
    public void deplaceCentre(int dx, int dy){
        centre.deplaceXY(dx, dy);
    }
    
    public void affiche(){
        System.out.println("x = " + centre.getX() +"\n" + "y = " + centre.getY() + "\n" + "Rayon = " + rayon + "\n" + "Perimetre = " + getPerimetre() + "\n" + "Surface = " + getSurface() + "\n");
    }

  
    
}
