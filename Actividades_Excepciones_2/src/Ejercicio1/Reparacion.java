package Ejercicio1;

public class Reparacion {

	private int codReparacion;
	private String dni;
	private Matricula matricula;
	private String fecha;

	/**
	 * Constructor de la clase Reparacion
	 * 
	 * @param int       : codReparacion
	 * @param String    : dni
	 * @param Matricula : matricula
	 * @param String    : fecha
	 */
	public Reparacion(String dni, Matricula matricula, String fecha) {
		// genera un código de reparación aleatorio
		this.codReparacion = (int) (Math.random() * 10000);
		this.dni = Cliente.verificarDni(dni);// debe cumplir los mismos requisitos que en cliente
		this.matricula = matricula;
		this.fecha = fecha;
	}

	/**
	 * Devuelve el código de reparación
	 * 
	 * @return int : codReparacion
	 */
	public int getCodReparacion() {
		return codReparacion;
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
	 * Devuelve la matrícula
	 * 
	 * @return Matricula : matricula
	 */
	public Matricula getMatricula() {
		return matricula;
	}

	/**
	 * Devuelve la fecha
	 * 
	 * @return String : fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Establece el código de reparación
	 * 
	 * @param int : codReparacion
	 */
	public void setCodReparacion(int codReparacion) {
		this.codReparacion = codReparacion;
	}

	/**
	 * Establece el dni
	 * 
	 * @param String : dni
	 */
	public void setDni(String dni) {
		this.dni = Cliente.verificarDni(dni);
	}

	/**
	 * Establece la matrícula
	 * 
	 * @param Matricula : matricula
	 */
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	/**
	 * Establece la fecha
	 * 
	 * @param String : fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	/**
	 * Método que devuelve la representación en cadena de un objeto
	 * 
	 * @return String : representación en cadena de un objeto
	 */
	public String toString() {
		return "Reparacion{" + "codReparacion=" + codReparacion + ", dni=" + dni + ", matricula=" + matricula.toString()
				+ ", fecha=" + fecha + '}';
	}

}
