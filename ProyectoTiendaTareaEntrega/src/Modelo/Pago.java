package Modelo;

import Excepciones.ExcepcionPagoInvalido;

public class Pago {

	private double monto;
	private String metodoPago;

	public Pago(double monto, String metodoPago) {
		this.monto = monto;
		this.metodoPago = metodoPago;
	}

	public void realizarPago() throws ExcepcionPagoInvalido {
		if (monto < 0) {
			throw new ExcepcionPagoInvalido("Pago inválido");
		}
	}

	public double getMonto() {
		return monto;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	@Override
	public String toString() {
		return "Pago [monto=" + monto + ", metodoPago=" + metodoPago + "]";
	}

}
