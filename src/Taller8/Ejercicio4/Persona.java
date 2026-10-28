package Taller8.Ejercicio4;

class Persona {
    private String nombre = "Sebastian";

    public String getNombre() {
        return nombre;
    }
}

class Estudiante extends Persona {
    void mostrarNombre() {
        System.out.println(getNombre());
    }
}

/*
class Persona {
    private String nombre = "Carlos";
}

class Estudiante extends Persona {
    void mostrarNombre() {
        System.out.println(nombre); // Error de compilación
    }
}
 */
