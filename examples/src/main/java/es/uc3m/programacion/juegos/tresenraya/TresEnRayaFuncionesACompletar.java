package es.uc3m.programacion.juegos.tresenraya;
import java.util.Scanner;


/**
 * 
 * Esta clase implementa en una serie de funciones para el juego del Tres en raya. Algunas de las funcionalidades
 * est�n sin completar y se deber�n implementar para poder jugar. 
 * 
 * Para ello, se deben realizar cambios en los lugares se�alados con FIXME
 * 
 * @author chema
 *
 */
public class TresEnRayaFuncionesACompletar {
	private static final int TAMANYO = 3;
	private static final char CELDA_VACIA = '_';

	public static char [][] crearPanelVacio(int tamanyo){
		char [][] panel = new char[tamanyo][tamanyo];
		for(int i=0;i<tamanyo;i++){
			for(int j=0;j<tamanyo;j++){
				panel[i][j]=CELDA_VACIA;
			}
		}
		return panel;
	}
	public static void mostrarPanel(char [][]panel){
		System.out.println("Tres en Raya");
		System.out.println("-----------------");
		int nFilas = panel.length;
		int nCols = panel[0].length;
		for(int i=0;i<nFilas;i++){
			for(int j=0;j<nCols;j++){
				System.out.print("\t"+panel[i][j]);
			}
			System.out.println();
		}
	}
	public static boolean esRangoValidoDeCeldas(int fila, int col, int nfilas, int nCols){
		return (fila>=0 && fila<nfilas && col>=0 && col<nCols);
	}

	public static boolean esUnaCeldaVacia(char [][]panel,int fila, int col){
		return panel[fila][col]==(CELDA_VACIA);
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		char jugadorX = 'X';
		char jugadorO = 'O';
		char jugadorActivo = jugadorX;
		char [][] panel = crearPanelVacio(TAMANYO);
		boolean ganador = Boolean.FALSE;
		int nFilas = panel.length;
		int nCols = panel[0].length;
		int posicionesLibres = nFilas*nCols;
		boolean posicionLibre = Boolean.FALSE;
		int fila = 0;
		int col = 0;

		do{
			//Mientras no haya ganador y haya posiciones libres mostramos el panel.
			mostrarPanel(panel);
			System.out.println("Es el turno del jugador: "+jugadorActivo);
			posicionLibre = Boolean.FALSE;
			do{
				if(posicionesLibres>0 && !ganador){
					System.out.println("Introduza una posici�n (fila, columna) entre (0,3):");
					fila = sc.nextInt();
					col = sc.nextInt();
					if(!esRangoValidoDeCeldas(fila,col, nFilas, nCols)){
						System.out.println("La posici�n seleccionada est� fuera de rango.");
					}else{
						if(!esUnaCeldaVacia(panel, fila, col)){
							System.out.println("La posici�n seleccionada ya est� ocupada.");
						}else{
							posicionLibre = Boolean.TRUE;
						}
					}
				}
			}while(!esRangoValidoDeCeldas(fila,col, nFilas, nCols) || !posicionLibre);

			panel[fila][col]=jugadorActivo;
			posicionesLibres--;

			//FIXME: �Cu�l es la condici�n para ser ganador?
			ganador = false; 
			
			if(!ganador){
				if(jugadorActivo==(jugadorX)){
					jugadorActivo = jugadorO;
				}else{
					jugadorActivo = jugadorX;
				}
			}
		}while(!ganador && posicionesLibres>0);
		mostrarPanel(panel);
		if(ganador){
			System.out.println("El ganador es: "+jugadorActivo);
		}else{
			System.out.println("�Empate!");
		}

	}
	private static boolean esGanadorEnDiagonalSecundaria(char jugadorActivo,char[][] panel) {
		//FIXME: �Completar!
		return false;
	}
	private static boolean esGanadorEnDiagonalPrincipal(char jugadorActivo,char[][] panel) {
		//FIXME: �Completar!
		return false;
	}
	private static boolean esGanadorEnColumnas(char jugadorActivo,	char[][] panel) {
		//FIXME: �Completar!
		return false;
	}
	private static boolean esGanadorEnFilas(char jugadorActivo,	char[][] panel) {
		if(panel!=null){
			int nFilas = panel.length;
			int nCols = panel[0].length;
			boolean ganador = Boolean.FALSE;
			int matches = 0;
			ganador = Boolean.FALSE;
			for(int i=0;i<nFilas && !ganador;i++){
				matches = 0;
				for(int j=0;j<nCols && !ganador;j++){
					if(panel[i][j]== (jugadorActivo)){
						matches++;
					}
					ganador = (matches == TAMANYO);
				}

			}
			return ganador;
		}
	
		return false;
	}

}

