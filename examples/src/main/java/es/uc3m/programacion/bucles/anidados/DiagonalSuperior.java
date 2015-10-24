package es.uc3m.programacion.bucles.anidados;

/**
 * Diseñar y codificar un programa Java que muestra por pantalla el siguiente patrón de un 
 * triángulo en una tabla implícita NxN. Por ejemplo para N=3 la salida sería.
 * 
 *  * . . 
 *  * * . 
 *  * * * 
 *
 * @author chema
 *
 */
public class DiagonalSuperior {
	public static void main(String []args){
		int N = 3;
		for(int i =1; i<=N; i++){
			for(int j =1; j<=N; j++){
				if(i<=j){
					System.out.print("*");
				}else{
					System.out.print(".");
				}
			}
			System.out.println("");
		}
	}
	
	
}
