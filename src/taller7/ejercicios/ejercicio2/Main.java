package taller7.ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", "Ahorros", 500000);
        cuenta.mostrarDetalles();

        cuenta.setSaldo(750000);
        System.out.println("Saldo: " + cuenta.getSaldo());

        cuenta.setSaldo(-20);
        System.out.println("Saldo: " + cuenta.getSaldo());

        System.out.println("Tipo: " + cuenta.tipoCuenta);
    }
}