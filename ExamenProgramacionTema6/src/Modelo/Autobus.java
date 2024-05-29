package Modelo;

import java.util.ArrayList;
import java.util.List;
import Excepciones.FormatoExcepcion;

public class Autobus {
	private static int diasMes[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private Matricula matricula;
	private int numPlazas;
	private double precioDia;
	private double precioKm;
	private List<Integer> calendario;

	public Autobus(String m, int numPlazas, double precioKm) throws FormatoExcepcion {
		this.matricula = new Matricula(m);
		this.numPlazas = numPlazas;
		this.precioKm = precioKm;
		this.precioDia = 100.0; // Precio base diario fijo
		this.calendario = new ArrayList<>();
	}

	public static int CalcularDia(String fecha) throws FormatoExcepcion {
		String[] partes = fecha.split("/");
		if (partes.length != 3) {
			throw new FormatoExcepcion("La fecha debe tener el formato dd/mm/aaaa.");
		}
		int dia = Integer.parseInt(partes[0]);
		int mes = Integer.parseInt(partes[1]);
		int anio = Integer.parseInt(partes[2]);

		// Verificar que el mes está en el rango válido
		if (mes < 1 || mes > 12) {
			throw new FormatoExcepcion("ERROR fecha en mes fuera de rango");
		}

		// Verificar que el día está en el rango válido para el mes
		if (dia < 1 || dia > diasMes[mes - 1]) {
			if (mes == 2 && dia > 28) {
				throw new FormatoExcepcion("ERROR fecha el mes 2 no tiene " + dia);
			} else {
				throw new FormatoExcepcion("ERROR fecha en dia fuera de rango");
			}
		}

		int diaTotal = 0;
		for (int i = 0; i < mes - 1; i++) {
			diaTotal += diasMes[i];
		}
		diaTotal += dia;
		return diaTotal;
	}

	public void alquilar(String fechaAlquiler, int numDiasAlquiler) throws FormatoExcepcion {
        int diaInicio = CalcularDia(fechaAlquiler);
        for (int i = 0; i < numDiasAlquiler; i++) {
            calendario.add(diaInicio + i);
        }
    }

    public boolean estaDisponible(String fechaInicio, int numDias) throws FormatoExcepcion {
        int diaInicio = CalcularDia(fechaInicio);
        for (int i = 0; i < numDias; i++) {
            if (calendario.contains(diaInicio + i)) {
                return false;
            }
        }
        return true;
    }

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public double getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}

	public double getPrecioKm() {
		return precioKm;
	}

	public void setPrecioKm(double precioKm) {
		this.precioKm = precioKm;
	}

	public List<Integer> getCalendario() {
		return calendario;
	}

	public void setCalendario(List<Integer> calendario) {
		this.calendario = calendario;
	}

	@Override
	public String toString() {
		return "\n\tmatricula=" + matricula + ", numPlazas=" + numPlazas + ", precioDia=" + precioDia
				+ ", precioKm=" + precioKm + ", calendario=" + calendario + "]";
	}

}
