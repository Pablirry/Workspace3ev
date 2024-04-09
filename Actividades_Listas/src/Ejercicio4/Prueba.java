package Ejercicio4;

public class Prueba {

    public static void main(String[] args) {
        Cine cine = new Cine();

        // Llenar la cola con algunas personas
        cine.llenarCola();

        // Listar personas en la cola
        cine.listarCola();

        // Crear una sesión
        cine.crearSesion("Título de la película", "2024/05/12-21:00");
        cine.crearSesion("Título de la película2", "2024/05/12-21:00");

        // Añadir personas a la sesión creada
        cine.añadirPersonaSesion(1, new Persona("Persona 4"));
        cine.añadirPersonaSesion(1, new Persona("Persona 5"));
        cine.añadirPersonaSesion(1, new Persona("Persona 6"));

        // Listar sesiones
        cine.listarSesiones();

        System.out.println("************************************************");
        // Mostrar el cine
        cine.mostrarCine();
    }

    }
