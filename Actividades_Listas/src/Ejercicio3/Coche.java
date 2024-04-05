package Ejercicio3;

public class Coche {

    protected String propietario;
    protected String matricula;
    protected String marca;
    protected boolean reparado;

    public Coche(String propietario, String matricula, String marca) {
        this.propietario = propietario;
        this.matricula = matricula;
        this.marca = marca;
        this.reparado = false;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche [propietario=" + propietario + ", matricula=" + matricula + ", marca=" + marca + ", reparado="
                + reparado + "]";
    }   

}
