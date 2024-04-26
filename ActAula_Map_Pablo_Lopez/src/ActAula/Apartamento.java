package ActAula;

import java.util.Objects;

public class Apartamento {
	
	private String referencia;
	private int piso;
	private char letra;
	private int capacidadMax;
	private double precio;
	private int contadorDeReservas;

	public Apartamento(int piso, char letra, int capacidadMax, double precio) {
		this.piso = piso;
		this.letra = letra;
		this.capacidadMax = capacidadMax;
		this.precio = precio;
		this.contadorDeReservas = 0;
	}
	
	public boolean referenciaCorrecta() {
		boolean validarPiso = (piso >= 1 && piso <= 5);
		boolean validarLetra = (letra >= 'A' && letra <= 'F');
		return validarPiso && validarLetra;
	}

	public String getRef() {
		return "Piso" + piso + "-Letra" + letra;
	}
	
	public void reservar() {
		if(referenciaCorrecta()){
			contadorDeReservas++;
		}else{
			System.out.println("Referencia no correcta");
		}
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public int getPiso() {
		return piso;
	}

	public char getLetra() {
		return letra;
	}

	public double getPrecio() {
		return precio;
	}

	public int getContadorDeReservas() {
		return contadorDeReservas;
	}

	@Override
	public String toString() {
		return "Apartamento [ref=" + getRef() + ", capacidadMax=" + capacidadMax + ", precio=" + precio + ", contadorDeReservas="
				+ contadorDeReservas + "]";
	}

	@Override
    public int hashCode() {
        return Objects.hash(referencia);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Apartamento other = (Apartamento) obj;
        return Objects.equals(referencia, other.referencia);
	}

}
