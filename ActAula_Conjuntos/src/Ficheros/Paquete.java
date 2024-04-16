package Ficheros;

public class Paquete {
	private String codigo;
	private String direccion;
	private int cp;

	public Paquete(String codigo, String direccion, int cp) {
		this.codigo = codigo;
		this.direccion = direccion;
		this.cp = cp;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getCp() {
		return cp;
	}

	@Override
	public String toString() {
		return "Paquete [codigo=" + codigo + ", direccion=" + direccion + ", cp=" + cp + "]";
	}
}
