/*Esta versión aplica encapsulamiento y buenas prácticas.*/
public class AutoEncapsulado {

    private String marca;
    private String modelo;
    private int velocidad;

    public AutoEncapsulado(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
    }
}
