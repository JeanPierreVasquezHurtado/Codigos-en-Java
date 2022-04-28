package Tarea4;

public class MainUniversidad {
    public static void main(String[] args) {

        Universidad universidad = new Universidad("Universidad de Huanuco","4 pabellones", "500 aulas", "6 Zonas Verdes");

        System.out.println(universidad.obtenerNombre());
        System.out.println(universidad.obtenerPabellones());
        System.out.println(universidad.obtenerAulas());
        System.out.println(universidad.obtenerZonasVerdes());

    }
}
