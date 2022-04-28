package Tarea4;

public class Empleado {
    public String nombre;
    public String apellido;
    public String puesto;
    public String salario;

    public Empleado(String nom, String apell, String puest, String sala)
    {
        establecerNombre(nom);
        establecerApellido(apell);
        establecerPuesto(puest);
        establecerSalario(sala);
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
    public String obtenerPuesto()
    {
        return puesto;
    }
    public void establecerPuesto(String puest)
    {
        puesto = puest;
    }
    public String obtenerSalario()
    {
        return salario;
    }
    public void establecerSalario(String sala)
    {
        salario = sala;
    }
}
