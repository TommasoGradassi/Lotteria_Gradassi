/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gradassi tommaso
 */
public class Giocatore extends Thread{
    // attributi
    private int idGiocatore;
    private String nomeGiocatore;
    private Estrazione estrazione;

    /**
    * 
    * Metodo costruttore
    * @param idGiocatore codice del giocatore
    * @param estrazione riferimento dell'oggetto Estrazione
    * @param nomeGiocatore
    */
    public Giocatore(int idGiocatore, String nomeGiocatore, Estrazione estrazione) {
       // inizializzazione attributi
       this.idGiocatore = idGiocatore;
       this.nomeGiocatore = nomeGiocatore;
       this.estrazione = estrazione;
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
       System.out.println("id: " + this.idGiocatore);
       
        // scelta del numero da giocare
        int numeroScelto = 34;
        
        
        System.out.println("Inizio estrazione per il giocatore "+idGiocatore);
        for(int i = 10; i>0; i--){
           System.out.println(i);
           
                   
        try {
            this.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Errore nello sleep");
        }
        
        }

        
       // verifica del risultato
       estrazione.verifica(numeroScelto, idGiocatore);
       
       // stampa fine verifica
       System.out.println("ho verificato il numero");
       
    }
}
