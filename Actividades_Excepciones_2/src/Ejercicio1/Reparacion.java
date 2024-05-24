package Ejercicio1;

public class Reparacion {

	private int codReparacion;
	private Dni dniCliente;
	private Matricula matriculaVehiculo;
	private String fecha;

	public Reparacion(int codReparacion, Dni dniCliente, Matricula matriculaVehiculo, String fecha) {
		this.codReparacion = codReparacion;
		this.dniCliente = dniCliente;
		this.matriculaVehiculo = matriculaVehiculo;
		this.fecha = fecha;
	}

	public int getCodReparacion() {
		return codReparacion;
	}

	public Dni getDniCliente() {
		return dniCliente;
	}

	public Matricula getMatriculaVehiculo() {
		return matriculaVehiculo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setCodReparacion(int codReparacion) {
		this.codReparacion = codReparacion;
	}

	public void setDniCliente(Dni dniCliente) {
		this.dniCliente = dniCliente;
	}

	public void setMatriculaVehiculo(Matricula matriculaVehiculo) {
		this.matriculaVehiculo = matriculaVehiculo;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
	    return "Reparación: " + codReparacion + ", cliente: " + dniCliente.toString() + ", vehículo: " + matriculaVehiculo.toString()
	            + ", fecha: " + fecha;
	}

}
