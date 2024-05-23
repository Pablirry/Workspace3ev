package Ejercicio6;

public class LibroNotFoundException extends Exception {

    public LibroNotFoundException(String isbn) {
        super("No se encontró el libro con ISBN " + isbn);
    }

}
