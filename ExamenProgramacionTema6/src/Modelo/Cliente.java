package Modelo;

public class Cliente implements Comparable<Cliente> {
	private String nif;
	private String nombre;

	public Cliente(String nif, String nombre) {
		this.nif = nif;
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Cliente o) {
		return nif.compareTo(o.nif);
	}

	@Override
	public int hashCode() {
		return nif.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Cliente otro = (Cliente) obj;
		return nif.equals(otro.nif);
	}

	@Override
	public String toString() {
		return "Cliente [nif=" + nif + ", nombre=" + nombre + "]";
	}

}
