package es.uc3m.programacion.juegos.sudoku;
import java.util.Scanner;

/**
 * Esta clase implementa la interacci�n del juego del Sudoku mediante funciones.
 * @author chema
 *
 */
public class SudokuMain {

	private static final int MAX_VALOR_EN_SUDOKU = 9;
	private static final int MIN_VALOR_EN_SUDOKU = 0;
	private static final int TAMANYO = 3;
	private static final int CELDA_VACIA = -1;

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int [][] panel = new int[TAMANYO][TAMANYO];
		int nFilas = panel.length;
		int nCols = panel[0].length;
		int posicionesLibres = nFilas*nCols;
		int fila = 0;
		int col = 0;
		int valor = CELDA_VACIA;

		//Creamos un nuevo panel con las celdas vac�as.
		for(int i=0;i<nFilas;i++){
			for(int j=0;j<nCols;j++){
				panel[i][j]=CELDA_VACIA;
			}
		}


		
		do{
			if(posicionesLibres>0){
				//1-Mostramos el panel actual
				System.out.println("Sudoku");
				System.out.println("-----------------");
				for(int i=0;i<nFilas;i++){
					for(int j=0;j<nCols;j++){
						System.out.print("\t"+(panel[i][j]==CELDA_VACIA?"_":panel[i][j]));
					}
					System.out.println();
				}
				//2-Solicitamos la fila y columna a rellenar.
				do{	
					System.out.println("Introduza una posici�n (fila, columna) entre (0,3):");
					fila = sc.nextInt();
					col = sc.nextInt();
					if(fila<0 || fila>nFilas-1 || col<0 || col>nCols-1){
						System.out.println("La posici�n introducida no es v�lida.");
					}
				}while(fila<0 || fila>nFilas-1 || col<0 || col>nCols-1);

				if(panel[fila][col] != CELDA_VACIA){
					System.out.println("Se va a sobreescribir un valor...");
				}

				//3-Request a value
				valor = CELDA_VACIA;
				do{
					System.out.println("Introduza un valor para la fila y columna ("+fila+","+col+")"+":");
					valor = sc.nextInt();
					if(valor<MIN_VALOR_EN_SUDOKU || valor>MAX_VALOR_EN_SUDOKU){
						valor = CELDA_VACIA;
					}else{
						//4-Chequear si es posible poner ese valor en la fila y columna.
						//Tanto en filas como en columnas no puede haber valores repetidos.
						boolean encontrado = Boolean.FALSE;
						for(int j=0;j<nCols && !encontrado;j++){
							encontrado = (panel[fila][j] == valor);
						}
						//Chequear el valor en la columna seleccionada
						for(int i=0;i<nFilas && !encontrado;i++){
							encontrado = (panel[i][col] == valor);
						}
						if(!encontrado){
							//Ponemos el valor
							panel[fila][col] = valor;
							posicionesLibres--;
						}else{
							System.out.println("No es posible poner el valor: "+valor+" en la fila: "+fila+" columna: "+col);
							valor=CELDA_VACIA;
						}
					}
				}while(valor==CELDA_VACIA);
			}
		}while(posicionesLibres>0);
		
		System.out.println("Sudoku Final");
		System.out.println("-----------------");
		for(int i=0;i<nFilas;i++){
			for(int j=0;j<nCols;j++){
				System.out.print("\t"+panel[i][j]);
			}
			System.out.println();
		}
	}
}
