package Tarea4;

public class Automovil {
    public String marca;
    public String bateria;
    public String numeroPlaca;
    public String motor;

    public Automovil(String marc, String bateri, String numPla, String moto)
    {
        establecerMarca(marc);
        establecerBateria(bateri);
        establecerNumeroPlaca(numPla);
        establecerMotor(moto);
    }
    public String obtenerMarca()
    {
        return marca;
    }
    public void establecerMarca(String marc)
    {
        marca = marc;
    }
    public String obtenerBateria()
    {
        return  bateria;
    }
    public void establecerBateria(String bateri)
    {
        bateria = bateri;
    }
    public String obtenerNumeroPlaca()
    {
        return numeroPlaca;
    }
    public void establecerNumeroPlaca(String numPla)
    {
        numeroPlaca = numPla;
    }
    public String obtenerMotor()
    {
        return motor;
    }
    public void establecerMotor(String moto)
    {
        motor = moto;
    }
}
