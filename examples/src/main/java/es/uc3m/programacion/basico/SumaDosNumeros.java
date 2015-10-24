package es.uc3m.programacion.basico;

import java.util.Scanner;


/**
 * Escribir un programa que sume dos números enteros y muestre el resultado por pantalla.
 * 
 * @author chema
 *
 */
public class SumaDosNumeros {

	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		int op1, op2, result;
		op1 = mc.nextInt();
		op2 = mc.nextInt();
		result = op1 + op2;
		System.out.println("El resultado es: "+result);
	}
}
