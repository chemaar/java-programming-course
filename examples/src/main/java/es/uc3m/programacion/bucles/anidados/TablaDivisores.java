package es.uc3m.programacion.bucles.anidados;

/**
 * 1-Diseñar y codificar un programa en Java que muestre por pantalla una tabla de 
 * dimensión (1..N) en la cual la celda (i, j) contendrá '* ' si i es divisor j o j es divisor 
 * de i, de otra forma mostrará '. ' . Por ejemplo para N=10 la salida sería:
 * 
 * 
 * 
 
 * * * * * * * * * * 1
* *   *   *   *   * 2
*   *     *     *   3
* *   *       *     4
*       *         * 5
* * *     *         6
*           *       7
* *   *       *     8
*   *           *   9
* *     *         * 10


 * @author chema
 *
 */
public class TablaDivisores {
	
	public static void main(String []args){
		int N = 10;
		for(int i =1; i<=N; i++){
			for(int j =1; j<=N; j++){
				if(i%j == 0 || j%i == 0){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print(" "+i);
			System.out.println("");
		}
	}

}
