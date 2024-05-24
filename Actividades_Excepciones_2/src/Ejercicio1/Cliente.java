package Ejercicio1;

public class Cliente implements Comparable<Cliente> {

	private Dni dni;
	private String nombre;
	private String telefono;

	public Cliente(Dni dni, String nombre, String telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public Dni getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setDni(Dni dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
	    return "Cliente [dni=" + dni.toString() + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	@Override
    public int compareTo(Cliente otroCliente) {
        return this.getDni().compareTo(otroCliente.getDni());
    }

}
