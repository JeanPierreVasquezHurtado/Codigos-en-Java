package Tarea4;

public class MainDocente {
    public static void main(String[] args) {

        Docente docente = new Docente("Freddy Clayderman", "Vigilio Arratea", "27491726", "30");

        System.out.println(docente.obtenerNombre());
        System.out.println(docente.obtenerApellido());
        System.out.println(docente.obtenerDni());
        System.out.println(docente.obtenerEdad());
    }

}
