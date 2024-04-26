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

        Reparacion r1 = new Reparacion("1111AAA", "12345678A", 2000);
        Reparacion r2 = new Reparacion("2222BBB", "87654321B", 7000);
        Reparacion r3 = new Reparacion("2222BBB", "12345678A", 1500);

        r1.setPrecio(2000);
        r2.setPrecio(1500);
        r3.setPrecio(6000);

        taller.insertarReparacion(r1);
        taller.insertarReparacion(r2);
        taller.insertarReparacion(r3);

        // Mostrar datos del taller
        taller.mostrarDatos();

        // Obtener reparaciones por cliente
        System.out.println("\nReparaciones por cliente:");
        System.out.println(taller.ReparacionesPorCliente(cliente1));


        // Obtener reparaciones por vehículo
        System.out.println("\nReparaciones por vehículo:");
        System.out.println(taller.ReparacionesPorVehiculo("1111AAA"));

    }
}
