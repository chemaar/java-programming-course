package es.uc3m.programacion.juegos.sudoku;
import java.util.Scanner;


/**
 * Esta clase implementa la interacci�n del juego del Sudoku mediante funciones.
 * @author chema
 *
 */
public class SudokuFunciones {

	private static final int MAX_VALOR_EN_SUDOKU = 9;
	private static final int MIN_VALOR_IN_SUDOKU = 0;
	private static final int TAMANYO = 3;
	private static final int CELDA_VACIA = -1;

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int[][] panel = crearPanelVacio(TAMANYO,CELDA_VACIA);
		int nFilas = panel.length;
		int nCols = panel[0].length;
		int posicionesLibres = nFilas*nCols;
		int fila = 0;
		int col = 0;
		int valor = CELDA_VACIA;


		do{
			if(posicionesLibres>0){
				//1-Mostramos el panel actual
				mostrarPanelSudoku(panel);
				//2-Solicitamos el n� de fila y columna
				do{	
					System.out.println("Introduza una posici�n (fila, columna) entre (0,3):");
					fila = sc.nextInt();
					col = sc.nextInt();
					if(!esRangoValidoFilaColumna(fila,col,nFilas,nCols)){
						System.out.println("La posici�n introducida no es v�lida.");
					}
				}while(!esRangoValidoFilaColumna(fila,col,nFilas,nCols));

				if(panel[fila][col] != CELDA_VACIA){
					System.out.println("Se va a sobreescribir un valor...");
				}

				//3-Pedir y validar un valor
				valor = CELDA_VACIA;
				do{
					System.out.println("Introduza un valor para la fila y columna ("+fila+","+col+")"+":");
					valor = pedirValorFilaColumna(sc, MIN_VALOR_IN_SUDOKU, MAX_VALOR_EN_SUDOKU);
					if(valor<MIN_VALOR_IN_SUDOKU || valor>MAX_VALOR_EN_SUDOKU){
						valor = CELDA_VACIA;
					}else{
						//4-Chequear si es posible poner ese valor en la fila y columna.
						//Tanto en filas como en columnas no puede haber valores repetidos.
						boolean valorCorrecto = Boolean.FALSE;
						valorCorrecto = esValidoEnFila(panel, fila,	valor) && 
								esValidoEnColumna(panel, col,	valor);
						if(valorCorrecto){
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
		System.out.println("�Enhorabuna! �Has finalizado el juego del Sudoku!");
		mostrarPanelSudoku(panel);
	}
	
	private static boolean esValidoEnColumna(int[][] panel, int col, int valor) {
		int nFilas = panel.length;
		boolean encontrado = Boolean.FALSE;
		//Chequear que el valor no existe en esa columna.
		for(int i=0;i<nFilas && !encontrado;i++){
			encontrado = panel[i][col] == valor;
		}
		return !encontrado;
	}

	private static boolean esValidoEnFila(int[][] panel, int fila, int valor) {
		int nCols = panel[0].length;
		boolean encontrado = Boolean.FALSE;
		//Chequear que el valor no existe en esa fila.
		for(int j=0;j<nCols && !encontrado;j++){
			encontrado = panel[fila][j] == valor;
		}
		return !encontrado;
	}

	public static boolean esRangoValidoFilaColumna(int fila, int col, int nFilas, int nCols){
		return (fila>=0 && fila<nFilas && col>=0 && col<nCols);
	}
	
	public static int pedirValorFilaColumna(Scanner sc, int min, int max){
		int valor = sc.nextInt();
		if(valor<min || valor>max){
			valor = CELDA_VACIA;
		}
		return valor;
	}
	
	private static void mostrarPanelSudoku(int[][] panel) {
		int nFilas = panel.length;
		int nCols = panel[0].length;
		System.out.println("Sudoku");
		System.out.println("-----------------");
		for(int i=0;i<nFilas;i++){
			for(int j=0;j<nCols;j++){
				System.out.print("\t"+(panel[i][j]==CELDA_VACIA?"_":panel[i][j]));
			}
			System.out.println();
		}
	}

	public static int[][] crearPanelVacio(int size, int emptyCell) {
		int [][] panel = new int[size][size];
		int nFilas = panel.length;
		int nCols = panel[0].length;
		for(int i=0;i<nFilas;i++){
			for(int j=0;j<nCols;j++){
				panel[i][j]=CELDA_VACIA;
			}
		}
		return panel;
	}
}
