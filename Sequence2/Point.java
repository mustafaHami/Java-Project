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
public class Point {
    //Atributs//
    private int x;
    private int y;
    
    //Constructeurs//
    Point(){//Point en x=0 et y=0
        this.x = 0;
        this.y = 0;
    }
    
    Point(int valX, int valY){
        this.x = valX;
        this.y = valY;
    }
    
    //Accesseurs//
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    //Setteurs//
    public void setX(int valX){
        if (valX < 0 ){
            x = 0;
        }else{
            this.x = valX;
        }

    }
    
    public void setY(int valY){
        if (valY < 0 ){
            y = 0;
        }else {
            this.y = valY;
        }
    }
    
    public void deplaceXY(int dX, int dY){
        setX(dX);
        setY(dY);
      
    }
    
    public void affiche(){
        System.out.println("Points de coordonnés x = " + getX() + " et y = " + getY() + "\n");
    }

    
}
