import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class parsearFichero {
    public static List<Alumno> parsearFichero(HashMap<String, Double> alumnosNota) {
        List<Alumno> estudiantes = new ArrayList<>();
        //pasamos el hashmap a crear objetos Alumnos
        for(String nombre : alumnosNota.keySet()){
            estudiantes.add(new Alumno(nombre, alumnosNota.get(nombre)));
        }
        return estudiantes;
    }
}
