package Ejercicio6;

public class Principal {

    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca("Biblioteca");
        cargaDatos(biblio);

        System.out.println("Prueba de obtener libro:");
        try {
            Libro libro = biblio.getLibro("11122");
            System.out.println("ISBN: " + libro.getISBN() + ", Título: " + libro.getTitulo());
        } catch (LibroNotFoundException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\nPrueba de obtener socio:");
        try {
            Socio socio = biblio.getSocio("234X");
            System.out.println("NIF: " + socio.getNif() + ", Nombre: " + socio.getNombre() + " " + socio.getApellidos());
        } catch (SocioNotFoundException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\nPrueba de comprobar préstamo:");
        try {
            boolean haTomadoPrestado = biblio.haTomadoPrestado("234X", "11111");
            System.out.println("El socio con NIF '234X' ha tomado prestado el libro con ISBN '11111': " + haTomadoPrestado);
        } catch (SocioNotFoundException | LibroNotFoundException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(biblio.toString());
    }

    private static void cargaDatos(Biblioteca biblio) {

        biblio.addSocio(new Socio("234X", "nom1", "ape", "cod1", "33001"));
        biblio.addSocio(new Socio("235X", "nom2", "ape", "cod2", "33002"));
        biblio.addSocio(new Socio("234X", "nom3", "ape", "cod3", "33003"));
        biblio.addSocio(new Socio("237X", "nom4", "ape", "cod4", "33004"));
        biblio.addSocio(new Socio("238X", "nom5", "ape", "cod5", "33005"));


        biblio.addLibro(new Libro("11111", "libro1", "autor", Genero.COMEDIA));
        biblio.addLibro(new Libro("22222", "libro2", "autor", Genero.DRAMA));
        biblio.addLibro(new Libro("33333", "libro3", "autor", Genero.HISTORIA));
        biblio.addLibro(new Libro("44444", "libro4", "autor", Genero.HISTORIA));

        biblio.addPrestamo(new Prestamo("234X", "11111", "20250510", "20250512"));
        biblio.addPrestamo(new Prestamo("234X", "22222", "20250510", "20250512"));
        biblio.addPrestamo(new Prestamo("235X", "33333", "20250510", "20250515"));
        biblio.addPrestamo(new Prestamo("235X", "44444", "20250510", "20250515"));
        biblio.addPrestamo(new Prestamo("236X", "11111", "20250510", "20250515"));



    }

}
