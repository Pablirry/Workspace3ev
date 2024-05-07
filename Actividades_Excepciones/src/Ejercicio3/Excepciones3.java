package Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excepciones3 {

	static List<Integer> elementos = new ArrayList<Integer>(Arrays.asList(1, 5, -2));

    public static void agregarUnaVez(int elemento) {
        try {
            if (elementos.contains(elemento)) {
                throw new RuntimeException("Error: Imposible añadir elementos duplicados => " + elemento + ".");
            }
            elementos.add(elemento);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        agregarUnaVez(5);
        System.out.println(elementos);
    }
}
