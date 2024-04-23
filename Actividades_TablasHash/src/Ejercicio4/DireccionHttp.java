package Ejercicio4;

public class DireccionHttp {

    private String servidor;
    private int puerto;
    private String direccion;

    public DireccionHttp(String servidor, int puerto, String direccion) {
        this.servidor = servidor;
        this.puerto = puerto;
        this.direccion = direccion;
    }

    public String getServidor() {
        return this.servidor;
    }

    public int getPuerto() {
        return this.puerto;
    }

    public String getDireccion() {
        return this.direccion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        DireccionHttp that = (DireccionHttp) obj;
        return puerto == that.puerto &&
                servidor.equals(that.servidor) &&
                direccion.equals(that.direccion);
    }

    @Override
    public int hashCode() {
        int result = servidor.hashCode();
        result = 31 * result + puerto;
        result = 31 * result + direccion.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DireccionHttp [servidor=" + servidor + ", puerto=" + puerto + ", ruta=" + direccion + "]";
    }

}
