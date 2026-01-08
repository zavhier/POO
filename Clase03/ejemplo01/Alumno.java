public class Alumno {

    private String nombre;
    private int edad;
    private int legajo;

    public Alumno(String nombre, int edad, int legajo) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new AlumnoInvalidoException("El nombre no puede ser vacío");
        }

        if (edad <= 0) {
            throw new AlumnoInvalidoException("La edad debe ser mayor a 0");
        }

        if (legajo <= 0) {
            throw new AlumnoInvalidoException("El legajo debe ser positivo");
        }

        this.nombre = nombre.trim();
        this.edad = edad;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getLegajo() {
        return legajo;
    }

    public void mostrarDatos() {
        System.out.println("Alumno: " + nombre +
                           " | Edad: " + edad +
                           " | Legajo: " + legajo);
    }
}
