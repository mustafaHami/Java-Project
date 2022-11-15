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
public class TestBilletterie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trajet t1 = new Trajet("Marseille", "Paris", 800);
        Trajet t2 = new Trajet("Grenoble", "Lyon", 80);
        Trajet t3 = new Trajet("Lille", "Dijon", 400);
        Trajet t4 = new Trajet("Besançon", "Raon l'étape", 450);
        Trajet t5 = new Trajet("Alger", "Amsterdam", 2000);

        Billet b1 = new Billet(t1, 1);
        Billet b2 = new Billet(t2, 1.5f);
        Billet b3 = new Billet(t3, 0.5f);
        Billet b4 = new Billet(t4, 2);
        Billet b5 = new Billet(t5, 0.3f);

        BilletReduit br1 = new BilletReduit(t1, 1, 0.05f);
        BilletReduit br2 = new BilletReduit(t2, 1.5f, 0.12f);
        BilletReduit br3 = new BilletReduit(t3, 0.5f, 0.4f);
        BilletReduit br4 = new BilletReduit(t4, 2, 0.5f);
        BilletReduit br5 = new BilletReduit(t5, 0.3f, 0.05f);

        System.out.println("----------------BILLETS----------------");
        b1.affiche();
        System.out.println("");
        b2.affiche();
        System.out.println("");
        b3.affiche();
        System.out.println("");
        b4.affiche();
        System.out.println("");
        b5.affiche();
        System.out.println("");
        
        
        System.out.println("----------------BILLETS REDUITS----------------");
        br1.affiche();
        System.out.println("");
        br2.affiche();
        System.out.println("");
        br3.affiche();
        System.out.println("");
        br4.affiche();
        System.out.println("");
        br5.affiche();
        System.out.println("");
    }

}
