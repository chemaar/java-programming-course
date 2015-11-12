package es.uc3m.programacion.matrix;


/**
 * Esta clase presenta algunas funciones para trabajar con matrices.
 * @author chema
 *
 */
public class MatricesFunciones {

	/**
	 * Dada una matriz no nula de n�meros reales, esta funci�n devuelve el n�mero de filas.
	 * @param matrix La matriz a utilizar.
	 * @return El n�mero de filas o 0 si es null.
	 */
	public static int nFilas(double [][] matrix){
		if(matrix!=null){
			return matrix.length;

		}
		return 0;
	}
	/**
	 * Dada una matriz no nula de n�meros reales, esta funci�n devuelve el n�mero de columnas.
	 * @param matrix La matriz a utilizar.
	 * @return El n�mero de columnas o 0 si es null.
	 */
	public static int nCols(double [][] matrix){
		if(matrix!=null){
			return matrix[0].length;
		}
		return 0;
	}

	/**
	 * Dada una matriz no nula de n�meros reales, esta funci�n devuelve true si la matriz es cuadrada y false en otro caso.
	 * @param matrix La matriz a utilizar..
	 * @return True si la matriz es cuadrada, false en otro caso.
	 */
	public static boolean esCuadarada(double [][] matrix){
		if(matrix!=null){
			return nFilas(matrix)==nCols(matrix);	
		}
		return Boolean.FALSE;
	}

	/**
	 * Dados dos matrices de n�meros reales no nulas, realiza la suma de los elementos.
	 * @param A
	 * @param B
	 * @return Una nueva matriz conteniendo para cada posici�n c(i,j)=a(i,j)+b(i,j).
	 */
	public static double[][] suma(double[][] A, double[][] B) {
		if(A!=null && B!=null){
			int aFilas = A.length;
			int aCols = A[0].length;
			int bFilas = B.length;
			int bCols = B[0].length;

			if (aCols != bCols || aFilas!=bFilas) {
				throw new IllegalArgumentException("Filas y columnas no encajan.");
			}

			double[][] C = new double[aFilas][bCols];
			for (int i = 0; i < aFilas; i++) 
				for (int j = 0; j < bCols; j++) 
					C[i][j] = A[i][j] + B[i][j];
			return C;	
		}
		return new double[0][0];
		
	}
	
	/**
	 * Dados dos matrices de n�meros reales no nulas, realiza la multiplicaci�n de matrices.
	 * @param A
	 * @param B
	 * @return Una nueva matriz conteniendo para cada posici�n c(i,j) la multiplicaci�n de las matrices (fila, columna).
	 */
	public static double[][] multiplicar(double[][] A, double[][] B) {
		if(A!=null && B!=null){
			int aFilas = A.length;
			int aCols = A[0].length;
			int bFilas = B.length;
			int bCols = B[0].length;
			//n,m x m,k

			if (aCols != bFilas) {
				throw new IllegalArgumentException("A:cols: " + aCols + "no encaja con B:filas " + bFilas + ".");
			}

			double[][] C = new double[aFilas][bCols];

			for (int i = 0; i < aFilas; i++) { // aRow
				for (int j = 0; j < bCols; j++) { // bColumn
					C[i][j] = 0.00000;
					for (int k = 0; k < aCols; k++) { // aColumn
						C[i][j] += A[i][k] * B[k][j];
					}
				}
			}

			return C;
		}
		return new double[0][0];
	}

	
	/**
	 * Dada una matriz de n�meros reales, esta funci�n devuelve su transpuesta.
	 * @param m
	 * @return La matriz transpuesta o una matriz vac�a si el par�metro es null.
	 */
	public static double[][] transpuesta(double [][] m){
		if(m!=null){
			Integer.valueOf("2");
			double[][] temp = new double[m[0].length][m.length];
			for (int i = 0; i < m.length; i++)
				for (int j = 0; j < m[0].length; j++)
					temp[j][i] = m[i][j];
			return temp;	
		}
		return new double[0][0];
	}

	/**
	 * Dado un tama�o, esta funci�n devuelve la matriz identidad.
	 * @param tama�o de A > 0.
	 * @return La matriz identidad del tama�o requerido o una matriz vac�a si el tama�o es menor de 0.
	 */
	public static double[][] crearMatrizIdentidad(int tamanyo) {
		if(tamanyo>0){
			double[][] matrix = new double[tamanyo][tamanyo];
			for(int i = 0; i < tamanyo; i++)
				for(int j = 0; j < tamanyo; j++)
					matrix[i][j] = (i == j) ? 1 : 0;
			return matrix;
		}
		return new double[0][0];
	}


	/**
	 * Dada una matriz, esta funci�n muestra sus contenidos.
	 * @param a A no nula.
	 */
	public static void show(double [][]a){
		if(a!=null){
			for (int i = 0; i<a.length; i++){
				for (int j= 0; j<a[0].length;j++){
					System.out.print(" "+a[i][j]);
				}
				System.out.println("");
			}
		}
	
	}

	/**
	 * Esta funci�n calcula el determinante de una matriz aplicando la t�cnica de Sarrus.
	 * @param a
	 * @return El determinante de la matriz o Double.MIN_VALUE si no se puede calcular por Sarrus.
	 */
	public static double determinant(double [][]a) {
		//Sarrus
		if(a!=null && a.length==3 && a[0].length==3){
			return a[0][0]*a[1][1]*a[2][2]+
					a[0][1]*a[1][2]*a[2][0]+
					a[0][2]*a[1][0]*a[2][1]-
					a[0][2]*a[1][1]*a[2][0]-
					a[0][1]*a[1][0]*a[2][2]-
					a[0][0]*a[1][2]*a[2][1]; 
		}
		return Double.MIN_VALUE;

	}


	public static void main(String []args){
		double[][] A = { { 4.00, 3.00 }, { 2.00, 1.00 } };
		double[][] B = { { -0.500, 1.500 }, { 1.000, -2.0000 } };
		double[][] C = { { 3,2,1}, {0,2,-5} , {-2,1,4} };

		System.out.println("Filas: "+nFilas(A));
		System.out.println("Columnas: "+nCols(A));
		System.out.println("Determinante: "+determinant(C));

		show(A);
		show(B);
	}
}
