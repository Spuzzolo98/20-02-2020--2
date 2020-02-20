package inserimentovettfunz;

import java.util.Scanner;

public class Inserimentovettfunz {

    
    /**
     * inserimento degli oggetti nel vettore
     * @param vector il vettore dal main in esame
     * @param quanti numero di ogg del vettore
     */
    static void inserimento(int vector[], int quanti) { 
        Scanner kekkeroni = new Scanner(System.in);
        for (int i = 0; i < quanti; i++) {
            vector[i] = kekkeroni.nextInt();
        }
    }
    
    
    /**
     * output oggetti del vettore
     * @param vettoro vettore dal main in esame
     * @param quanti numero ogg vettore
     */
    static void output(int vettoro[], int quanti) { 
        for (int i = 0; i < quanti; i++) {
            System.out.println(vettoro[i]);
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner kekkeroni = new Scanner(System.in);
        int quanti = 0; //int variabili/vettori
        quanti = kekkeroni.nextInt();
        int vector[] = new int[quanti];//determino quanti oggetti da usare
        inserimento(vector, quanti); 
        output(vector, quanti);
    }
    

}
