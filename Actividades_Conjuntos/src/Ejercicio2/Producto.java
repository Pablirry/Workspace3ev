package Ejercicio2;

public class Producto implements Comparable<Producto>  {

    private String nombre;
    private int cantidad;
    private int precio;

    public Producto(int numero, String nombre, int cantidad, int precio) {
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

}
