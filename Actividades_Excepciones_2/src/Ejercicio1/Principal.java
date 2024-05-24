package Ejercicio1;

public class Principal {

	public static void main(String[] args) throws ExceptionDniNoEncontrado {
		
		Taller taller = new Taller();

	    // Insertar 3 clientes
	    Dni dni1 = new Dni("12345678A");
	    Dni dni2 = new Dni("87654321B");
	    Dni dni3 = new Dni("11111111C");
	    taller.anadirCliente(new Cliente(dni1, "Juan", "123456789"));
	    taller.anadirCliente(new Cliente(dni2, "María", "987654321"));
	    taller.anadirCliente(new Cliente(dni3, "Pedro", "555555555"));

	    // Insertar 2 coches
	    Matricula matricula1 = new Matricula("A-1234-BC");
	    Matricula matricula2 = new Matricula("B-5678-DE");
	    taller.anadirVehiculo(new Coche(matricula1, 10000, "Seat", "Ibiza"));
	    taller.anadirVehiculo(new Coche(matricula2, 20000, "Renault", "Megane"));

	    // Insertar 2 motos
	    Matricula matricula3 = new Matricula("C-9876-FG");
	    Matricula matricula4 = new Matricula("D-4321-HI");
	    taller.anadirVehiculo(new Moto(matricula3, 5000, 125));
	    taller.anadirVehiculo(new Moto(matricula4, 15000, 250));

	    // Insertar 4 reparaciones
	    taller.nuevaReparacion(dni1, matricula1, "2022-01-01");
	    taller.nuevaReparacion(dni2, matricula2, "2022-02-01");
	    taller.nuevaReparacion(dni3, matricula3, "2022-03-01");
	    taller.nuevaReparacion(dni1, matricula4, "2022-04-01");

	    // Listar vehículos
	    System.out.println("Vehículos:");
	    for (Vehiculo vehiculo : taller.getVehiculos().values()) {
	        System.out.println(vehiculo.toString());
	    }

	    // Listar Clientes
	    System.out.println("\nClientes:");
	    for (Cliente cliente : taller.getClientes()) {
	        System.out.println(cliente.toString());
	    }

	    // Listar reparaciones
	    System.out.println("\nReparaciones:");
	    for (Reparacion reparacion : taller.getReparaciones()) {
	        System.out.println(reparacion.toString());
	    }

	    // Listar reparaciones de un cliente
	    try{
	    	System.out.println("\nReparaciones del cliente con DNI " + dni1);
	    	taller.listarReparacionesCliente(dni1);
	    }catch (ExceptionDniNoEncontrado e) {
	    	System.err.println(e.toString());
	    }
	    
    }

	}


