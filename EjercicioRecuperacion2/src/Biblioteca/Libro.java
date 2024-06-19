package Biblioteca;

public class Libro implements Comparable<Libro> {

	private int codLibro;
	private String isbn;
	private String titulo;
	private String autor;

	public Libro(int codLibro, String isbn, String titulo, String autor) {
		this.codLibro = codLibro;
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}

	public int getCodLibro() {
		return codLibro;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setCodLibro(int codLibro) {
		this.codLibro = codLibro;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro{" + "codigo=" + codLibro + ", isbn='" + isbn + ", titulo='" + titulo + ", autor='" + autor + '}';
	}

	@Override
	public int compareTo(Libro obj) {
		return isbn.compareTo(obj.isbn);
	}

}
