package es.uc3m.programacion.enclase;

public class Vector2dTest {

	public static int N = 5;
	public static void main(String[] args) {
		int m[][] = new int[N][N];
		int i=0;
		int j = 0;
		//1-Inicializar matriz
		for(i=0;i<m.length;i++){//Iterar por filas
			for(j=0;j<m[i].length;j++){
				m[i][j] = j+i*2;
			}
		}
		//2-Mostrar matriz
		for(i=0;i<m.length;i++){//Iterar por filas
			System.out.print("[");
			for(j=0;j<m[i].length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println("]");
		}
		//3-Mostrar los elementos de la diagonal principal
		for(i=0;i<m.length;i++){//Iterar por filas
			for(j=0;j<m[i].length;j++){
				//Chequear si el elemento est� en la diagonal principal
				if(i==j){
					System.out.println(m[i][j]);
				}
			}
		}
		//4-Mostrar la transpuesta (si es cuadrada)
		for(i=0;i<m.length;i++){//Iterar por filas
			System.out.print("[");
			for(j=0;j<m[i].length;j++){
				//Chequear si el elemento est� en la diagonal principal
				System.out.print(m[j][i]+" ");
			}
			System.out.println("]");
		}
	}

}
