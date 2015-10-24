package es.uc3m.programacion.basico;

import java.util.Scanner;

public class IntercambiarVariables {

	public static void main(String []args){
		Scanner mc = new Scanner(System.in);
		int a,b;
		int temp;
		a = mc.nextInt();
		b = mc.nextInt();
		System.out.println("Los valores (antes de intercambiar) son: "+a+", "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Los valores (después de intercambiar) son: "+a+", "+b);
	}
}
