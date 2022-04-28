package Tarea4;

public class Campeon
{
    public String nombre;
    public String habilidad;
    public String vida;
    public String precio;

    public Campeon(String nom, String habili, String vid, String preci)
    {
        establecerNombre(nom);
        establecerHabilidad(habili);
        establecerVida(vid);
        establecerPrecio(preci);
    }
    public String obtenerNombre()
    {
        return nombre;
    }
    public void establecerNombre(String nom)
    {
        nombre = nom;
    }
    public String obtenerHabilidad()
    {
        return  habilidad;
    }
    public void establecerHabilidad(String habili)
    {
        habilidad = habili;
    }
    public String obtenerVida()
    {
        return vida;
    }
    public void establecerVida(String vid)
    {
        vida = vid;
    }
    public String obtenerPrecio()
    {
        return precio;
    }
    public void establecerPrecio(String preci)
    {
        precio = preci;
    }
}

