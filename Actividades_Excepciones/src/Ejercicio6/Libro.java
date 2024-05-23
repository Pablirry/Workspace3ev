package Ejercicio6;



public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private Genero generos;

    public Libro(String ISBN, String titulo, String autor, Genero generos) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.generos = generos;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Genero getGeneros() {
        return generos;
    }

    public void setGeneros(Genero generos) {
        this.generos = generos;
    }

    @Override
    public String toString() {
        return "\n\tLibro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", generos=" + generos + "]";
    }

}
