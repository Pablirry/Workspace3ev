package Examen;

public class Reparacion {

    private int codReparacion;
    private Cliente dniCliente;
    private Matricula matricula;
    private Vehiculo vehiculo;
    private String fecha;

    public Reparacion(int codReparacion, Cliente dniCliente, Matricula matricula, Vehiculo vehiculo, String fecha) {
        this.codReparacion = codReparacion;
        this.dniCliente = dniCliente;
        this.matricula = matricula;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
    }

    public int getCodReparacion() {
        return codReparacion;
    }

    public void setCodReparacion(int codReparacion) {
        this.codReparacion = codReparacion;
    }

    public Cliente getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Cliente dniCliente) {
        this.dniCliente = dniCliente;
    }


    public Matricula getMatricula() {
        return matricula;
    }


    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Reparación " + this.codReparacion + ": Cliente " + this.dniCliente.getDni() + ", Vehículo " + this.vehiculo.toString() + ", Fecha " + this.fecha;
    }

}
