package Examen;

import java.util.Objects;

public class Vehiculo {

    protected Matricula matriculaValidator = new Matricula();
    protected Matricula matricula;
    protected int km;

    public Vehiculo(Matricula matricula, int km) {
        if (matricula.validarMatricula().equals("Matricula valida")) {
            this.matricula = matricula;
        } else {
            this.matricula = new Matricula();
        }
        this.km = km;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        if (matricula.validarMatricula().equals("Matricula valida")) {
            this.matricula = matricula;
        }
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula.getMatricula() + ", km=" + km + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vehiculo vehiculo = (Vehiculo) obj;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

}
