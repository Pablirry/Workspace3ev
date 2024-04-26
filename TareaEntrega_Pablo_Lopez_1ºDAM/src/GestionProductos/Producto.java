package GestionProductos;

import java.util.Objects;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Producto))
            return false;
        Producto producto = (Producto) o;
        return getNombre().equals(producto.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }

    @Override
    public int compareTo(Producto other) {
        return this.nombre.compareTo(other.nombre);
    }

}
