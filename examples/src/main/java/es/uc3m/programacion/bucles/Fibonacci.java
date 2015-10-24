package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para generar la secuencia de Fibonacci para un número n.
 *
 * @author chema
 *
 */
public class Fibonacci {
	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		int numbersToGenerate;
		int fn1, fn2, fcurrent, temp;
		//fibonacci(n) = 
		//				fibonacci (0) = 0
		//				fibonacci (1) = 1
		//				fibonacci (n) = fibonacci(n-1) + fibonacci (n-2)
		numbersToGenerate = mc.nextInt();
		fn2 = 0;
		fn1 = 1;
		System.out.println(fn2);
		System.out.println(fn1);
		for (int i = 2; i < numbersToGenerate; i++){
			fcurrent = fn1 + fn2;
			temp = fn1;
			fn1 = fcurrent;
			fn2 = temp;
			System.out.println(fcurrent);
		}
	}
}
