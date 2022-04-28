package Tarea4;

public class Cancion {
    public String nombre;
    public String artista;
    public String duracion;
    public String genero;

    public Cancion(String nom, String artis, String dura, String gen)
    {
        establecerNombre(nom);
        establecerArtista(artis);
        establecerDuracion(dura);
        establecerGenero(gen);
    }
    public String obtenerNombre()
    {
        return nombre;
    }
    public void establecerNombre(String nom)
    {
        nombre = nom;
    }
    public String obtenerArtista()
    {
        return  artista;
    }
    public void establecerArtista(String artis)
    {
        artista = artis;
    }
    public String obtenerDuracion()
    {
        return duracion;
    }
    public void establecerDuracion(String dura)
    {
        duracion = dura;
    }
    public String obtenerGenero()
    {
        return genero;
    }
    public void establecerGenero(String gen)
    {
        genero = gen;
    }
}
