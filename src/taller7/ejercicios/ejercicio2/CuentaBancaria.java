package taller7.ejercicios.ejercicio2;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        setSaldo(saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta + ", Tipo: " + tipoCuenta + ", Saldo: " + saldo);
    }
}