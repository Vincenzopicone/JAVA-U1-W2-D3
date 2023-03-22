import java.util.ArrayList;
import java.util.List;

public class Main {
    public static long parziali;
    public static void main(String[] args) {
        ////ESERCIZIO 1
        /*StampaAsterisco A1 = new StampaAsterisco();
        StampaCancelletto C1 = new StampaCancelletto();
        Thread T1 = new Thread(A1);
        Thread T2 = new Thread(C1);
        try{
            T1.start();
            T2.start();
        }catch (Exception e){
            e.getStackTrace();
        };*/
        ////ESERCIZIO 2

        ArrayNumeriRandom N1 = new ArrayNumeriRandom("blocco 1");
        ArrayNumeriRandom N2 = new ArrayNumeriRandom("blocco 2");
        ArrayNumeriRandom N3 = new ArrayNumeriRandom("blocco 3");
        Thread T3 = new Thread(N1);
        Thread T4 = new Thread(N2);
        Thread T5 = new Thread(N3);
        try {
            T3.start();
            T3.join();
            T4.start();
            T4.join();
            T5.start();
            System.out.println("La somma totale è: " + parziali);
        } catch(Exception e) {
            e.printStackTrace();
        };

        //// ESERCIZIO 3




    }
}