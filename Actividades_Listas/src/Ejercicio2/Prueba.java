package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prueba {

	/*
	 * Crear una lista de enteros que tenga 10 números aleatorios entre 1 y 50.
	 * Mostrar la lista por pantalla.
	 * A continuación, pedir por teclado un limite superior e inferior. Eliminar
	 * todos aquellos elementos de la lista que estén fuera de los limites incluidos
	 * estos. Mostrar el resultado por pantalla
	 * • Crear lista
	 * • Mostrar lista
	 * • Pedir limites
	 * • Eliminar elementos
	 * • Mostrar lista
	 */

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<Integer>();

		crearLista(lista);
		mostrarLista(lista);

		System.out.println("Inferior: ");
		int limInferior = sc.nextInt();
		System.out.println("Superior: ");
		int limSuperior = sc.nextInt();

		eliminarElementos(lista, limInferior, limSuperior);
		mostrarLista(lista);

	}

	public static void crearLista(List<Integer> lista) {

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 50) + 1;
			lista.add(num);
		}

	}

	public static void mostrarLista(List<Integer> lista) {
		System.out.println("La lista es: ");
		for (int num : lista) {
			System.out.print(num + " ");
		}

		System.out.println();
	}

	public static void eliminarElementos(List<Integer> lista, int limInferior, int limSuperior) {

		List<Integer> listaM = new ArrayList<>();

		for (Integer num : lista) {
			if (num > limInferior && num < limSuperior) {
				listaM.add(num);
			}
		}
		lista.clear();
		lista.addAll(listaM);
	}

}
