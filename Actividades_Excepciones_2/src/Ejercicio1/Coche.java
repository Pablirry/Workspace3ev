package Ejercicio1;

public class Coche extends Vehiculo {

	private String marca;
	private String modelo;

	/**
	 * Constructor de la clase Coche
	 * 
	 * @param String : matrícula
	 * @param int    : km
	 * @param String : marca
	 * @param String : modelo
	 */
	public Coche(Matricula matricula, int km, String marca, String modelo) {
		super(matricula, km);
		this.marca = marca;
		this.modelo = modelo;
	}

	/**
	 * Devuelve la marca
	 * 
	 * @return String : marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Devuelve el modelo
	 * 
	 * @return String : modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Devuelve la representación en cadena de un objeto
	 * 
	 * @return String : representación en cadena de un objeto
	 */
	@Override
	public String toString() {
		return "Coche{" + "matricula=" + getMatricula().toString() + ", km=" + getKm() + ", marca=" + marca
				+ ", modelo=" + modelo
				+ '}';
	}

}
