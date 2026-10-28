package Taller8.Ejercicio3;

public class Empleado {
    private String nombre;
    private int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario: " + getSalario());
    }
}
