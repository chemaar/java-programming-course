package es.uc3m.programacion.bucles.anidados;

/**
 * Diseñar y codificar un programa en Java que muestre por pantalla una diamante de radio N.
 * @author chema
 *
 */
public class Diamante {
	public static void main(String []args){
		int n = 7;
		int mid = n/2;
		int lmin=0;
		int rmax=0;
		if(n%2!=0){
			for(int i = 0; i<n;i++){
				if(i<=mid){
					lmin=mid-i;
					rmax=mid+i;
				}else{
					lmin=mid-(n-i)+1;
					rmax=mid+(n-i)-1;
				}
				for(int j=0;j<n;j++){
					if(j>=lmin && j<=rmax){
						System.out.print(" *");
					}else{
						System.out.print(" .");
					}
				}
				System.out.println();
			}
		}else{
			System.err.println("Introduzca un número impar.");
		}

	}
}
