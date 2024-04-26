package ActAula;

import java.util.HashMap;
import java.util.Map;

public class GestorApartamentos {

	private Map<String, Apartamento> apartamentos;

	public GestorApartamentos() {
		this.apartamentos = new HashMap<>();
	}

	public void añadirApartamento(int piso, char letra, int capacidadMax, double precio) {
		String referencia = "Piso" + piso + "-Letra" + letra;
		if (apartamentos.containsKey(referencia)) {
			System.err.println("Error, clave duplicada");
			return;
		}
		if (piso < 1 || piso > 3 || letra < 'A' || letra > 'E') {
			System.err.println("Error, referencia no correcta");
			return;
		}
		Apartamento apartamento = new Apartamento(piso, letra, capacidadMax, precio);
		apartamentos.put(referencia, apartamento);
	}

	public void mostrarApartamentos() {
		for (Apartamento apartamento : apartamentos.values()) {
			System.out.println(apartamento);
		}
	}

	public void buscarApartamentosPorCapacidad(int capacidad) {
		for (Apartamento apartamento : apartamentos.values()) {
			if (apartamento.getCapacidadMax() >= capacidad) {
				System.out.println(apartamento);
			}
		}
	}

	public void eliminarApartamento(String referencia) {
		if (!apartamentos.containsKey(referencia)) {
			apartamentos.remove(referencia);
		} else {
			System.out.println("Error al eliminar apartamento");
		}
	}

	public void hacerReserva(String referencia, int numPersonas) {
		if (apartamentos.containsKey(referencia)) {
			Apartamento apartamento = apartamentos.get(referencia);
			if (apartamento.getCapacidadMax() >= numPersonas) {
				apartamento.reservar();
			}
		}else{
			System.out.println("Apartamento no encontrado");
		}

	}

	public void mostrarApartamentosPorPiso(int piso) {
		boolean encontrado = false;
		for (Apartamento apartamento : apartamentos.values()) {
			if (apartamento.getPiso() == piso) {
				System.out.println(apartamento);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No hay apartamentos registrados.");
		}
	}

	public void apartamentoConMayorCapacidad() {
		Apartamento maxCapacidadAp = null;
		int maxCapacidad = 0;
		for (Apartamento apartamento : apartamentos.values()) {
			if (apartamento.getCapacidadMax() > maxCapacidad) {
				maxCapacidad = apartamento.getCapacidadMax();
				maxCapacidadAp = apartamento;
			}
		}
		if (maxCapacidadAp != null) {
			System.out.println(maxCapacidadAp);
		} else {
			System.out.println("No hay apartamentos registrados.");
		}
	}

}
