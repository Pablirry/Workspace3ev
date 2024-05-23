package Ejercicio6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Biblioteca {

    private String nombre;
    private Set<Socio> socios;
    private Map<String, Libro> libros;
    private List<Prestamo> prestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.socios = new HashSet<>();
        this.libros = new HashMap<>();
        this.prestamos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Set<Socio> getSocios() {
        return socios;
    }



    public void setSocios(Set<Socio> socios) {
        this.socios = socios;
    }



    public Map<String, Libro> getLibros() {
        return libros;
    }



    public void setLibros(Map<String, Libro> libros) {
        this.libros = libros;
    }



    public List<Prestamo> getPrestamos() {
        return prestamos;
    }



    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }



    public void addSocio(Socio socio) {
        socios.add(socio);
    }

    public void addLibro(Libro libro) {
        libros.put(libro.getISBN(), libro);
    }

    public void addPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public Libro getLibro(String isbn) throws LibroNotFoundException {
        if (libros.containsKey(isbn)) {
            return libros.get(isbn);
        } else {
            throw new LibroNotFoundException(isbn);
        }
    }

    public Socio getSocio(String nif) throws SocioNotFoundException {
        for (Socio socio : socios) {
            if (socio.getNif().equals(nif)) {
                return socio;
            }
        }
        throw new SocioNotFoundException(nif);
    }

    public boolean haTomadoPrestado(String nif, String isbn) throws SocioNotFoundException, LibroNotFoundException {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getNif().equals(nif) && prestamo.getIsbn().equals(isbn)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + "\n\tsocios=" + socios + "\n\tlibros=" + libros + "\n\tprestamos=" + prestamos
                + "]";
    }

}
