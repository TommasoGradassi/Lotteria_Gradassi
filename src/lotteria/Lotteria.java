/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gradassi tommaso
 */
public class Lotteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Avvio gioco
        Scanner scanner=new Scanner(System.in);
        System.out.println("Il gioco inizia!");
        System.out.println("\n");
        System.out.println("Inserisci il numero di colonne e righe della tabella di estrazione");
        int righe= scanner.nextInt();
        int colonne= scanner.nextInt();
        Estrazione e = new Estrazione(righe,colonne ,0);
        e.start();
        
        //    BufferedReader br=new BufferedReader(
        //     new InputStreamReader(System.in)  
        //    );        
        //    try {
        //       righe=Integer.parseInt(br.readLine());
        //      colonne=Integer.parseInt(br.readLine());
        //   } catch (IOException ex){
        //      Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
        //      System.err.println("errore");
         //   }
        
        
        try {
            e.join();
           } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Istanza ed avvio del thread Estrazione
        
        // Istanza di alcuni thread Giocatore
        Giocatore g1 = new Giocatore(1, "fabio", e);
        Giocatore g2 = new Giocatore(2, "andrea", e);
        Giocatore g3 = new Giocatore(3, "mattia", e);
        Giocatore g4= new Giocatore(4,"francesco",e);
        // Avvio dei thread Giocatori
        g1.start();
        g2.start();
        g3.start();
        g4.start();
       
        g1.start();
        try {
            g1.join();
           } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
        }
        g2.start();
        try {
            g2.join();
           } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        g3.start();
        try {
            g3.join();
           } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
        }

        g4.start();
        try {
            g4.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Comunicazione fine gioco
        System.out.println("\n");
        System.out.println("Fine del gioco, riprova");
      scanner.close();
    }
}
   