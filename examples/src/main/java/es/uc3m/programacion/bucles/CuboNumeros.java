package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa calcular el cubo de los primeros 20 números naturales utilizando diferentes bucles.
 *
 * @author chema
 *
 */
public class CuboNumeros {
	public static void main(String []args){
		int top = 20;
		int i = 0;
		Scanner mc = new Scanner(System.in);
		do{
			System.out.println(i*i*i);
			i = i + 1; //i++
		}while(i<=top);
		
		for(int j = 0; j<=top; j++){
			System.out.println(j*j*j);
		}
		
		int k = 0;
		while (k<=top){
			System.out.println(k*k*k);
			k = k+1; //k++
		}
	}
}
