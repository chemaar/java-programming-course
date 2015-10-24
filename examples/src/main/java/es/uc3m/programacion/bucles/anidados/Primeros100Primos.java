package es.uc3m.programacion.bucles.anidados;

import java.util.Scanner;

/**
 * Escribir un programa para mostrar por pantalla los 100 primeros números primos.
 *
 * @author chema
 *
 */
public class Primeros100Primos {

	public static void main (String []args){
		Scanner mc = new Scanner(System.in);
		int nprimes = 100;
		int matches = 1; //1 es primo
		int number = 2; //...empezamos en 2...
		boolean isPrime = true;			
		int i = 2;
		while (matches<nprimes){
			isPrime = true;
			i = 2;
			while(isPrime && i!=number){
				if(number%i ==  0){
					isPrime = false;
				}
				i++;
			}
			if (isPrime){
				System.out.println(number);
				matches++;
			}
			number++;
		}
		
	}
	
}
