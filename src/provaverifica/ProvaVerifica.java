
package provaverifica;
import java.lang.String;
import java.util.Scanner;
public class ProvaVerifica 
{
    static int inserimento(String nomi[], int anni[], boolean cittadini[])
    {
        int n=0, nboolean=0;
        Scanner scannervar = new Scanner(System.in);
        System.out.print("quanti cittadini?");
        n = scannervar.nextInt();
        scannervar.nextLine();
        for(int i=0; i<n; i++)
        {
            System.out.print("inserisci nome (attento alle maiuscole!): ");
            nomi[i] = scannervar.nextLine();
            System.out.print("inserisci età");
            anni[i] = scannervar.nextInt();
            System.out.print("è cittadino italiano? (1=sì/2=no: ");
            if(nboolean==1)
            {
                cittadini[i] = true;
            }
            if(nboolean==2) //spero che l'utente metta solo 1 e 2. gliel'ho detto..
            {
                cittadini[i] = false;
            }
            scannervar.nextLine();
        } 
        return n;
    }
    
    
    static void massimiminimi(int anni[], int n)
    {
        int max=Integer.MIN_VALUE, contomax=0, min = Integer.MAX_VALUE, contomin=0;
        for(int i=0; i<n; i++)
        {
            if(anni[i]>=max)
            {
                max=anni[i];
                contomax++;
            }
        }
        for(int i=0; i<n; i++)
        {
            if(anni[i]<=min)
            {
                min = anni[i];
                contomin++;
            }
        }
        System.out.println("l'età massima è "+max+" ed è l'età di "+contomax+" persone.");
        System.out.println("l'età minima è "+min+" ed è l'età di "+contomin+" persone.");  
    }
    
    
    static void maggiorimedia(int anni[], int n)
    {
        double media=0, contomedia=0;
        for(int i=0; i<n; i++)
        {
            media = media+anni[i];
        }
        media = (media/n);
        for(int i=0; i<n; i++)
        {
            if(anni[i]>media)
            {
                contomedia++;
            }
        }
        System.out.println("la media delle età è "+media +" e "+contomedia +"ne sono al di sopra.");   
    }
    
    
    
    static void maggioriditrenta(int anni[], int n)
    {
        int contatrenta=0;
        double contamagg=0;
       for(int i=0; i<n; i++)
       {
           if(anni[i]>30)
           {
               contatrenta++;
           }
           if(anni[i]>18)
           {
               contamagg++;
           }
       }
       contamagg = (contamagg/n)*100;
       System.out.println("le persone più vecchie di 30 anni sono "+contatrenta);
       System.out.println("i maggiorenni sono inoltre il "+contamagg +"%");
    }
    
    
    
    static void pippoepluto(String nomi[], boolean cittadini[], int n)
    {
        int contopippo=0, contopluto=0, contoes10=0;
        for(int i=0; i<n; i++)
        {
            if(nomi[i].equals("Pippo"))
            {
                contopippo++;
            }
            if(nomi[i].equals("Pluto"))
            {
                contopluto++;
            }
            if(nomi[i].equals("Pippo")&&cittadini[i]==false)
            {
                contoes10++;
            }
        }
        System.out.println("Le persone che si chiamano Pippo sono "+contopippo + " e tra questi "+contoes10+"sono stranieri.");
        System.out.println("Le persone che si chiamano Pluto sono "+contopluto);
    }
    
    
    static void nomescelto(String nomi[], int n)
    {
        Scanner scannervar = new Scanner(System.in);
        int contonomi=0;
        String nomescelto;
        System.out.print("scegli un nome da prendere come campione: ");
        nomescelto = scannervar.nextLine();
        for(int i=0; i<n; i++)
        {
            if(nomi[i].equals(nomescelto));
            {
                contonomi++;
            }
        }
        System.out.println("le persone che hanno il nome scelto sono "+contonomi);    
    }
    
    
    static void iscittadino(boolean cittadini[], int n)
    {
        int contocittadini=0;
        for(int i=0; i<n; i++)
        {
            if(cittadini[i]=true)
            {
                contocittadini++;
            }
        }
        System.out.println("i cittadini italiani sono "+contocittadini);   
    }
    
    
    public static void main(String[] args) 
    {
        String nomi[] = new String[100];
        int anni[] = new int[100], n=0;
        boolean cittadini[] = new boolean[100];
        n= inserimento(nomi, anni, cittadini);
        massimiminimi(anni, n);
        maggiorimedia(anni, n);
        maggioriditrenta(anni,n);
        pippoepluto(nomi, cittadini, n);
        nomescelto(nomi,n);
        iscittadino(cittadini,n);
    }
    
}
