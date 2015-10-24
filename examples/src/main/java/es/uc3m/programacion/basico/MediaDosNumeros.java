package es.uc3m.programacion.basico;

import java.util.Scanner;


/**
 * Escribir un programa que realice la media de dos números reales solicitados al usuario.
 * 
 * @author chema
 *
 */
public class MediaDosNumeros {

	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		float op1, op2;
		float average;
		op1 = mc.nextFloat();
		op2 = mc.nextFloat();
		average = (op1 + op2) / 2;
		System.out.println("La media es: "+average);
	}
}
