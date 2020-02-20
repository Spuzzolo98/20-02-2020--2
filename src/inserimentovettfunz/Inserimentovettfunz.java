
package inserimentovettfunz;
import java.util.Scanner;

public class Inserimentovettfunz 
{

    static void inserimento(int vettoro[],int quanti)
    {
        Scanner kekkeroni = new Scanner(System.in);
        for(int i=0; i<quanti; i++)
        {
            vettoro[i] = kekkeroni.nextInt();
        }
    }
    static void output(int vettoro[], int quanti)
    {
        for(int i=0; i<quanti; i++)
        {
            System.out.println(vettoro[i]);
        }
    }
    public static void main(String[] args) 
    {
        Scanner kekkeroni = new Scanner(System.in);
        int vector[] = new int[100], quanti =0;
        quanti = kekkeroni.nextInt();
        inserimento(vector,quanti);
        output(vector, quanti);
    }
    
}
