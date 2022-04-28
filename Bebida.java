package Tarea4;

public class Bebida {
    public String marca;
    public String precio;
    public String sabor;
    public String color;

    public Bebida(String marc, String preci, String sabo, String colo)
    {
        establecerMarca(marc);
        establecerPrecio(preci);
        establecerSabor(sabo);
        establecerColor(colo);
    }
    public String obtenerMarca()
    {
        return marca;
    }
    public void establecerMarca(String marc)
    {
        marca = marc;
    }
    public String obtenerPrecio()
    {
        return  precio;
    }
    public void establecerPrecio(String preci)
    {
        precio = preci;
    }
    public String obtenerSabor()
    {
        return sabor;
    }
    public void establecerSabor(String sabo)
    {
        sabor = sabo;
    }
    public String obtenerColor()
    {
        return color;
    }
    public void establecerColor(String colo)
    {
        color = colo;
    }
}
