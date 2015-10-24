package es.uc3m.programacion.bucles;

import java.util.Scanner;

/**
 * Escribir un programa para implementar la función potencia.
 *
 * @author chema
 *
 */
public class MiPotencia {

	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		double base = 0;
		int exponent = 0;
		double value = 1;
		base = mc.nextDouble();
		exponent = mc.nextInt();
		for (int i = 0; i<exponent;i++){
			value = value  * base; 
		}
		System.out.println("La potencia de "+base+" elevado a "+exponent+" es: "+value);
		System.out.println("Using the Java API: "+Math.pow(base, exponent));
	}
}
