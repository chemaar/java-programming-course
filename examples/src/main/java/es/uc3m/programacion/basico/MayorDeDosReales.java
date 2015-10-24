package es.uc3m.programacion.basico;

import java.util.Scanner;

/**
 * Escribir un programa para mostrar por pantalla para mostrar el mayor valor de 2 números reales.
 *
 * @author chema
 *
 */
public class MayorDeDosReales {

	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		float op1, op2;
		op1 = mc.nextFloat();
		op2 = mc.nextFloat();
//		Returns:
//			the value 0 if f1 is numerically equal to f2; a value less than 0 if f1 is numerically less than f2;
//		     and a value greater than 0 if f1 is numerically greater than f2.
		int compare = Float.compare(op1, op2); 
		if (compare == 0){
			System.out.println("Los valores son iguales.");	
		}else if(compare < 0){
			System.out.println("El valor mayor es: "+op2);
		}else {
			System.out.println("El valor mayor es: "+op1);
		}
	}
}
