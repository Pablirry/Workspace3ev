package Ejercicio2;

import java.util.Arrays;
import java.util.List;

public class Excepciones2 {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5);
		
		try {
			int l = lista.get(10);
			System.out.println("Elemento: " + l);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Error: utiliza un indice valido entre 0 y " + (lista.size()-1));
			
		}
	}

}
