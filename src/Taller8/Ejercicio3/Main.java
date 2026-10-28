package Taller8.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Santiago", 250000);

        Gerente gerente = new Gerente(
                "Sebastian", 450000, "Marketing"
        );

        empleado.mostrarDetalles();

        System.out.println();
        gerente.mostrarDetalles();
    }
}
