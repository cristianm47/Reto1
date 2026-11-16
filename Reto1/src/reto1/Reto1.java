package reto1;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int operacion, a, b;
		do {
			System.out.println("Elige la operación:");
			System.out.println("1. Sumar:");
			System.out.println("2. Restar:");
			System.out.println("3. Multiplicar:");
			System.out.println("4. Dividir:");
			System.out.println("5. Par:");
			System.out.println("6. Impar:");
			System.out.println("7. Positivo:");
			System.out.println("8. Negativo:");
			System.out.println("0. Salir:");
			System.out.println("-> ");
			operacion = Integer.parseInt(sc.nextLine());
			switch (operacion) {
				case 1:
					System.out.println("Inrtroduce un sumando: ");
					a = Integer.parseInt(sc.nextLine());
					System.out.println("Inrtroduce otro sumando: ");
					b = Integer.parseInt(sc.nextLine());
					System.out.println(a + " + " + b + " = " + Funciones2.sumar(a,b));
					break;
				case 2:
					System.out.println("Inrtroduce el minuendo: ");
					a = Integer.parseInt(sc.nextLine());
					System.out.println("Inrtroduce el sustraendo: ");
					b = Integer.parseInt(sc.nextLine());
					System.out.println(a + " - " + b + " = " + Funciones2.restar(a,b));
					break;
				case 3:
					System.out.println("Inrtroduce un factor: ");
					a = Integer.parseInt(sc.nextLine());
					System.out.println("Inrtroduce otro factor: ");
					b = Integer.parseInt(sc.nextLine());
					System.out.println(a + " * " + b + " = " + Funciones3.multiplicar(a,b));
					break;
				case 4:
					System.out.println("Inrtroduce el dividendo: ");
					a = Integer.parseInt(sc.nextLine());
					System.out.println("Inrtroduce el divisor: ");
					b = Integer.parseInt(sc.nextLine());
					System.out.println(a + " / " + b + " = " + Funciones3.dividir(a,b));
					break;
				case 5:
					System.out.println("Inrtroduce un número: ");
					a = Integer.parseInt(sc.nextLine());
					System.out.println(a + (Funciones2.esPar(a) ? " es par." : " no es par."));
					break;
				case 6:
					System.out.println("Inrtroduce un número: ");
					a = Integer.parseInt(sc.nextLine());
					System.out.println(a + (Funciones2.esimPar(a) ? " es impar." : " no es impar."));
					break;
				case 7:
					System.out.println("Inrtroduce un número: ");
					a = Integer.parseInt(sc.nextLine());
					System.out.println(a + (Funciones3.esPositivo(a) ? " es positivo." : " no es positivo."));
					break;
				case 8:
					System.out.println("Inrtroduce un número: ");
					a = Integer.parseInt(sc.nextLine());
					System.out.println(a + (Funciones3.esNegativo(a) ? " es negativo." : " no es negativo."));
					break;
				case 0:
					System.out.println("Fin del programa.");
					break;
				default:
					System.out.println("Opción incorrecta.\n");
					break;
			}
		} while (operacion != 0);
	}

}
