import java.util.List;

public class Resultados {
    public static void mostrarResultado(List<Alumno> estudiantes, double media) {
        System.out.println("Lista de Alumnos:");

        //recorremos la lista de los estudiantes para sacarlos por consola
        for(Alumno alumno : estudiantes){
            System.out.println(alumno);
        }
        System.out.println();

        //mostramos la media de la clase
        System.out.println("Media de la clase:" + media);
    }
}
