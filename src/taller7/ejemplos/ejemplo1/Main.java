package taller7.ejemplos.ejemplo1;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Mazda", 180);

        System.out.println(coche.getMarca());
        coche.mostrarInformacion();

        coche.setVelocidadMaxima(200);
        coche.mostrarInformacion();

        coche.setVelocidadMaxima(-50);
        coche.mostrarInformacion();
    }
}