package Tarea4;

public class MainAutomovil
{
    public static void main(String[] args) {

        Automovil automovil = new Automovil("Ferrari","Electrica", "UTENB-123", "V12");

        System.out.println(automovil.obtenerMarca());
        System.out.println(automovil.obtenerBateria());
        System.out.println(automovil.obtenerMotor());
        System.out.println(automovil.obtenerNumeroPlaca());

    }
}
