public class Alumno {

    private String nombre;
    private int edad;
    private int legajo;

    public Alumno(String nombre, int edad, int legajo) {
        // Validaciones al construir el objeto (evita estados inválidos)
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser vacío.");
        }
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0.");
        }
        if (legajo <= 0) {
            throw new IllegalArgumentException("El legajo debe ser positivo.");
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
        System.out.println("Alumno: " + nombre + " | Edad: " + edad + " | Legajo: " + legajo);
    }
}
