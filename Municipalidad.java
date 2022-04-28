package Tarea4;

public class Municipalidad {
    public String secretaria;
    public String alcalde;
    public String vocero;
    public String mesaDirectiva;

    public Municipalidad(String secret, String alcal, String voce, String meDi)
    {
        establecerSecretaria(secret);
        establecerAlclade(alcal);
        establecerVocero(voce);
        establecerMesaDirectiva(meDi);
    }
    public String obtenerSecretaria()
    {
        return secretaria;
    }
    public void establecerSecretaria(String secret)
    {
        secretaria = secret;
    }
    public String obtenerAlcalde()
    {
        return  alcalde;
    }
    public void establecerAlclade(String alcal)
    {
        alcalde = alcal;
    }
    public String obtenerVocero()
    {
        return vocero;
    }
    public void establecerVocero(String voce)
    {
        vocero = voce;
    }
    public String obtenerMesaDirectica()
    {
        return mesaDirectiva;
    }
    public void establecerMesaDirectiva(String meDi)
    {
        mesaDirectiva = meDi;
    }
}
