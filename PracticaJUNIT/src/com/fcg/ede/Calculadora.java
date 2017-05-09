package com.fcg.ede;

public class Calculadora {
	public static void main(String[] args) {
		int opcion = 0;
		double a = 0;
		double b = 0;

		System.out.println(
				"Introduzca el número de la operación a realizar: 1.-SUMA. 2.-RESTA 3.-MULTIPLICACION 4.-DIVISION");
		opcion = Entrada.entero();

		switch (opcion) {

		case 1:
			System.out.println("Introduzca el numero 1");
			a = Entrada.real();
			System.out.println("Introduzca el numero 2");
			b = Entrada.real();
			System.out.println(Operacion.suma(a, b));
			break;
		case 2:
			System.out.println("Introduzca el numero 1");
			a = Entrada.real();
			System.out.println("Introduzca el numero 2");
			b = Entrada.real();
			Operacion.resta(a, b);
			break;
		case 3:
			System.out.println("Introduzca el numero 1");
			a = Entrada.real();
			System.out.println("Introduzca el numero 2");
			b = Entrada.real();
			Operacion.multiplicacion(a, b);
			break;
		case 4:
			System.out.println("Introduzca el numero 1");
			a = Entrada.real();
			System.out.println("Introduzca el numero 2");
			b = Entrada.real();
			Operacion.division(a, b);
			break;
		}
	}
}
