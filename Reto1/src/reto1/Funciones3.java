package reto1;

public class Funciones3 {
	public static int multiplicar(int a, int b) {
		return a * b;
	}
	public static int dividir(int a, int b) {
		return b == 0 ? null : (a/b);
	}
	public static boolean esPositivo(int n) {
		return n >= 0;
	}
	public static boolean esNegativo(int n) {
		return n < 0; 
	}
}
