/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author perringe
 */
public class TestArrayList {
    private static void initRandomArrayList(ArrayList<Integer> alInteger) {
        for (int i = 0;i < 30; i++) {
            alInteger.add((int) (Math.random() * 100));
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //a//
        ArrayList<Integer> alInteger = new ArrayList<>();
        initRandomArrayList(alInteger);
        
        Collections.sort(alInteger);
        
        //for indice//
        for (int j = 0;j < alInteger.size();j++){
            System.out.print(alInteger.get(j)+" ");
        }
        
        //for sans indice//
        for (Integer unEntier : alInteger){
            System.out.print(unEntier + " ");
        }
        
        //sans for ...//
        System.out.print(alInteger);
        
        System.out.println();
        //b//
        ArrayList<String> alString = new ArrayList<>();
        alString.add("gerome");
        alString.add("gregorie");
        alString.add("apaul");
        
        Collections.sort(alString);
        
        System.out.print(alString);
        
        

    }
    
}
