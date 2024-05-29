package Modelo;

import Excepciones.ExamenExcepcion;

public class Alquiler {
	private Autobus autobus;
	private String nifCliente;
	private String fechaAlquiler;
	private int numDiasAlquiler;
	private int kms;

	public Alquiler(Autobus a, String nifCliente, String fechaAlquiler, int numDiasAlquiler, int km) throws ExamenExcepcion {
		this.autobus = a;
        this.nifCliente = nifCliente;
        setFechaAlquiler(fechaAlquiler);
        this.numDiasAlquiler = numDiasAlquiler;
        this.kms = km;
	}

	public double calcularImporte() {
		double precioBaseDiario = 100.0;
		double precioKm = this.autobus.getPrecioKm();

		return (precioBaseDiario * numDiasAlquiler) + (precioKm * kms);
	}

	public Autobus getAutobus() {
		return autobus;
	}

	public String getNifCliente() {
		return nifCliente;
	}

	public String getFechaAlquiler() {
		return fechaAlquiler;
	}

	public int getNumDiasAlquiler() {
		return numDiasAlquiler;
	}

	public int getKms() {
		return kms;
	}

	public void setAutobus(Autobus autobus) {
		this.autobus = autobus;
	}

	public void setNifCliente(String nifCliente) {
		this.nifCliente = nifCliente;
	}

	public void setFechaAlquiler(String fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public void setNumDiasAlquiler(int numDiasAlquiler) {
		this.numDiasAlquiler = numDiasAlquiler;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	@Override
	public String toString() {
		return "Alquiler [autobus=" + autobus + ", nifCliente=" + nifCliente + ", fechaAlquiler=" + fechaAlquiler
				+ ", numDiasAlquiler=" + numDiasAlquiler + ", kms=" + kms + "]";
	}

}
