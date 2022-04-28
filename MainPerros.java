package Tarea4;

public class MainPerros {
    public static void main(String[] args) {

        Perros perros = new Perros("Toby","10 anios", "Masculino", "Labrador");

        System.out.println(perros.obtenerNombre());
        System.out.println(perros.obtenerEdad());
        System.out.println(perros.obtenerGenero());
        System.out.println(perros.obtenerRaza());

    }
}
