package Tarea4;

public class MainCampeon {
    public static void main(String[] args) {

        Campeon campeon = new Campeon("Darius","4 habilidades", "700 de vida", "400 de precio");

        System.out.println(campeon.obtenerNombre());
        System.out.println(campeon.obtenerHabilidad());
        System.out.println(campeon.obtenerVida());
        System.out.println(campeon.obtenerPrecio());

    }
}
