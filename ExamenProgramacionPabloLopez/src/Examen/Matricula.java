package Examen;

public class Matricula {

	private String matricula;

	public String validarMatricula() {
		if (this.matricula.matches("[A-Z]{1}-[0-9]{4}-[A-Z]{2}")) {
			return "Matricula valida";
		} else {
			return "";
		}
	}

	public Matricula(String matricula) {
		this.matricula = matricula;
		if (!validarMatricula().equals("Matricula valida")) {
			this.matricula = "";
		}
	}

	public Matricula() {
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
