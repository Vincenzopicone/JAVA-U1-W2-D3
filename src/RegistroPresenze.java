import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;

public class RegistroPresenze {

    /*public static void main(String[] args) throws IOException {
        Map<String, Integer> listaPresenze = new HashMap<String, Integer>();
        listaPresenze.put("Vincenzo", 10);
        listaPresenze.put("Peppe", 15);
        listaPresenze.put("Nicola", 23);
        listaPresenze.put("Mario", 31);
        File f = new File("ListaPresenze.txt");
        try {
            for(int i = 0; i< listaPresenze.size(); i++) {
                FileUtils.writeStringToFile(f, String.valueOf(listaPresenze),"UTF-8");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/
    public static void main(String[] args) throws IOException {
        Map<String, Integer> listaPresenze = new HashMap<String, Integer>();
        listaPresenze.put("Vincenzo", 10);
        listaPresenze.put("Peppe", 15);
        listaPresenze.put("Nicola", 23);
        listaPresenze.put("Mario", 31);
        File f = new File("ListaPresenze.txt");
        try {
            String s = FileUtils.readFileToString(f, "UTF-8");
            System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

     }
}
