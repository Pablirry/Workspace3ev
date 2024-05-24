package Ejercicio1;

public class Moto extends Vehiculo {

	private int cilindrada;

	public Moto(Matricula matricula, int km, int cilindrada) {
		super(matricula, km);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto: " + matricula + ", km: " + getKm() + ", cilindrada: " + cilindrada;
	}

}
