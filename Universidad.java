package Tarea4;

public class Universidad {
    public String nombre;
    public String pabellones;
    public String aulas;
    public String zonasVerdes;

    public Universidad(String nom, String pabello, String aula, String zonas)
    {
        establecerNombre(nom);
        establecerPabellones(pabello);
        establecerAulas(aula);
        establecerZonasVerdes(zonas);
    }
    public String obtenerNombre()
    {
        return nombre;
    }
    public void establecerNombre(String nom)
    {
        nombre = nom;
    }
    public String obtenerPabellones()
    {
        return  pabellones;
    }
    public void establecerPabellones(String pabello)
    {
        pabellones = pabello;
    }
    public String obtenerAulas()
    {
        return aulas;
    }
    public void establecerAulas(String aula)
    {
        aulas = aula;
    }
    public String obtenerZonasVerdes()
    {
        return zonasVerdes;
    }
    public void establecerZonasVerdes(String zonas)
    {
        zonasVerdes = zonas;
    }
}
