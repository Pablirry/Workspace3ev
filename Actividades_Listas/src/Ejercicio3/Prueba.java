package Ejercicio3;

import java.util.Scanner;
public class Prueba {

    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){

        int opcion;
        do {
            System.out.println("\nOpciones:");
            System.out.println("1.- Entrada nueva reparación");
            System.out.println("2.- Salida de coche reparado");
            System.out.println("3.- Listado de vehículos");
            System.out.println("4.- Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    Taller.entradaNuevaReparacion();
                    break;
                case 2:
                    Taller.salidaCocheReparado();
                    break;
                case 3:
                    Taller.listarVehiculos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }

}
