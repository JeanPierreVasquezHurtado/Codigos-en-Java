package Tarea4;

public class Colegio {
    public String nombre;
    public String aulas;
    public String alumnos;
    public String direccion;

    public Colegio(String nom, String aula, String alumno, String direc)
    {
        establecerNombre(nom);
        establecerDireccion(direc);
        establecerAulas(aula);
        establecerAlumnos(alumno);
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
    public String obtenerAulas()
    {
        return aulas;
    }
    public void establecerAulas(String aula)
    {
        aulas = aula;
    }
    public String obtenerAlumnos()
    {
        return alumnos;
    }
    public void establecerAlumnos(String alumno)
    {
        alumnos = alumno;
    }
}
