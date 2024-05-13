package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Apartamento {

	private int piso;
	private char puerta;
	private List<Propietario> propietarios;

	public Apartamento(int piso, char puerta) {
		this.piso = piso;
		this.puerta = puerta;
		this.propietarios = new ArrayList<Propietario>();
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public char getPuerta() {
		return puerta;
	}

	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}

	public List<Propietario> getPropietarios() {
		return propietarios;
	}

	public void setPropietarios(List<Propietario> propietarios) {
		this.propietarios = propietarios;
	}

	@Override
	public String toString() {
		String texto = "Apartamento " + piso + "-" + puerta + "\n";
		for (Propietario p : propietarios) {
			texto += "\t" + p.toString() + "\n";
		}
		return texto;
	}

	public void añadirPropietario(Propietario p) {
		propietarios.add(p);
	}

}
