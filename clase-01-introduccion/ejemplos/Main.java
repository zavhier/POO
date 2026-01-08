
public class Main {

    public static void main(String[] args) {

        // Crear una instancia de Persona
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 20;
        persona1.presentarse();

        System.out.println("--------------");

        // Crear una instancia de Auto
        Auto auto1 = new Auto();
        auto1.marca = "Ford";
        auto1.modelo = "Fiesta";
        auto1.velocidad = 120;
        auto1.mostrarDatos();
    }
}
