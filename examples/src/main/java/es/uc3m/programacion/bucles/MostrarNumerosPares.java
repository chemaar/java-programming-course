package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para mostrar los números pares en los primeros 20 naturales utilizando diferentes bucles.
 *
 * @author chema
 *
 */
public class MostrarNumerosPares {

	
	public static void main(String []args){
		int top = 20;
		int i = 0;
		Scanner mc = new Scanner(System.in);
		
		do{
			if (i%2 == 0){
				System.out.println(i);
			}
			i = i + 1; //i++
		}while(i<=top);		
		
		for(int j = 0; j<=top; j++){
			if (j%2 == 0){
				System.out.println(j);
			}
		}
		
		int k = 0;
		while (k<=top){
			if (k%2 == 0){
				System.out.println(k);
			}
			k = k+1; //k++
			
		}
		
		while (k++<=top){
			if (k%2 == 0){
				System.out.println(k);
			}
		}

	}
	
	
	
	}
