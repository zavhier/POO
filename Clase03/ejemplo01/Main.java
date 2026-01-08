public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();

        try {
            Alumno a1 = new Alumno("Juan", 20, 100);
            Alumno a2 = new Alumno("Ana", 22, 200);

            curso.agregarAlumno(a1);
            curso.agregarAlumno(a2);

            // Error: nombre vacío
            Alumno a3 = new Alumno("", 18, 300);
            curso.agregarAlumno(a3);

        } catch (AlumnoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Alumnos cargados:");
        curso.mostrarAlumnos();
    }
}
