
// Excepción personalizada para errores relacionados con Alumno
public class AlumnoInvalidoException extends RuntimeException {

    public AlumnoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
