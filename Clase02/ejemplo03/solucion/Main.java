public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();

        try {
            Alumno a1 = new Alumno("Juan", 20, 123);
            Alumno a2 = new Alumno("Ana", 22, 456);

            curso.agregarAlumno(a1);
            curso.agregarAlumno(a2);

            // Intento inválido: nombre vacío
            Alumno invalido = new Alumno("   ", 18, 789);
            curso.agregarAlumno(invalido);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Intento inválido: legajo repetido
            Alumno repetido = new Alumno("Pedro", 25, 123);
            curso.agregarAlumno(repetido);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        curso.mostrarAlumnos();
        System.out.println("Cantidad total: " + curso.cantidadAlumnos());
    }
}
