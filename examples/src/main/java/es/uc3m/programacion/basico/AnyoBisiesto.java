package es.uc3m.programacion.basico;

import java.util.Scanner;

/**
 * Escribir un programa para detectar si un año es bisiesto.
 * 
 * @author chema
 *
 */
public class AnyoBisiesto {

	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		int year = 0;
		year = mc.nextInt();
		// divisible by 4
        boolean isLeapYear = (year % 4 == 0);
        // divisible by 4 and not 100
        isLeapYear = isLeapYear && (year % 100 != 0);
        // divisible by 4 and not 100 unless divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0);
        System.out.println(isLeapYear);	
        
        }
}
