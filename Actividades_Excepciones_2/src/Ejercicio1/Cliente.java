package Ejercicio1;

public class Cliente implements Comparable<Cliente> {

	// formato del dni 8 dígitos y una letra
	private String dni;
	private String nombre;
	private String telefono;

	/**
	 * Constructor de la clase Cliente
	 * 
	 * @param String : dni
	 * @param String : nombre
	 * @param String : telefono
	 */
	public Cliente(String dni, String nombre, String telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	/**
	 * Devuelve el dni
	 * 
	 * @return String : dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Devuelve el nombre
	 * 
	 * @return String : nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el teléfono
	 * 
	 * @return String : telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Establece el dni
	 * 
	 * @param String : dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Establece el nombre
	 * 
	 * @param String : nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Establece el teléfono
	 * 
	 * @param String : telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	/**
	 * Método que devuelve la representación en cadena de un objeto
	 * 
	 * @return String : representación en cadena de un objeto
	 */
	public String toString() {
		return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + '}';
	}

	/**
	 * formato del dni 8 dígitos y una letra
	 * 
	 * @param dni
	 * @return
	 */
	public static String verificarDni(String dni) {
		boolean correcto = true;
		// longitud
		if (dni.length() != 9) {
			System.err.println("El DNI debe tener 9 caracteres");
			correcto = false;
		}
		// verificar letra
		if (Character.isDigit(dni.charAt(8))) {
			System.err.println("La última posición debe no ser un digito");
			correcto = false;
		}
		// 1 a 8 dígitos
		for (int i = 0; i < 8; i++) {
			if (!Character.isDigit(dni.charAt(i))) {
				System.err.println("Las posiciones 1 a 8 deben ser dígitos");
				correcto = false;
			}
		}
		return correcto ? dni : "";
	}

	/**
	 * Compara dos clientes
	 * 
	 * @param Cliente : otroCliente
	 * @return int : compareTo
	 */
	@Override
	public int compareTo(Cliente otroCliente) {
		return this.dni.compareTo(otroCliente.dni);
	}

}
