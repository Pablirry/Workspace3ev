package Ejercicio1;

@SuppressWarnings("rawtypes")
public class Habitacion implements Comparable {

    private String codigo;
    private double precio;
    private TipoHabitacion tipo;
    private boolean estaReservada;

    public Habitacion(int piso, char letra, double precio, TipoHabitacion tipo) {
        codigo = "" + piso + letra;
        this.precio = precio;
        this.tipo = tipo;
        estaReservada = false;
    }

    @Override
    public String toString() {
        return "Habitacion [codigo=" + codigo + ", precio=" + precio + ", tipo=" + tipo + ", estaReservada="
                + estaReservada + "]";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public boolean isEstaReservada() {
        return estaReservada;
    }

    public void setEstaReservada(boolean estaReservada) {
        this.estaReservada = estaReservada;
    }

    @Override
    public int compareTo(Object o) {
        Habitacion obj = (Habitacion) o;
        if (this.codigo == obj.codigo)
            return 0;
        if (this.codigo.compareTo(obj.codigo) < 0)
            return 0;
        return 1;
    }

}
