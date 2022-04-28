package Tarea4;

public class Docente {
    public String nombre;
    public String apellido;
    public String dni;
    public String edad;

    public Docente(String nom, String apell, String dnii, String eda)
    {
        establecerNombre(nom);
        establecerApellido(apell);
        establecerDni(dnii);
        establecerEdad(eda);
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
    public String obtenerDni()
    {
        return dni;
    }
    public void establecerDni(String dnii)
    {
        dni = dnii;
    }
    public String obtenerEdad()
    {
        return edad;
    }
    public void establecerEdad(String eda)
    {
        edad = eda;
    }
}
