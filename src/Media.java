import java.util.List;

public class Media {
    public static double calcularMedia(List<Alumno> alumnosNota) {
        double media = 0;
        int numAlumnos = alumnosNota.size();

        //recorremos la lista de alumnos y vamos sumando las notas para despues dividirlas entre el numero de alumnos
        for(Alumno alumno : alumnosNota){
            media += alumno.getNota();
        }
        media = media / numAlumnos;

        //una vez hecho, lo multiplicamos por 100 para quedarnos los 2 primeros decimales
        media = media * 100;
        //lo pasamos a int para eliminar los demas
        int mediaInt = (int) media;
        // lo volvemos a pasar a double para volver sa poder tener decimales
        media = mediaInt;
        //lo dividimos por 100 para que quede la media con 2 decimales
        media = media / 100;

        return media;
    }
}
