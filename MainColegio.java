package Tarea4;

public class MainColegio {
    public static void main(String[] args) {

        Colegio colegio = new Colegio("Manuel Scorza Torres", "60 aulas",
                "3000 alumnos", "Jr. Sanchez Cerro, San Martín de Porres");

        System.out.println(colegio.obtenerNombre());
        System.out.println(colegio.obtenerDireccion());
        System.out.println(colegio.obtenerAulas());
        System.out.println(colegio.obtenerAlumnos());
    }
}
