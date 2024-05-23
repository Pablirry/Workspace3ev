package Ejercicio6;

public class Prestamo {

    private String nif;
    private String isbn;
    private String fechaPrestamo;
    private String fechaDevolucion;
    
    public Prestamo(String nif, String isbn, String fechaPrestamo, String fechaDevolucion) {
        this.nif = nif;
        this.isbn = isbn;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "\n\tPrestamo [nif=" + nif + ", isbn=" + isbn + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion="
                + fechaDevolucion + "]";
    }

    

}
