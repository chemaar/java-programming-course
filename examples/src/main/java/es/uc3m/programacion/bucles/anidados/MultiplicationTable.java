package es.uc3m.programacion.bucles.anidados;

/**
 * Escribir un programa para mostrar la tabla de multiplicar del 1 al 10.
 *
 * @author chema
 *
 */
public class MultiplicationTable {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print( i * j );
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
