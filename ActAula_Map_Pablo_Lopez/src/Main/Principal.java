package Main;

import ActAula.GestorApartamentos;

public class Principal {

	public static void main(String[] args) {
		
		GestorApartamentos gestor=new GestorApartamentos();
		
		gestor.añadirApartamento(1,'A',6,1500.0);
		gestor.añadirApartamento(1,'B',2,50.0);
		gestor.añadirApartamento(1,'C',4,100.0);
		gestor.añadirApartamento(1,'D',8,200.0);
		
		gestor.añadirApartamento(2,'A',10,500.0);
		gestor.añadirApartamento(2,'D',12,600.0);
		
		gestor.añadirApartamento(3,'A',2,500.0);
		gestor.añadirApartamento(3,'B',2,50.0);
		gestor.añadirApartamento(3,'C',2,50.0);
		gestor.añadirApartamento(3,'D',2,50.0);
		gestor.añadirApartamento(3,'E',2,50.0);
		
		System.out.println("********************************************");
		System.out.println("Listado de apartamentos");
		gestor.mostrarApartamentos();
		
		//control de errores
		//clave duplicada
		gestor.añadirApartamento(1,'A',6,1500.0);
		//clave incorrecta en el piso
		gestor.añadirApartamento(10,'A',6,1500.0);
		//clave incorrecta en la letra
		gestor.añadirApartamento(1,'X',6,1500.0);
		
		System.out.println("********************************************");
		System.out.println("Listado de apartamentos con capacidad mayor 7");
		gestor.buscarApartamentosPorCapacidad(7);
		
		System.out.println("********************************************");
		System.out.println("Despues de eliminar Piso1-LetraC");
		gestor.eliminarApartamento("Piso1-LetraC");
		gestor.mostrarApartamentos();
		
		gestor.hacerReserva("Piso3-LetraC",2);
		gestor.hacerReserva("Piso3-LetraC",2);
		gestor.hacerReserva("Piso3-LetraC",2);
		
		gestor.hacerReserva("Piso1-LetraA",2);
		gestor.hacerReserva("Piso1-LetraA",2);
		
		gestor.hacerReserva("Piso2-LetraA",2);
		gestor.hacerReserva("Piso2-LetraA",2);
		gestor.hacerReserva("Piso2-LetraA",2);
		
		System.out.println("********************************************");
		System.out.println("Despues de hacer reservas");
		gestor.mostrarApartamentos();
		
		//control de errores
		//Error en el piso
		gestor.hacerReserva("Piso8-LetraA",2);
		//Error en la letra
		gestor.hacerReserva("Piso1-LetraX",2);
		//Error apartamento no encontrado
		gestor.hacerReserva("Piso2-LetraF",2);
		//Error apartamento sin capacidad
				gestor.hacerReserva("Piso1-LetraA",10);
		
		
		System.out.println("********************************************");
		System.out.println("Mostrar apartamentos de la tercera planta");
		gestor.mostrarApartamentosPorPiso(3);
	
		System.out.println("********************************************");
		System.out.println("Apartamento con mayor capacidad");
		gestor.apartamentoConMayorCapacidad();
	
	}

}
