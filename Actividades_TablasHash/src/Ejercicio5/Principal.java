package Ejercicio5;

public class Principal {

    public static void main(String[] args) {

        // Crear un taller
        Taller taller = new Taller();

        // Insertar clientes
        Cliente cliente1 = new Cliente("Juan", "12345678A");
        Cliente cliente2 = new Cliente("María", "87654321B");

        taller.insertarCliente(cliente1);
        taller.insertarCliente(cliente2);

        // Insertar vehículos
        Vehiculo vehiculo1 = new Vehiculo("1111AAA", "Seat");
        Vehiculo vehiculo2 = new Vehiculo("2222BBB", "Ford");

        taller.insertarVehiculo(vehiculo1);
        taller.insertarVehiculo(vehiculo2);

        // Realizar reparaciones
        taller.insertarReparacion("12345678A", "1111AAA");
        taller.insertarReparacion("87654321B", "2222BBB");
        taller.insertarReparacion("12345678A", "2222BBB");

        // Mostrar datos del taller
        taller.mostrarDatos();

        // Obtener reparaciones por cliente
        System.out.println("\nReparaciones por cliente:");
        System.out.println(taller.ReparacionesPorCliente("12345678A"));

        // Obtener reparaciones por vehículo
        System.out.println("\nReparaciones por vehículo:");
        System.out.println(taller.ReparacionesPorVehiculo("1111AAA"));

    }
}
