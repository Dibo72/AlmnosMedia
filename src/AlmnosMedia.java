import java.util.*;
public class AlmnosMedia {
    public static void main(String[] args) {
        HashMap <String, Double> alumnosNota = new HashMap();
        Lector.lectorArchivo(alumnosNota);

        List<Alumno> estudiantes = parsearFichero.parsearFichero(alumnosNota);

        double media = Media.calcularMedia(estudiantes);

        Resultados.mostrarResultado(estudiantes, media);
    }
}