package es.uc3m.programacion.bucles;

import java.util.Scanner;



/**
 * 
 * Escribir un programa que detecte si un número entero es un número de Armstrong.
 * 
 * "An Armstrong number of three digit is a number whose sum of cubes of its digit is equal 
 * to its number."
 *  
 * 153 = 1^3+5^3+3^3 o 1+125+27=153
 * 
 * http://en.wikipedia.org/wiki/Narcissistic_number
 * 
 * @author Chema
 * 
 *
 */
public class NumeroArmstrong {

	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		int numero = 0;
		int resultado, numero_inicial, resto;
		numero = mc.nextInt();
		numero_inicial = numero;
		//FIXME: Chequear que el número este entre [100-999]
		resultado = 0;
		while(numero != 0){
            resto = numero%10;
            resultado = resultado + resto*resto*resto;
            numero = numero/10;
        }
		System.out.println("El número "+numero+" es un número de Armstrong: "+(numero_inicial==resultado));        
	}
}
