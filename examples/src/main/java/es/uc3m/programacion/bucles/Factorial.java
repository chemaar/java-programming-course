package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para implementar la función factorial de un número introducido por el usuario.
 *
 * @author chema
 *
 */
public class Factorial {
	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		int op1;
		int fact = 1;
		op1 = mc.nextInt();
		//fact(n) = n * fact(n-1);
		if (op1 < 0){
			System.out.println("No existe el factorial de: "+op1);
		}else{
			for (int i = 1; i<=op1; i++){
				fact = fact * i; 
			}
			System.out.println("El factorial de: "+op1+" es "+fact);
		}
	
		
	}
}
