<h1 align="center">Readme Gradassi</h1>


<p align="center" style="font-family: monospace">Corso TPSIT <a href="https://www.avoltapg.edu.it/">ITTS A. Volta (PG)</a></p>


# GRADASSI TOMMASO 5AINF



## Scopo del progetto:
    Il progetto simula un gioco di lotteria in cui i giocatori scelgono un numero e partecipano all'estrazione. 
    L'estrazione avviene in modo casuale, e i vincitori sono determinati in base ai numeri scelti e ai numeri estratti. Questo progetto dimostra l'uso della programmazione multithreading in Java per gestire le interazioni tra più giocatori e l'estrazione.Ricordo inoltre che i vincitori saranno soltanto i primi 3 
    che riusciranno ad indovinare il numero.

## Principali classi utilizzate:

### Estrazione:
    Questa classe gestisce l'estrazione dei numeri, Estende la classe `Thread`.
   
   - **Metodi Principali:**
     - **run()**: Popola la matrice con numeri casuali e avvia l'estrazione.
     
     - **verifica(int numero, int idGiocatore)**: Verifica se il numero scelto dal giocatore è vincente. 
       - Se il numero scelto è uguale a quello estratto, stampa un messaggio di congratulazioni. 
       - In caso contrario, comunica che il numero non è vincente.
       questo viene fatto finchè numeroVincitori non raggiunge un valore di 3 , poichè solo i primi 3
       possono vincere.
       - una **problematica** che ho potuto riscontrare e che non sono stato in grado di risolvere, 
       riguarda la ripetizione dello stesso numero. Cioè la matrice verrà popolata da numeri casuali, 
       ma questi numeri si potranno ripetere(tipo: 2-33,3-24) quindi se un'giocatore inserisce un numero vincente , e dopodichè un'altro giocatore inserisce lo stesso numero vincerebbero entrambi . Io ho 
       pensato ad una **possibile soluzione** che porterebbe ad eliminare un numero dalla matrice una volta azzeccato, oppure fare un controllo prima del ciclo for in cui controllo se i numeri dei giocatori 
       sono uguali. 

### Giocatore:
        la classe giocatore si occupa di creare un giocatore, con un ID un nome interagisce con la classe `Estrazione` per controllare i risultati.
    
        - **Metodi Principali**
        - **run()**: Avvia il thread del giocatore, gestendo la scelta del numero e la verifica della vittoria.

### Lotteria
        la classe lotteria è il nostro 'main' , ha il compito di avviare il gioco ed una volta concluso
        di fermalrlo. principalmente istanzia oggetti come i 4 giocatori , ed anche l'estrazione.
        - utilizza vari comandi come **.join** :  dice al programma di aspettare che il thread,
         che  finisca il suo  lavoro prima di proseguire.
        - **catch (InterruptedException ex)** : Se si verifica un errore, 
        viene registrato nel log come un problema serio, usando il logger. 
