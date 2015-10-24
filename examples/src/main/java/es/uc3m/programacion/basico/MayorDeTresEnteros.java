package es.uc3m.programacion.basico;

import java.util.Scanner;

/**
 * Escribir un programa para mostrar por pantalla para mostrar el mayor valor de 3 números enteros.
 *
 * @author chema
 *
 */
public class MayorDeTresEnteros {

	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		int op1, op2, op3;
		op1 = mc.nextInt();
		op2 = mc.nextInt();
		op3 = mc.nextInt();
		if (op1 > op2 && op1 > op3){
			 System.out.println("El valor mayor es: "+op1);
		 }else if (op2 > op1 && op2 > op3){
			 System.out.println("El valor mayor es: "+op2);
		 }else{
			 System.out.println("El valor mayor es: "+op3);
		 }
		
		
	}
}
