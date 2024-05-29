package Modelo;

import java.util.Objects;

import Excepciones.FormatoExcepcion;

public class Matricula {
	private String cadena;

	public Matricula(String m) throws FormatoExcepcion {
		comprobarMatricula(m);
		this.cadena = m;

	}

	private void comprobarMatricula(String m) throws FormatoExcepcion {
		if (m.length() != 8) {
			throw new FormatoExcepcion("ERROR matricula long!= 8");
		}
		if (!m.matches("[0-9]{4}-[A-Z]{3}")) {
			if (!m.contains("-")) {
				throw new FormatoExcepcion("ERROR matricula no guion");
			}
			String[] partes = m.split("-");
			if (partes.length != 2) {
				throw new FormatoExcepcion("ERROR matricula no guion");
			}
			if (!partes[0].matches("[0-9]{4}")) {
				throw new FormatoExcepcion("ERROR matricula no digito pos:" + partes[0].length());
			}
			if (!partes[1].matches("[A-Z]{3}")) {
				for (int i = 0; i < partes[1].length(); i++) {
					if (!Character.isLetter(partes[1].charAt(i))) {
						throw new FormatoExcepcion("ERROR matricula no caracter pos:" + (4 + i + 1));
					}
				}
			}
			throw new FormatoExcepcion("ERROR matricula no guion");
		}

	}

	@Override
	public String toString() {
		return  cadena;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cadena);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		return Objects.equals(cadena, other.cadena);
	}

}
