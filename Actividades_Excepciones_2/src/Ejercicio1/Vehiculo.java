package Ejercicio1;

public class Vehiculo {

	protected Matricula matricula;
	protected int km;

	public Vehiculo(Matricula matricula, int km) {
		this.matricula = matricula;
		this.km = km;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public int getKm() {
		return km;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public void setKm(int km) {
		this.km = km;
	}

	

}
