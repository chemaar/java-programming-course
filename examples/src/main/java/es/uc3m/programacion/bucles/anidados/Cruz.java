package es.uc3m.programacion.bucles.anidados;

/**
 * Diseñar y codificar un programa en Java que muestre por pantalla una X de radio N.
 * @author chema
 *
 */
public class Cruz {
	public static void main(String []args){
		int N = 9;
		for(int i = 0;i<N;i++){
			for(int j=0;j<N;j++){
				if(i==j || (N-i-1==j)){
					System.out.print(" *");
				}else{
					System.out.print(" .");
				}
			}
			System.out.println();
		}
	}
}
