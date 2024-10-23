/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;

/**
 *
 * @author gradassi tommaso
 */
public class Estrazione extends Thread {
    // attributi
    private int [][] matrice;
    private int n;
    private int vincitori[];
    private int numeroVincitori = 3;
    private int numero;
    Random random = new Random();
    
    //Metodo costruttore   
    public Estrazione(int righe , int colonne,int numero) {
        matrice = new int[righe][colonne];
        vincitori = new int [3];  // inizializzazione array vincitori
         this.numeroVincitori=3;
        this.numero=numero;
    }
    
    public void aggiungiVincitori(int Num){
     vincitori[n]=Num;
        n++;
    }
    //metodo che ci permette di verificare se il numero scelto fa parte della matrice
    public void Verifica(int numero,int idGiocatore){
        while (numeroVincitori <= 3) {
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(matrice[i][j]==numero){
                      vincitori[i]=idGiocatore;
                      numeroVincitori=numeroVincitori+1;
                    }
                }
                System.out.println("l'utente"+idGiocatore+"ha scelto il numero"+numero+"ha vinto");
            }
        }
        

    }
    
    
    
    public void stampaVincitori() { // stampa array dei vincitori
       System.out.println("I vincitori sono:");
       System.out.println(""+vincitori[0]+vincitori[1]+vincitori[2]);
        }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    */
    public void verifica(int numero, int idGiocatore) {
        
           if(numero==this.numero){
               System.out.println("Complimenti giocatore " + idGiocatore + " hai vinto scegliendo il numero " + numero +"!");
               
           } else {
               System.out.println("Che peccato giocatore " + idGiocatore + " il numero " + numero +" non era vincente!");
           }
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        System.out.println("Inizio estrazione...");  // stampa iniziale
        for(int i=0;i<10;i++){ // estrazione dei numeri  e popolamento
            for(int j=0;j<10;j++){
                matrice[i][j] = random.nextInt(100);
            }
          } 
        
        for(int i=0;i<10;i++){//stampa matrice
        for(int j=0;j<10;j++){
            System.out.println("la matrice e'"+matrice[i][j]);
        }
      }
        System.out.println("Fine estrazione");// stampa finale
    }
}


