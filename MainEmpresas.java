package Tarea4;

public class MainEmpresas {
    public static void main(String[] args) {

        Empresas empresas = new Empresas("CORPORACION PRIMAX S.A.",
                "Av. Circunvalación del Club Golf Los Incas N° 134 Edificio Panorama Torre 1 Piso N° 18, Santiago de Surco, Lima",
                "Recursos Humanos", "Grupo Romero");

        System.out.println(empresas.obtenerNombre());
        System.out.println(empresas.obtenerDireccion());
        System.out.println(empresas.obtenerRecursosHumanos());
        System.out.println(empresas.obtenerFinanzas());
    }
}
