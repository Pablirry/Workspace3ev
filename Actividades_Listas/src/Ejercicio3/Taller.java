package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Taller {

    static Scanner sc = new Scanner(System.in);

    static List<Coche> taller = new ArrayList<>();
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
                    entradaNuevaReparacion();
                    break;
                case 2:
                    salidaCocheReparado();
                    break;
                case 3:
                    listarVehiculos();
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

    public static void entradaNuevaReparacion() {
        System.out.println("\nRegistrando entrada de nuevo vehículo:");
        System.out.print("Propietario: ");
        String propietario = sc.nextLine();
        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        taller.add(new Coche(propietario, matricula, marca, false));
        System.out.println("Entrada registrada exitosamente.");
    }

    public static void salidaCocheReparado() {
        System.out.println("\nSalida de coche reparado:");
        System.out.print("Ingrese el nombre del propietario: ");
        String nombre = sc.nextLine();
        boolean encontrado = false;
        for (Coche coche : taller) {
            if (coche.propietario.equalsIgnoreCase(nombre)) {
                coche.reparado = true;
                System.out.println("Coche encontrado y marcado como reparado.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún coche con ese propietario.");
        }
    }

    public static void listarVehiculos() {
        System.out.println("\nListado de vehículos en el taller:");
        if (taller.isEmpty()) {
            System.out.println("No hay vehículos en el taller.");
        } else {
            for (Coche coche : taller) {
                System.out.println(coche);
            }
        }

    }

}
