public class Main {

    public static void main(String[] args) {

        AutoSimple auto1 = new AutoSimple("Ford", "Fiesta", 120);
        auto1.mostrarDatos();

        System.out.println("------");

        AutoEncapsulado auto2 = new AutoEncapsulado("Toyota", "Corolla", 140);
        auto2.mostrarDatos();
    }
}
