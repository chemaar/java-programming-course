package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para mostrar el cuadrado de los primeros 20 números naturales con distintos bucles en forma descendente.
 *
 * @author chema
 *
 */
public class CuadradoVeinteNaturales {
	public static void main(String []args){
		int top = 20;
		int i = 0;
		Scanner mc = new Scanner(System.in);
		do{
			System.out.println(i*i);
			i = i + 1; //i++
		}while(i<=top);
		
		for(int j = 0; j<=top; j++){
			System.out.println(j*j);
		}
		
		int k = 0;
		while (k<=top){
			System.out.println(k*k);
			k = k+1; //k++
		}
	}
}
