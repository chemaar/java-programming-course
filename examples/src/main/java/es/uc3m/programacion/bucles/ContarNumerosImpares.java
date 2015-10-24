package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para contar los números impares en los primeros 20 naturales utilizando diferentes bucles.
 *
 * @author chema
 *
 */
public class ContarNumerosImpares {


	public static void main(String []args){
		int top = 20;
		int i = 0;
		int counter = 0;
		Scanner mc = new Scanner(System.in);
		
		do{
			if (i%2 != 0){
				counter++;
			}
			i = i + 1; //i++
		}while(i<=top);				
		System.out.println("Encontrados "+counter+" números impares.");
		
		counter = 0;
		for(int j = 0; j<=top; j++){
			if (j%2 != 0){
				counter++;
			}
		}
		System.out.println("Encontrados "+counter+" números impares.");
		
		
		int k = 0;
		counter = 0;
		while (k<=top){
			if (k%2 == 0){
				counter++;
			}
			k = k+1; //k++
			
		}
		System.out.println("Encontrados "+counter+" números impares.");
		
		k = 0;
		counter = 0;
		while (k++<=top){
			if (k%2 != 0){
				counter++;
			}
		}
		System.out.println("Encontrados "+counter+" números impares.");

	}
	
	



	


}
