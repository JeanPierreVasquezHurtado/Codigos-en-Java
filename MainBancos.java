package Tarea4;

public class MainBancos {
    public static void main(String[] args) {

        Bancos bancos = new Bancos("Banco de la Nacion","1800 cajeros", "700 personal", "32.000.000 de patrimonio");

        System.out.println(bancos.obtenerNombre());
        System.out.println(bancos.obtenerCajeros());
        System.out.println(bancos.obtenerPersonal());
        System.out.println(bancos.obtenerPatrimonio());

    }
}
