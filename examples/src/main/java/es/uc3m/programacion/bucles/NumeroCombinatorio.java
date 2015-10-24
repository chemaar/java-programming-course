package es.uc3m.programacion.bucles;

import java.util.Scanner;

import java.util.Scanner;

/**
 * Escribir un programa calcule un número combinatorio.
 *
 * Ver definición: http://en.wikipedia.org/wiki/Combinatorial_number_system
 * @author chema
 *
 */
public class NumeroCombinatorio {

	//
	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		int m = mc.nextInt();
		int n = mc.nextInt(); 
		int factorialmn = 1, factorialn = 1, factorialm = 1;
		if (m < n) {
			System.out.println("M must be >= n");
			System.exit(0);
		}
		//Fact(m)
		for (int i = m; i > 0; i--) {
			if (m == 0 || m == 1) {
				factorialm = 1;
				break;
			}
			factorialm = i * factorialm;
		}

		//Fact(n)
		for (int i = n; i > 0; i--) {
			if (n == 0 || n == 1) {
				factorialn = 1;
				break;
			}
			factorialn = i * factorialn;
		}

		//Fact(m-n)
		for (int i = m - n; i > 0; i--) {
			if (m - n == 0 || m - n == 1) {
				factorialmn = 1;
				break;
			}
			factorialmn = i * factorialmn;
		}

		System.out.println("El resultado es: "+ (factorialm / (factorialn * factorialmn)));

	}

}
