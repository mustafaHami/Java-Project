/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencebonus;

import java.util.Random;

/**
 *
 * @author perringe
 */
public class PlateauUtilitaire {
    private static final Random RANDOM  = new Random();

    public static int De3() {
        return RANDOM.nextInt(3) + 1;
    }

    public static int De3(int nombreDes) {
        int somme = 0;
        for (int i = 0; i < nombreDes; i++) {
            somme = somme + De3();
        }
        return somme;
    }
}
    
    
