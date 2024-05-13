package Modelo;

import java.util.Date;

public class Alquiler {
	static int CONTADOR=1;
	int codAlquiler;
	int codsocio;
	String codEjemplar;
	Date fechaAlquiler;
	Date fechaDevolución;
	public int getCodsocio() {
		return codsocio;
	}
	public String getCodEjemplar() {
		return codEjemplar;
	}
	public Date getFechaAlquiler() {
		return fechaAlquiler;
	}
	public Date getFechaDevolución() {
		return fechaDevolución;
	}
	public void setCodsocio(int codsocio) {
		this.codsocio = codsocio;
	}
	public void setCodEjemplar(String codEjemplar) {
		this.codEjemplar = codEjemplar;
	}
	public void setFechaAlquiler(Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}
	public void setFechaDevolución(Date fechaDevolución) {
		this.fechaDevolución = fechaDevolución;
	}
	public Alquiler(int codsocio, String codEjemplar, Date fechaAlquiler, Date fechaDevolución) {
		codAlquiler=CONTADOR++;
		this.codsocio = codsocio;
		this.codEjemplar = codEjemplar;
		this.fechaAlquiler = fechaAlquiler;
		this.fechaDevolución = fechaDevolución;
	}
	@Override
	public String toString() {
		return "Alquiler [codAlquiler="+codAlquiler+" codSocio=" + codsocio + ", codEjemplar=" + codEjemplar + ", fechaAlquiler=" + fechaAlquiler
				+ ", fechaDevolución=" + fechaDevolución + "]";
	}
	public int getCodalquiler() {
		return codAlquiler;
	}
	public void setCodalquiler(int codalquiler) {
		this.codAlquiler = codalquiler;
	}
	
	
}
