package Ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Edificio {

    private String ciudad;
    private String municipio;
    private int cp;
    private List<Apartamento> apartamentos;

    public Edificio(String ciudad, String municipio, int cp) {
        this.ciudad = ciudad;
        this.municipio = municipio;
        this.cp = cp;
        this.apartamentos = new LinkedList<Apartamento>();
    }

    public void añadirApartamento(Apartamento a) {
        apartamentos.add(a);
    }

    public Apartamento buscarApartamento(int piso, char puerta) throws ExcepcionApartamentoNoEncontrado {
        for (Apartamento a : apartamentos) {
            if (a.getPiso() == piso && a.getPuerta() == puerta) {
                return a;
            }
        }
        throw new ExcepcionApartamentoNoEncontrado("Apartamento no encontrado");
    }

    public void listarApartamentos() {
        for (Apartamento a : apartamentos) {
            System.out.println(a.toString());
        }
    }

    public void eliminarApartamento(int piso, char puerta) {
        Apartamento a = new Apartamento(piso, puerta);
        apartamentos.remove(a);
    }

    @Override
    public String toString() {
        String texto = "Edificio [municipio=" + municipio + ", ciudad=" + ciudad + ", cp=" + cp + "]";
        for (Apartamento a : apartamentos) {
            texto += "\n\t" + a.toString();
        }
        return texto;
    }

    public List<Propietario> getPropietarios(int piso, char puerta) throws ExcepcionApartamentoNoEncontrado {
        Apartamento a = this.getApartamento(piso, puerta);
        return a.getPropietarios();
    }

    public Apartamento getApartamento(int piso, char puerta) throws ExcepcionApartamentoNoEncontrado {
        for (int i = 0; i < apartamentos.size(); i++) {
            Apartamento a = apartamentos.get(i);
            if (a.getPiso() == piso && a.getPuerta() == puerta)
                return a;
        }
        throw new ExcepcionApartamentoNoEncontrado("Apartamento " + piso + "-" + puerta + " no encontrado");
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getCp() {
        return this.cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public List<Apartamento> getApartamentos() {
        return this.apartamentos;
    }

    public void setApartamentos(List<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }
}
