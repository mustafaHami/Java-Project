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
public class Note extends ReelContraint {
    
    Note(){
        super(0,20);
    }
   
    Note(float valeur){
        super(0,20);
        setValeur(valeur);
    }
}
