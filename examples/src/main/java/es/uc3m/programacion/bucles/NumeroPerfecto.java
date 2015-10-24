package es.uc3m.programacion.bucles;

/**
 * Escribir un programa que dado un número entero detecte si es un número perfecto. 
 * 
 * Un número perfecto es aquel que es igual a la suma de todos sus divisores propios positivos.
 * 
 * 6 es un número perfecto: 6=3+2+1
 * 
 * @author chema
 *
 */
public class NumeroPerfecto {

	public static void main(String []args){
		int N = 6;
		int i = 1;
		int divisor;
		int calculado = 0;
		while(i<N){
			if(N%i == 0){
				calculado = calculado + i;
			}
			i++;		
		}
		System.out.println("El número "+N+" es perfecto: "+(calculado==N));
	}
}
