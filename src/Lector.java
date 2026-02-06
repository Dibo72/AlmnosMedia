import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Lector {
    public static void lectorArchivo(HashMap<String, Double> alumnosNota) {
        try(BufferedReader lector = new BufferedReader(new FileReader("alumnos.txt"))){
            String linea;
            while ((linea = lector.readLine()) != null){
                //dividimos la linea en partes y las añadimos a un Hashmap
                String[] partes = linea.split(";");
                alumnosNota.put(partes[0], Double.parseDouble(partes[1]));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
