package Tarea4;

public class Perros {
    public String nombre;
    public String edad;
    public String genero;
    public String raza;

    public Perros(String nom, String eda, String gener, String raz)
    {
        establecerNombre(nom);
        establecerEdad(eda);
        establecerGenero(gener);
        establecerRaza(raz);
    }
    public String obtenerNombre()
    {
        return nombre;
    }
    public void establecerNombre(String nom)
    {
        nombre = nom;
    }
    public String obtenerEdad()
    {
        return  edad;
    }
    public void establecerEdad(String eda)
    {
        edad = eda;
    }
    public String obtenerGenero()
    {
        return genero;
    }
    public void establecerGenero(String gener)
    {
        genero = gener;
    }
    public String obtenerRaza()
    {
        return raza;
    }
    public void establecerRaza(String raz)
    {
        raza = raz;
    }
}
