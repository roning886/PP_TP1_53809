import java.util.ArrayList;

public class App {
    public static void main (String [] args ){

        Sala sala1 = new Sala(1,"Teatral");
        Sala sala2 = new Sala(2,"Aula magna");
        EventoUniversitario evento1 = new EventoUniversitario( "1", "matematica", 10.0, true);
        EventoUniversitario evento2 = new EventoUniversitario( "2", "lengua", 20.0, false);

        System.out.println("datos de los eventos");

        evento1.asignarSala(sala1);
        evento2.asignarSala(sala2);

        Estudiante alumno1 = new Estudiante("53000", "Pedro");
        Estudiante alumno2 = new Estudiante("52000", "Marta");
        Estudiante alumno3 = new Estudiante("51000","Facundo");

        ArrayList <Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(alumno1);
        estudiantes.add(alumno2);
        estudiantes.add(alumno3);

        evento1.crearActividad(1,"Ejercicios de Matematica",30,"charla","si",false);
        evento2.crearActividad(2,"Analisis de Oraciones",20,"taller","no",true);

        Actividad act1 =evento1.getActividad(1);
        Actividad act2 =evento2.getActividad(2);

        act1.inscribir(alumno1);
        act1.inscribir(alumno2);
        act2.inscribir(alumno3);

        evento1.mostrarDatos();
        evento2.mostrarDatos();
        System.out.println("cantidad de eventos "+EventoUniversitario.getCantidadEventos());

    }
}
