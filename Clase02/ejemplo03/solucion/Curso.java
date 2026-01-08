
import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Alumno> alumnos;

    public Curso() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        if (alumno == null) {
            throw new IllegalArgumentException("No se puede agregar un alumno null.");
        }

        // Opcional / "subir nota": evitar legajos repetidos
        if (existeLegajo(alumno.getLegajo())) {
            throw new IllegalArgumentException("Ya existe un alumno con el legajo " + alumno.getLegajo());
        }

        alumnos.add(alumno);
    }

    private boolean existeLegajo(int legajo) {
        for (Alumno a : alumnos) {
            if (a.getLegajo() == legajo) {
                return true;
            }
        }
        return false;
    }

    public void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos cargados.");
            return;
        }

        System.out.println("Listado de alumnos:");
        for (Alumno a : alumnos) {
            a.mostrarDatos();
        }
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }
}
