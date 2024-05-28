package Ejercicio1;

public class Principal {

	public static void main(String[] args) throws ExcepcionTaller {

		Taller taller = new Taller();

		// Crear 3 clientes diferentes
		Cliente cliente1 = new Cliente("12345678A", "Juan", "123456789");
		Cliente cliente2 = new Cliente("12345678B", "Pedro", "123456789");
		Cliente cliente3 = new Cliente("12345678C", "Luis", "123456789");

		// Insertar los clientes en el taller
		try {
		taller.añadirCliente(cliente1);
		taller.añadirCliente(cliente2);
		taller.añadirCliente(cliente3);
		}catch (ExcepcionTaller e){
			System.err.println(e.getMessage());
		}

		// Crear 2 coches diferentes
		Coche coche1 = new Coche(new Matricula("A-1234-BC"), 5, "Seat", "Ibiza");
		Coche coche2 = new Coche(new Matricula("D-1234-EF"), 10, "Renault", "Clio");

		// Insertar los coches en el taller
		try {
		taller.añadirVehiculo(coche1);
		taller.añadirVehiculo(coche2);
		}catch(ExcepcionTaller e){
			System.err.println(e.getMessage());
		}

		// Crear 2 motos diferentes
		Moto moto1 = new Moto(new Matricula("G-1234-HI"), 15, 1000);
		Moto moto2 = new Moto(new Matricula("J-1234-KL"), 20, 2000);

		// Insertar las motos en el taller
		try {
		taller.añadirVehiculo(moto1);
		taller.añadirVehiculo(moto2);
		}catch (ExcepcionTaller e){
			System.err.println(e.getMessage());
		}

		try {
		// Crear 4 reparaciones en el taller
		taller.crearReparacion(cliente1.getDni(), coche1.getMatricula(), "01/01/2021");
		taller.crearReparacion(cliente2.getDni(), coche2.getMatricula(), "02/01/2021");
		taller.crearReparacion(cliente3.getDni(), moto1.getMatricula(), "03/01/2021");
		taller.crearReparacion(cliente1.getDni(), moto2.getMatricula(), "04/01/2021");
		}catch (ExcepcionTaller e){
			System.err.println(e.getMessage());
		}

		// Mostrar los vehículos del taller
		taller.mostrarVehiculos();

		// Mostrar los clientes del taller
		taller.mostrarClientes();

		// Mostrar las reparaciones del taller
		taller.mostrarReparaciones();

		// Mostrar las reparaciones de un cliente
		taller.mostrarReparacionesCliente(cliente1.getDni());

	}

}
