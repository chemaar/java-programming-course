package es.uc3m.programacion.basico;

import java.util.Scanner;

/**
 * Escribir un programa para mostrar por pantalla para mostrar el mayor valor de 3 números reales.
 *
 * @author chema
 *
 */
public class MayorDeTresReales {

	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		float op1, op2, op3;
		op1 = mc.nextFloat();
		op2 = mc.nextFloat();
		op3 = mc.nextFloat();
		if (Float.compare(op1, op2)>0 && Float.compare(op1, op3)>0){
			 System.out.println("El valor mayor es: "+op1);
		 }else if (Float.compare(op2, op3)>0 && Float.compare(op2, op3)>0){
			 System.out.println("El valor mayor es: "+op2);
		 }else{
			 System.out.println("El valor mayor es: "+op3);
		 }
		
		
	}
}
