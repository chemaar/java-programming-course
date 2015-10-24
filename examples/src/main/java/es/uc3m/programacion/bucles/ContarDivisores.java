package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para calcular un número máximo de divisores de un número introducido por el usuario.
 *
 * @author chema
 *
 */
public class ContarDivisores {
	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		int MAX_TESTED = 1000000;
		int n; 
		int testDivisor;  
		int divisorCount; 
		int numberTested;  
		n = mc.nextInt(); 
		
		divisorCount = 0;
		numberTested = 0;
		for (testDivisor = 1; testDivisor <= n; testDivisor++) {
			if (n % testDivisor == 0 ){
				divisorCount++;
			}
			numberTested++;
			if (numberTested == MAX_TESTED) {				
				numberTested = 0;
			}
		}
		System.out.println("El número de divisores de " + n	+ " es " + divisorCount);

	}
}
