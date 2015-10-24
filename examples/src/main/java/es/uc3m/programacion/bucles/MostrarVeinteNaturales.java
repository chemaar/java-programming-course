package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para mostrar los primeros 20 números naturales con distintos bucles.
 *
 * @author chema
 *
 */
public class MostrarVeinteNaturales {
	public static void main(String []args){
		int top = 20;
		int i = 0;
		Scanner mc = new Scanner(System.in);
		do{
			System.out.println(i);
			i = i + 1; //i++
		}while(i<=top);
		
		for(int j = 0; j<=top; j++){
			System.out.println(j);
		}
		
		int k = 0;
		while (k<=top){
			System.out.println(k);
			k = k+1; //k++
		}
	}
}
