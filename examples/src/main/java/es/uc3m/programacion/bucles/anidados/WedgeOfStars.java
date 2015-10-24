package es.uc3m.programacion.bucles.anidados;

import java.util.Scanner;

/**
 * 
 * Escribir un programa que muestre por pantalla la siguiente figura:
 * 
 * 	*******
 	******
 	*****
 	****
 	***
 	**
 	*
 * 
 *
 */
public class WedgeOfStars {

	public static void main(String args[]){
		Scanner mc = new Scanner(System.in);
		int numberOfStars = 0;
		numberOfStars = mc.nextInt();
		for (int i = numberOfStars; i>0; i--){
			for(int j = 0; j<i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
