package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para detectar si un número entero es primo.
 *
 * @author chema
 *
 */
public class PrimeNumber {

	public static void main (String []args){
		Scanner mc = new Scanner(System.in);
		int number = 0;
		boolean isPrime = true;
		number = mc.nextInt();
		//FIXME: Chequear > 0
		int i = 2;
		while(isPrime && i!=number){
			if(number%i ==  0){
				isPrime = false;
			}
			i++;
		}
		System.out.println("El número "+number+"es primo: "+isPrime);
	}
	
}
