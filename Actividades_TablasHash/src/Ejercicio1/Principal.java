package Ejercicio1;

public class Principal {

    public static void main(String[] args) {

        Taller taller = new Taller();
        taller.añadirVehiculo(new Vehiculo("1234-ASD", 10, "XXX"));
        taller.añadirVehiculo(new Vehiculo("56D8-ASD", 10, "XXX"));
        taller.añadirVehiculo(new Vehiculo("5555-ASE", 10, "XXX"));
        taller.mostrarTaller();
    }

}
