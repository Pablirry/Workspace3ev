package Ejercicio1;

public class Dni implements Comparable<Dni> {

	private String valor;

	public Dni(String valor) {
		
		if (valor.length() == 9 && Character.isAlphabetic(valor.charAt(8))) {
	        String numeros = valor.substring(0, 8);
	        if (Integer.parseInt(numeros) > 0 && Integer.parseInt(numeros) < 99999999) {
	            this.valor = valor;
	        } else {
	            System.out.println("El DNI no está correctamente formado.");
	        }
	    } else {
	        System.out.println("El DNI no está correctamente formado.");
	    }
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return valor;
	}

	@Override
    public int compareTo(Dni otroDni) {
        return this.valor.compareTo(otroDni.valor);
    }

}
