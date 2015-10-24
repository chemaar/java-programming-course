package es.uc3m.programacion.bucles.anidados;

import java.io.IOException;

import java.util.Scanner;

/**
 * Escribir un programa para mostrar por pantalla la siguiente figura.
 * 
 *
 *     *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
      ***
      ***
      ***
 */
public class ArbolNavidad {
	public static void main(String []args) throws IOException{
		Scanner mc = new Scanner(System.in);
		int baseStars = 15;
		int halfBlankSpaces = 0;
		for (int i = 1; i<baseStars; i=i+2){
			halfBlankSpaces = (baseStars-i)/2;
			for(int j=0; j<halfBlankSpaces;j++){
				System.out.print(" ");
			}
			for(int k = 0; k<i;k++){
				System.out.print("*");	
			}
			for(int j=0; j<halfBlankSpaces;j++){
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		halfBlankSpaces = (baseStars/2)-1;
		for(int i = 0; i<3;i++){
			for(int j=0; j<halfBlankSpaces;j++){
				System.out.print(" ");
			}
			for(int k=0; k<3;k++){
				System.out.print("*");
			}
			for(int j=0; j<halfBlankSpaces;j++){
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
