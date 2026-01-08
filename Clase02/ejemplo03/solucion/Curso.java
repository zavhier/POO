import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Alumno> alumnos;

    public Curso() {
        alumnos = new ArrayList<>();
    }

    public boolean agregarAlumno(Alumno alumno) {
        // Regla 1: no null
        if (alumno == null) return false;

        // Regla 2: datos válidos
        if (!alumno.esValido()) return false;

        // Regla opcional: no repetir legajo
        if (existeLegajo(alumno.getLegajo())) return false;

        alumnos.add(alumno);
        return true;
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
