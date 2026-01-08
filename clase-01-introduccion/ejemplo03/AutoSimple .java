/*
Característica:
acceso directo a los atributos
útil para aprender, pero no recomendable en sistemas reales

*/
public class AutoSimple {

    String marca;
    String modelo;
    int velocidad;

    public AutoSimple(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
    }
}
