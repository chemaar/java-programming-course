package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para mostrar los primeros 20 números naturales con distintos bucles en forma descendente.
 *
 * @author chema
 *
 */
public class MostrarVeinteNaturalesDescendente {

	public static void main(String []args){		
		Scanner mc = new Scanner(System.in);
		int i = 20;
		do{
			System.out.println(i);
			i = i-1 ; //i--
		}while(i>=0);
		
		for(int j = 20; j>=0; j--){
			System.out.println(j);
		}
		
		int k = 20;
		while (k>=0){
			System.out.println(k);
			k = k-1; //k--
		}
	}
	
	
	
}
