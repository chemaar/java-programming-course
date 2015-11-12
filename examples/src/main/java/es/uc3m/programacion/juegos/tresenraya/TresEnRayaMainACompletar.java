package es.uc3m.programacion.juegos.tresenraya;
import java.util.Scanner;

/**
 * 
 * Esta clase implementa en una funci�n main el juego del Tres en raya. Algunas de las funcionalidades
 * est�n sin completar y se deber�n implementar para poder jugar. 
 * 
 * Para ello, se deben realizar cambios en los lugares se�alados cone FIXME
 * 
 * @author chema
 *
 */
public class TresEnRayaMainACompletar {
	private static final int TAMANYO = 3;
	private static final char CELDA_VACIA = '_';

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		char jugadorX = 'X';
		char jugadorO = 'O';
		char jugadorActivo = jugadorX;
		char [][] panel = new char[TAMANYO][TAMANYO];
		boolean ganador = Boolean.FALSE;
		int numFilas = panel.length;
		int numCols = panel[0].length;
		int posicionesLibres = numFilas*numCols;
		boolean posicionLibre = Boolean.FALSE;
		int fila = 0;
		int col = 0;
		//1-Inicializamos el panel con todas las celdas vac�as.

		for(int i=0;i<numFilas;i++){
			for(int j=0;j<numCols;j++){
				panel[i][j]=CELDA_VACIA;
			}
		}
		do{
			//Mientras no haya ganador y haya posiciones libres mostramos el panel.

			System.out.println("Tres en raya");
			System.out.println("-----------------");
			for(int i=0;i<numFilas;i++){
				for(int j=0;j<numCols;j++){
					System.out.print("\t"+panel[i][j]);
				}
				System.out.println();
			}
			System.out.println("Es el turno del jugador: "+jugadorActivo);
			posicionLibre = Boolean.FALSE;
			do{
				if(posicionesLibres>0 && !ganador){
					System.out.println("Introduza una posici�n (fila, columna) entre (0,3):");
					fila = sc.nextInt();
					col = sc.nextInt();
					if(fila<0 || fila>numFilas-1 || col<0 || col>numCols-1){
						System.out.println("La posici�n seleccionada est� fuera de rango.");
					}else{
						if(panel[fila][col] != CELDA_VACIA){
							System.out.println("La posici�n seleccionada ya est� ocupada.");
						}else{
							posicionLibre = Boolean.TRUE;
						}
					}
				}
			}while(fila<0 || fila>numFilas-1 || col<0 || col>numCols-1 || !posicionLibre);

			panel[fila][col]=jugadorActivo;
			posicionesLibres--;

			//Mejorar para s�lo verificar si es ganador cuando todav�a no sea ganador por alguna de las reglas.
			//Chequear que el jugador activo es ganador por filas.
			int matches = 0;
			ganador = Boolean.FALSE;
			for(int i=0;i<numFilas && !ganador;i++){
				matches = 0;
				for(int j=0;j<numCols && !ganador;j++){
					if(panel[i][j] == (jugadorActivo)){
						matches++;
					}
					ganador = (matches == TAMANYO);
				}

			}
			//Chequear que el jugador activo es ganador por columnas.
			//FIXME: �COMPLETAR!
			
			
			//Chequear que el jugador activo es ganador en la diagonal principal.
			//FIXME: �COMPLETAR!
		

			//Chequear que el jugador activo es ganador en la diagonal secundaria.
			//FIXME: �COMPLETAR!

			if(!ganador){
				if(jugadorActivo == (jugadorX)){
					jugadorActivo = jugadorO;
				}else{
					jugadorActivo = jugadorX;
				}
			}
		}while(!ganador && posicionesLibres>0);
		if(ganador){
			System.out.println("El ganador es: "+jugadorActivo);
		}else{
			System.out.println("�Empate!");
		}

	}

}

