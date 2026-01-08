public class Alumno {

    private String nombre;
    private int edad;
    private int legajo;

    public Alumno(String nombre, int edad, int legajo) {
        // Cargamos lo que viene y luego validamos con esValido()
        this.nombre = (nombre == null) ? "" : nombre.trim();
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

    public boolean esValido() {
        if (nombre.isEmpty()) return false;
        if (edad <= 0) return false;
        if (legajo <= 0) return false;
        return true;
    }

    public void mostrarDatos() {
        System.out.println("Alumno: " + nombre + " | Edad: " + edad + " | Legajo: " + legajo);
    }
}
