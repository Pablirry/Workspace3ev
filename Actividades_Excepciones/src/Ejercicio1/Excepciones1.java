package Ejercicio1;

public class Excepciones1 {

	public static void main(String[] args) {
		
		int n = 10;
		int d = 0;
		try {
			
			int resultado = n / d;
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: no se puede dividir un numero entre cero");
		}

	}

}
