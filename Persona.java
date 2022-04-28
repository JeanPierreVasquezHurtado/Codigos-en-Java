package Tarea4;

public class Persona {
    public String nombre;
    public String apellido;
    public String edad;
    public String genero;

    public Persona(String nom, String apell, String anios, String gene)
    {
        establecerNombre(nom);
        establecerApellido(apell);
        establecerEdad(anios);
        establecerGenero(gene);
    }
    public String obtenerNombre()
    {
        return nombre;
    }
    public void establecerNombre(String nom)
    {
        nombre = nom;
    }
    public String obtenerApellido()
    {
        return  apellido;
    }
    public void establecerApellido(String apell)
    {
        apellido = apell;
    }
    public String obtenerEdad()
    {
        return edad;
    }
    public void establecerEdad(String anios)
    {
        edad = anios;
    }
    public String obtenerGenero()
    {
        return genero;
    }
    public void establecerGenero(String gene)
    {
        genero = gene;
    }
}
