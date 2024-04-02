package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prueba {

	/*
	 * Crear una lista de todos los números del 1 a 100 que sean divisibles por un
	 * número que introduzca el usuario. Este número tiene que estar comprendido
	 * entre 2 y 7. Pinta la lista por pantalla.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero entre el 2 y el 7: ");
		int n = sc.nextInt();

		if (n < 2 || n > 7) {
			System.out.println("El numero introducido no esta comprendido entre 2 y 7");
		}

		List<Integer> listaDiv = new ArrayList<Integer>();

		for (int i = 1; i <= 100; i++) {
			if (i % n == 0) {
				listaDiv.add(i);
			}
		}

		System.out.println("Los numeros divisibles por " + n + " son: ");
		for (int num : listaDiv) {
			System.out.print(num + " ");

		}

		sc.close();

	}

}

