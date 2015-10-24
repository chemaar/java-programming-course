package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa calcular el cubo de los primeros 20 números naturales utilizando diferentes bucles
 *  y el API de Java Math.
 *
 * @author chema
 *
 */
public class CubNumerosMathAPI {
	public static void main(String []args){
		int top = 20;
		int i = 0;
		Scanner mc = new Scanner(System.in);
		do{
			System.out.println(Math.pow(i, 3));
			i = i + 1; //i++
		}while(i<=top);
		
		for(int j = 0; j<=top; j++){
			System.out.println(Math.pow(j, 3));
		}
		
		int k = 0;
		while (k<=top){
			System.out.println(Math.pow(k, 3));
			k = k+1; //k++
		}
	}
}
