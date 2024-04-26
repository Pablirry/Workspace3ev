package GestionProductos;

import java.util.Objects;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private int cantidad;
    private double precio;

    /**
     * Constructor clase producto
     * 
     * @param nombre   : String
     * @param cantidad : entero
     * @param precio   : double
     */

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * Metodo get del atributo nombre
     * 
     * @return : String
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo get del atributo cantidad
     * 
     * @return : entero
     */

    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo double del atributo precio
     * 
     * @return : real
     */

    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo double del atributo precio
     * 
     * @param precio : real
     */

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo equals
     */

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Producto))
            return false;
        Producto producto = (Producto) o;
        return getNombre().equals(producto.getNombre());
    }

    /**
     * Metodo Hash
     */

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }

    /**
     * Metodo CompareTo
     */

    @Override
    public int compareTo(Producto other) {
        return this.nombre.compareTo(other.nombre);
    }

}
