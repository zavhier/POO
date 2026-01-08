public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();

        Alumno a1 = new Alumno("Juan", 20, 123);
        Alumno a2 = new Alumno("Ana", 22, 456);

        Alumno invalido1 = new Alumno("", 18, 789);     // nombre vacío
        Alumno invalido2 = new Alumno("Pedro", -5, 222); // edad inválida
        Alumno repetido = new Alumno("Luis", 30, 123);   // legajo repetido

        System.out.println("Agregar a1: " + (curso.agregarAlumno(a1) ? "OK" : "ERROR"));
        System.out.println("Agregar a2: " + (curso.agregarAlumno(a2) ? "OK" : "ERROR"));

        System.out.println("Agregar invalido1: " + (curso.agregarAlumno(invalido1) ? "OK" : "ERROR"));
        System.out.println("Agregar invalido2: " + (curso.agregarAlumno(invalido2) ? "OK" : "ERROR"));
        System.out.println("Agregar repetido: " + (curso.agregarAlumno(repetido) ? "OK" : "ERROR"));

        System.out.println();
        curso.mostrarAlumnos();
        System.out.println("Cantidad total: " + curso.cantidadAlumnos());
    }
}
