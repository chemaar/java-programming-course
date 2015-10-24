package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para sumar los primeros 20 números naturales
 *
 * @author chema
 *
 */
public class SumarVeinteNaturales {


	public static void main(String []args){
		int top = 20;
		int i = 0;
		int sum = 0;
		Scanner mc = new Scanner(System.in);
		
		sum = 0;
		do{
			sum = sum + i;
			i = i + 1; //i++
		}while(i<=top);		
		System.out.println("Suma: "+sum);
		
		sum=0;
		for(int j = 0; j<=top; j++){
			sum = sum + j;
		}
		System.out.println("Suma: "+sum);
		
		int k = 0;
		sum = 0;
		while (k<=top){
			sum = sum + k;
			k = k+1; //k++
			
		}
		System.out.println("Suma: "+sum);
	}

	

	


}
