package Ejercicio2;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private int cantidad;
    private int precio;

    public Producto(int numero) {
        this.nombre = "Producto" + numero;
        this.cantidad = (int) (Math.random() * 50) + 1;
        this.precio = (int) (Math.random() * 100) + 1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto p) {
        return this.nombre.compareTo(p.nombre);
    }

}
