package Ejercicio3;

import java.util.Scanner;

public class Gestor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Login login = new Login("", ""); // Inicialización de login sin valores

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Nuevo registro");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Modificar contraseña");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opción:");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre de usuario:");
                    String nuevoUsuario = scanner.nextLine();
                    System.out.println("Ingrese contraseña:");
                    String nuevaContrasena = scanner.nextLine();
                    login.nuevoRegistro(nuevoUsuario, nuevaContrasena);
                    break;
                case 2:
                    System.out.println("Ingrese nombre de usuario:");
                    String usuarioLogin = scanner.nextLine();
                    System.out.println("Ingrese contraseña:");
                    String contrasenaLogin = scanner.nextLine();
                    login.login(usuarioLogin, contrasenaLogin);
                    break;
                case 3:
                    System.out.println("Ingrese nombre de usuario:");
                    String usuarioModificar = scanner.nextLine();
                    System.out.println("Ingrese contraseña actual:");
                    String contrasenaActual = scanner.nextLine();
                    System.out.println("Ingrese nueva contraseña:");
                    String nuevaContrasenaModificada = scanner.nextLine();
                    login.modificarContraseña(usuarioModificar, contrasenaActual, nuevaContrasenaModificada);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();

    }
}
