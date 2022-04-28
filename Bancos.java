package Tarea4;

public class Bancos {
    public String nombre;
    public String cajeros;
    public String personal;
    public String patrimonio;

    public Bancos(String nom, String cajer, String perso, String patri)
    {
        establecerNombre(nom);
        establecerCajeros(cajer);
        establecerPersonal(perso);
        establecerPatrimonio(patri);
    }
    public String obtenerNombre()
    {
        return nombre;
    }
    public void establecerNombre(String nom)
    {
        nombre = nom;
    }
    public String obtenerCajeros()
    {
        return  cajeros;
    }
    public void establecerCajeros(String cajer)
    {
        cajeros = cajer;
    }
    public String obtenerPersonal()
    {
        return personal;
    }
    public void establecerPersonal(String perso)
    {
        personal = perso;
    }
    public String obtenerPatrimonio()
    {
        return patrimonio;
    }
    public void establecerPatrimonio(String patri)
    {
        patrimonio = patri;
    }
}
