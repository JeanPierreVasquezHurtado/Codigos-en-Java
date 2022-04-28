package Tarea4;

public class MainEmpleado {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juanito", "Garcia Grandez", "administrador", "1400 s/.");

        System.out.println(empleado.obtenerNombre());
        System.out.println(empleado.obtenerApellido());
        System.out.println(empleado.obtenerPuesto());
        System.out.println(empleado.obtenerSalario());
    }
}
