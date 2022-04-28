package Tarea4;

public class Main {
    public static void main(String[] args)
    {
        Persona persona = new Persona("Jean Pierre", "Vasquez Hurtado", "20 anios","Masculino");

        System.out.println(persona.obtenerNombre());
        System.out.println(persona.obtenerApellido());
        System.out.println(persona.obtenerEdad());
        System.out.println(persona.obtenerGenero());
    }
}
