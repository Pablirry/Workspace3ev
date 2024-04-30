package Examen;

public class Prueba {

	public static void main(String[] args) {
		
		Taller taller = new Taller();

        // Insertar 3 clientes
        Cliente cliente1 = new Cliente("12345678A", "Cliente 1", "123456789");
        Cliente cliente2 = new Cliente("23456789B", "Cliente 2", "987654321");
        Cliente cliente3 = new Cliente("34567890C", "Cliente 3", "555555555");
        taller.añadirCliente(cliente1);
        taller.añadirCliente(cliente2);
        taller.añadirCliente(cliente3);

        // Insertar 2 coches
        Matricula matricula1 = new Matricula("A-1234-AB");
        Coche coche1 = new Coche(matricula1, 10000, "marca1", "modelo1");
        taller.añadirVehiculos(coche1);

        Matricula matricula2 = new Matricula("B-5678-CD");
        Coche coche2 = new Coche(matricula2, 20000, "marca2", "modelo2");
        taller.añadirVehiculos(coche2);

        // Insertar 2 motos
        Matricula matricula3 = new Matricula("C-9012-EF");
        Moto moto1 = new Moto(matricula3, 5000, 125);
        taller.añadirVehiculos(moto1);

        Matricula matricula4 = new Matricula("D-3456-GH");
        Moto moto2 = new Moto(matricula4, 10000, 250);
        taller.añadirVehiculos(moto2);

        // Insertar 4 reparaciones
        taller.nuevaReparacion("12345678A", "A-1234-AB", "2022-01-01");
        taller.nuevaReparacion("23456789B", "B-5678-CD", "2022-02-01");
        taller.nuevaReparacion("34567890C", "C-9012-EF", "2022-03-01");
        taller.nuevaReparacion("12345678A", "A-1234-AB", "2022-04-01");

        // Listar vehiculos
        System.out.println("Vehiculos:");
        taller.mostrarVehiculos();

        // Listar clientes
        System.out.println("Clientes:");
        taller.mostrarClientes();

        // Listar reparaciones
        System.out.println("Reparaciones:");
        taller.listarReparaciones();

        // Listar reparaciones de un cliente
        System.out.println("Reparaciones de cliente 12345678A:");
        taller.listarReparacionesCliente("12345678A");
    }

	}

