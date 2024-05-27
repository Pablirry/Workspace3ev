package Ejercicio1;

public class Moto extends Vehiculo {

	private int cilindrada;

	/**
	 * Constructor de la clase Moto
	 * 
	 * @param String : matrícula
	 * @param int    : km
	 * @param int    : cilindrada
	 */
	public Moto(Matricula matricula, int km, int cilindrada) {
		super(matricula, km);
		this.cilindrada = cilindrada;
	}

	/**
	 * Devuelve la cilindrada
	 * 
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * Devuelve la representación en cadena de un objeto
	 * 
	 * @return String : representación en cadena de un objeto
	 */
	@Override
	public String toString() {
		return "Moto{" + "matricula=" + getMatricula().toString() + ", km=" + getKm() + ", cilindrada=" + cilindrada
				+ '}';
	}

}
