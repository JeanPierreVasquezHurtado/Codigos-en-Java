package Tarea4;

public class Casa {
    public String sala;
    public String sotano;
    public String banio;
    public String comedor;

    public Casa(String sal, String sotan, String bani, String come)
    {
        establecerSala(sal);
        establecerSotano(sotan);
        establecerBanio(bani);
        establecerComedor(come);
    }
    public String obtenerSala()
    {
        return sala;
    }
    public void establecerSala(String sal)
    {
        sala = sal;
    }
    public String obtenerSotano()
    {
        return  sotano;
    }
    public void establecerSotano(String sotan)
    {
        sotano = sotan;
    }
    public String obtenerBanio()
    {
        return banio;
    }
    public void establecerBanio(String bani)
    {
        banio = bani;
    }
    public String obtenerComedor()
    {
        return comedor;
    }
    public void establecerComedor(String come)
    {
        comedor = come;
    }
}
