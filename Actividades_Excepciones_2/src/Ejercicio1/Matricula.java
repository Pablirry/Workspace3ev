package Ejercicio1;

public class Matricula {

	private String valor;

	public Matricula(String valor) {
		if (valor.length() == 7) {
            String numeros = valor.substring(0, 4);
            String letras = valor.substring(4, 7);
            if (numeros.matches("\\d{4}") && letras.matches("[A-Z]{3}")) {
                this.valor = valor;
            } else {
                System.out.println("La matrícula no está correctamente formada.");
                this.valor = "";
            }
        } else {
            System.out.println("La matrícula no está correctamente formada.");
            this.valor = "";
        }
	}
	

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor=valor;
	}

	@Override
	public String toString() {
		return valor;
	}

}
