package Biblioteca;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("\nMenú de opciones:");
			System.out.println("1. Alta de nuevo socio");
			System.out.println("2. Eliminar socios con más de 4 préstamos");
			System.out.println("3. Listar todos los socios");
			System.out.println("4. Listar todos los libros");
			System.out.println("5. Realizar un préstamo");
			System.out.println("6. Eliminar un préstamo");
			System.out.println("7. Ver préstamos de un socio");
			System.out.println("8. Alta de nuevo libro");
			System.out.println("9. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();

			try {
				switch (opcion) {
				case 1:
					System.out.print("Número de socio: ");
					int numero = sc.nextInt();
					sc.nextLine();
					System.out.print("Nombre: ");
					String nombre = sc.nextLine();
					System.out.print("Apellidos: ");
					String apellidos = sc.nextLine();
					System.out.print("Teléfono: ");
					String telefono = sc.nextLine();
					biblioteca.altaSocio(new Socio(numero, nombre, apellidos, telefono));
					break;
				case 2:
					biblioteca.eliminarSociosConMasDe4Prestamos();
					break;
				case 3:
					biblioteca.listarSocios();
					break;
				case 4:
					biblioteca.listarLibros();
					break;
				case 5:
					System.out.println("Num socio: ");
					int numSocio = sc.nextInt();
					System.out.println("Num libro: ");
					int numLibro = sc.nextInt();
					biblioteca.realizarPrestamo(numSocio, numLibro);
					break;
				case 6:
					System.out.println("Num socio: ");
					numSocio = sc.nextInt();
					System.out.println("Num libro: ");
					numLibro = sc.nextInt();
					biblioteca.eliminarPrestamo(numSocio, numLibro);
					break;
				case 7:
					System.out.println("Num socio: ");
					numSocio = sc.nextInt();
					biblioteca.verPrestamos(numSocio);
					break;
				case 8:
					System.out.print("Código de libro: ");
					int codigoLibro = sc.nextInt();
					sc.nextLine();
					System.out.print("ISBN: ");
					String isbn = sc.nextLine();
					System.out.print("Título: ");
					String titulo = sc.nextLine();
					System.out.print("Autor: ");
					String autor = sc.nextLine();
					biblioteca.altaLibro(new Libro(codigoLibro, isbn, titulo, autor));
					break;
				case 9:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion no valida");
				}
			} catch (ExcepcionBiblioteca e1) {
				System.err.println(e1.getMessage());
			}
		} while (opcion != 9);

		sc.close();

	}

}
