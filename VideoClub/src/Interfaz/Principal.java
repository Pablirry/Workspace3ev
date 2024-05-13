package Interfaz;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import Excepciones.miExcepcion;
import Logica.VideoClub;
import Modelo.Alquiler;
import Modelo.Ejemplar;
import Tester.CargaDatos;

public class Principal {
	static Scanner teclado = new Scanner(System.in);
	VideoClub videoclub=new VideoClub();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VideoClub v=CargaDatos.cargaDatos();
		int opcion=menuPrincipal();
		while(opcion!=0) {
			switch (opcion) {
			case 1: 
				menuSocios();
				break;
			case 2:
				menuPeliculas();
				break;
			case 3:
				menuEjemplar();
				break;
			case 4:
				menuAlquiler();
				break;
			}
		}
		
	}	


	private static void menuEjemplar() {
		// TODO Auto-generated method stub
		System.out.println("1.- Nuevo ejemplar");
		System.out.println("2.- Buscar ejemplar");
		System.out.println("3.- Modificar ejemplar ");
		System.out.println("4.- Eliminar ejemplar ");
		System.out.println("Opcion ");
		int opcion=teclado.nextInt();
		switch (opcion) {
		case 1: 
			nuevoEjemplar();
			break;
		case 2:
			buscarEjemplar();
			break;
		case 3:
			modificarEjemplar();
			break;
		case 4:
			eliminarEjemplar();
			break;
		
		}
	}
	private static void eliminarEjemplar() {
		// TODO Auto-generated method stub
		
	}
	private static void modificarEjemplar() {
		// TODO Auto-generated method stub
		
	}
	private static void buscarEjemplar() {
		// TODO Auto-generated method stub
		
	}
	private static void nuevoEjemplar() {
		// TODO Auto-generated method stub
		
	}
	private static void menuAlquiler() {
		System.out.println("1.- Nuevo Alquiler");
		System.out.println("2.- Buscar alquiler");
		System.out.println("3.- Modificar Alquiler ");
		System.out.println("4.- Eliminar Alquiler ");
		System.out.println("Opcion ");
		int opcion=teclado.nextInt();
		switch (opcion) {
		case 1: 
			nuevoAlquiler();
			break;
		case 2:
			buscarAlquiler();
			break;
		case 3:
			modificarAlquiler();
			break;
		case 4:
			eliminarAlquiler();
			break;
		
		}
		
	}
	private static void eliminarAlquiler() {
		// TODO Auto-generated method stub
		
	}
	private static void modificarAlquiler() {
		// TODO Auto-generated method stub
		
	}
	private static void buscarAlquiler() {
		// TODO Auto-generated method stub
		
	}
	private static void nuevoAlquiler() {
		// TODO Auto-generated method stub
		
	}
	private static void menuPeliculas() {
		System.out.println("1.- Nueva Pelicula");
		System.out.println("2.- Buscar Pelicula");
		System.out.println("3.- Modificar Pelicula ");
		System.out.println("4.- Eliminar Pelicula ");
		System.out.println("Opcion ");
		int opcion=teclado.nextInt();
		switch (opcion) {
		case 1: 
			nuevaPelicula();
			break;
		case 2:
			buscarPelicula();
			break;
		case 3:
			modificarPelicula();
			break;
		case 4:
			eliminarPelicula();
			break;
		
		}
		
	}
	private static void eliminarPelicula() {
		// TODO Auto-generated method stub
		
	}
	private static void modificarPelicula() {
		// TODO Auto-generated method stub
		
	}
	private static void buscarPelicula() {
		// TODO Auto-generated method stub
		
	}
	private static void nuevaPelicula() {
		// TODO Auto-generated method stub
		
	}
	private static void menuSocios() {
		// TODO Auto-generated method stub
		System.out.println("1.- Nuevo socio");
		System.out.println("2.- Buscar socio");
		System.out.println("3.- Modificar socio ");
		System.out.println("4.- Eliminar socio ");
		System.out.println("Opcion ");
		int opcion=teclado.nextInt();
		switch (opcion) {
		case 1: 
			nuevoSocio();
			break;
		case 2:
			buscarSocio();
			break;
		case 3:
			modificarSocio();
			break;
		case 4:
			eliminarsocio();
			break;
		
		}
	}
	private static void eliminarsocio() {
		// TODO Auto-generated method stub
		
	}
	private static void modificarSocio() {
		// TODO Auto-generated method stub
		
	}
	private static void buscarSocio() {
		// TODO Auto-generated method stub
		
	}
	private static void nuevoSocio() {
		// TODO Auto-generated method stub
		
	}
	private static int menuPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("1.- Menu socio");
		System.out.println("2.- Menu peliculas");
		System.out.println("3.- Menu ejemplar ");
		System.out.println("4.- Menu alquiler ");
		System.out.println("5.- Listados");
		System.out.println("Opcion ");
		int opcion=teclado.nextInt();
		return opcion;
	}
}	
