package Tarea4;

public class MainCancion {
    public static void main(String[] args) {

        Cancion cancion = new Cancion("A veces", "Gonzalo Genek", "2:46", "R&B");

        System.out.println(cancion.obtenerNombre());
        System.out.println(cancion.obtenerArtista());
        System.out.println(cancion.obtenerDuracion());
        System.out.println(cancion.obtenerGenero());
    }
}
