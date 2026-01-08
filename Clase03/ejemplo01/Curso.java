mport java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Alumno> alumnos;

    public Curso() {
        alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {

        if (alumno == null) {
            throw new AlumnoInvalidoException("No se puede agregar un alumno null");
        }

        if (existeLegajo(alumno.getLegajo())) {
            throw new AlumnoInvalidoException(
                "Ya existe un alumno con legajo " + alumno.getLegajo()
            );
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
        for (Alumno a : alumnos) {
            a.mostrarDatos();
        }
    }
}
