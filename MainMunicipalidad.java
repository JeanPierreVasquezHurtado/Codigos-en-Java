package Tarea4;

public class MainMunicipalidad {
    public static void main(String[] args) {

        Municipalidad municipalidad = new Municipalidad("Secretaria", "Alcalde",
                "Vocero", "18 integrantes en Mesa Directiva");

        System.out.println(municipalidad.obtenerAlcalde());
        System.out.println(municipalidad.obtenerSecretaria());
        System.out.println(municipalidad.obtenerMesaDirectica());
        System.out.println(municipalidad.obtenerVocero());
    }
}
