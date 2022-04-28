package Tarea4;

public class MainCasa {
    public static void main(String[] args) {

        Casa casa = new Casa("Sala","Sotano", "Banio", "Comedor");

        System.out.println(casa.obtenerSala());
        System.out.println(casa.obtenerSotano());
        System.out.println(casa.obtenerBanio());
        System.out.println(casa.obtenerComedor());

    }
}
