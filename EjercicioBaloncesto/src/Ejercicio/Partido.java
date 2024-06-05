package Ejercicio;

/*
 * Para los partidos tendremos la siguiente información:
• codPartido
o formado por la fecha en la que se juega con formato dd/mm/aaaa y
código del estadio formado por una letra mayúscula.
• Las dos selecciones que participan
o Equipo A
o Equipo B
• Resultado
o Equipo A : resultado
o Equipo B : resultado
 */

public class Partido {

	private String codPartido;
	private Seleccion equipoA;
	private Seleccion equipoB;
	private int resultadoA;
	private int resultadoB;

	public Partido(String codPartido, Seleccion equipoA, Seleccion equipoB) {
		this.codPartido = codPartido;
		this.equipoA = equipoA;
		this.equipoB = equipoB;
	}

	public String getCodPartido() {
		return codPartido;
	}

	public Seleccion getEquipoA() {
		return equipoA;
	}

	public Seleccion getEquipoB() {
		return equipoB;
	}

	public void setResultados(int resultadoA, int resultadoB) {
		this.resultadoA = resultadoA;
		this.resultadoB = resultadoB;
	}

	public int getResultadoA() {
		return resultadoA;
	}

	public int getResultadoB() {
		return resultadoB;
	}

	public void setCodPartido(String codPartido) {
		this.codPartido = codPartido;
	}

	public void setEquipoA(Seleccion equipoA) {
		this.equipoA = equipoA;
	}

	public void setEquipoB(Seleccion equipoB) {
		this.equipoB = equipoB;
	}

	public void setResultadoA(int resultadoA) {
		this.resultadoA = resultadoA;
	}

	public void setResultadoB(int resultadoB) {
		this.resultadoB = resultadoB;
	}

	@Override
	public String toString() {
		return "Código Partido: " + codPartido + ", Equipo A: " + equipoA.getNombre() + " (" + resultadoA
				+ ") vs Equipo B: " + equipoB.getNombre() + " (" + resultadoB + ")";
	}
}
