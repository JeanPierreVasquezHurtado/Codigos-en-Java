package Tarea4;

public class Empresas {
    public String nombre;
    public String direccion;
    public String recursosHumandos;
    public String finanzas;

    public Empresas(String nom, String direc, String reHu, String finan)
    {
        establecerNombre(nom);
        establecerDireccion(direc);
        establecerRecursosHumanos(reHu);
        establecerFinanzas(finan);
    }
    public String obtenerNombre()
    {
        return nombre;
    }
    public void establecerNombre(String nom)
    {
        nombre = nom;
    }
    public String obtenerDireccion()
    {
        return  direccion;
    }
    public void establecerDireccion(String direc)
    {
        direccion = direc;
    }
    public String obtenerRecursosHumanos()
    {
        return recursosHumandos;
    }
    public void establecerRecursosHumanos(String reHu)
    {
        recursosHumandos = reHu;
    }
    public String obtenerFinanzas()
    {
        return finanzas;
    }
    public void establecerFinanzas(String finan)
    {
        finanzas = finan;
    }
}
