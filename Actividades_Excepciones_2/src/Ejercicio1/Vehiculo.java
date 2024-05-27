package Ejercicio1;

public abstract class Vehiculo {

	private Matricula matricula;
	private int km;

	/**
	 * Constructor para la clase vehiculo
	 * 
	 * @param String : matrícula
	 * @param int    : km
	 */
	public Vehiculo(Matricula matricula, int km) {
		this.matricula = matricula;
		this.km = km;
	}

	/**
	 * Devuelve la matrícula
	 * 
	 * @return String : matrícula
	 */
	public Matricula getMatricula() {
		return matricula;
	}

	/**
	 * Devuelve los kilómetros
	 * 
	 * @return int : km
	 */
	public int getKm() {
		return km;
	}

	/**
	 * Establece los kilómetros
	 * 
	 * @param int : km
	 */
	public void setKm(int km) {
		this.km = km;
	}

	/**
	 * Establece la matricula
	 * 
	 * @param String : matricula
	 */
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	@Override
	/**
	 * Método que devuelve la representación en cadena de un objeto
	 * 
	 * @return String : toString de las subclases
	 */
	public abstract String toString();

}
