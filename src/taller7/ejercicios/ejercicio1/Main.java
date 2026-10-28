package taller7.ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Laura Gomez", 2500000);
        System.out.println("Nombre: " + e1.nombre);
        System.out.println("Salario: " + e1.getSalario());

        e1.setSalario(3000000);
        System.out.println("Salario: " + e1.getSalario());

        e1.setSalario(-100);
        System.out.println("Salario: " + e1.getSalario());

        Empleado e2 = new Empleado("Pedro Diaz", 1800000);
        e2.nombre = "Pedro Diaz Mendoza";
        System.out.println("Nombre: " + e2.nombre + ", Salario: " + e2.getSalario());
    }
}