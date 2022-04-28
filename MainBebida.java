package Tarea4;

public class MainBebida {
    public static void main(String[] args) {
        Bebida bebida = new Bebida("Coca Cola", "3 soles", "Dulce", "Negro");
        System.out.println(bebida.obtenerMarca());
        System.out.println(bebida.obtenerPrecio());
        System.out.println(bebida.obtenerSabor());
        System.out.println(bebida.obtenerColor());
    }
}
