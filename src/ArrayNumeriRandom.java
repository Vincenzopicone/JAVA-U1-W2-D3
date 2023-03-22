import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayNumeriRandom implements Runnable {
    private List<Integer> listaNumeri = new ArrayList<Integer>();
    static Random random = new Random();
    public ArrayNumeriRandom(String blocco) {
        long somma = 0;
        for(int i = 0; i < 1000; i++ ) {
            int number = random.nextInt(10);
            somma = somma + number;
            listaNumeri.add(number);
        }
        Main.parziali = Main.parziali + somma;
        System.out.println("Del " + blocco + " la somma parziale è: " + somma);
    };

    @Override
    public void run() {

    }
}
