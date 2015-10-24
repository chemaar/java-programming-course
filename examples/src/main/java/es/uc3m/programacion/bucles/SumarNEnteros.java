package es.uc3m.programacion.bucles;

import java.util.Scanner;


/**
 * Escribir un programa que sume hasta n números enteros solicitados al usuario.
 * 
 * @author chema
 *
 */
public class SumarNEnteros {

	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		int numberToRead = 0;
		numberToRead = mc.nextInt();
		if(numberToRead>0){
			int value = 0;
			int sum = 0;
			for(int i = 0; i<numberToRead;i++){
				System.out.println("Introduza un número...");
				value = mc.nextInt();
				sum = sum + value;
			}
			System.out.println("La suma es: "+sum);
		}
	}
}
