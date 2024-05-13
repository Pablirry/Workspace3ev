package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excepciones3 {

    static List<Integer> elementos = new ArrayList<>();

    public static void insertarNum(int num) throws ExcepcionNumDuplicado {
        if (elementos.contains(num)) {
            throw new ExcepcionNumDuplicado(num + " es un número duplicado");
        }
        elementos.add(num);
    }

    public static void mostrarLista (List<Integer> lista) {
        System.out.println("Lista:\n" + lista);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números (hasta 10):");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = sc.nextInt();
            try {
                insertarNum(numero);
            } catch (ExcepcionNumDuplicado e) {
                System.out.println(e.getMessage());
            }
        }

        mostrarLista(elementos);
        sc.close();
    }
    
    }

