package Ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {

	public static void main(String[] args) {

		// Declarar lista
		List<String> lista;

		// Instanciar lista
		lista = new ArrayList<String>();

		// Comprobar si esta o no vacia la lista
		if (lista.isEmpty() == true) {
			System.out.println("La lista esta vacia");
		} else {
			System.out.println("La lista no esta vacia");
		}

		// Agregar elementos a la lista
		lista.add("Primero");
		lista.add("Segundo");
		lista.add("Tercero");

		// Imprimir el tamaño de la lista
		System.out.println("Tam lista " + lista.size());

		// Listar con for-each
		for (String s : lista) {
			System.out.println(s);
		}
		
		
		lista.add(1, "Nuevo");
		System.out.println("\nDespués de insertar nuevo en la posicion 1: ");
		for (String s : lista) {
			System.out.println(s);
		}

		lista.remove(0);
		System.out.println("\nDespués de eliminar el elemento en la posicion 0: ");
		for (String s : lista) {
			System.out.println(s);
		}

		lista.remove("Segundo");
		System.out.println("\nDespués de eliminar segundo: ");
		for (String s : lista) {
			System.out.println(s);
		}

	}

}
