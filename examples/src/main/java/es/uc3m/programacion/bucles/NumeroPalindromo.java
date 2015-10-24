package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para detectar si un número entero es un palíndromo (capícua).
 *
 * @author chema
 *
 */
public class NumeroPalindromo {

	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		int number;
		int palindrome, reverse;
		number = mc.nextInt();
		palindrome = number;
		reverse = 0;
		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		System.out.println("El número "+number+" es palíndromo: "+(number==reverse));
		}
}
