package es.uc3m.programacion.juegos.gol;


import java.io.IOException;

/**
 * Esta clase presenta una simulación del clásico Juego de la vida utilizando funciones.
 * No obstante, algunas de las funcionalidades deben ser implementados para poder realizar la simulación. 
 * 
 * Para ello, se deben realizar cambios en los lugares señalados con FIXME
 * 
 * @see http://es.wikipedia.org/wiki/Juego_de_la_vida
 * @see http://en.wikipedia.org/wiki/Conway's_Game_of_Life
 * @author chema
 *
 */
public class JuegoDeLaVidaSimpleParaCompletar {

    private static final int NGENERACIONES = 100;
	private static final int TAMANYO = 20; 


	public static void main(String []args) throws IOException, InterruptedException{
		boolean [][]panel = new boolean[TAMANYO][TAMANYO];
		boolean [][] panelNuevo = new boolean[TAMANYO][TAMANYO];
		int nVecinosVivos=0;
		int totalCeldasVivas = 0;
		
		panel = patronDeDemo();
		//panel = patronDeDemo2(); //Para utilizar este patrón poned el TAMANYO=3
		
		for(int i = 0;i<panel.length;i++){
			for (int j= 0; j<panel[0].length;j++){
				totalCeldasVivas+=(panel[i][j]?1:0);
			}
		}
		
		for(int generacion=1;generacion<NGENERACIONES;generacion++){
			//Evolución
			System.out.println("Generación: "+generacion+" total de celdas vivas: "+totalCeldasVivas);
			mostrar(panel);
			totalCeldasVivas = 0;
			for(int i = 0;i<panel.length;i++){
				for (int j= 0; j<panel[0].length;j++){
					
					//Implementar esta función, no es necesario saber nada de funciones.
					//Llamo a la función que me devuelve el número de vecinos vivos y lo asigno a nVecinosVivos.
					nVecinosVivos=contarVecinosVivos(panel,i,j);
					

					//Aplicar estas reglas para actualizar la tabla (panel nuevo) con una nueva generación.

						panelNuevo[i][j] = panel[i][j];

					//Una celda viva con menos de 2 vecinos vivos->muere

						if (panel[i][j] && (nVecinosVivos < 2)){
							panelNuevo[i][j] = false;  // celda muerta
						}											

					//Una celda viva con 2 o 3 vecinos vivos->permanece como está

						if (panel[i][j] && ((nVecinosVivos == 2)||(nVecinosVivos == 3)) ){							
							panelNuevo[i][j] = true;  // se queda igual, viva
						}								

					//Una celda viva con más de 3 vecinos vivos->muere

						if (panel[i][j] && (nVecinosVivos > 3)){
							panelNuevo[i][j] = false;  // celda muerta
						}								

					//Una celda muerta con exactamente 3 vecinos vivos->nace (viva)

						if (!(panel[i][j]) && (nVecinosVivos == 3)){
							panelNuevo[i][j] = true;  // celda nace
						}											
					
			
					
					totalCeldasVivas+=(panelNuevo[i][j]?1:0);
				}
			}//Actualizar el panel
			
			//Copiar la nueva generación en el panel actual.
			for(int i = 0;i<panel.length;i++){
				for (int j= 0; j<panel[0].length;j++){
					panel[i][j] = panelNuevo[i][j];
				}
			}

			Thread.currentThread().sleep(200);
		}

	}

	/**
	 * Dado un panel de valores booleanos: 1 representa una celda viva y 0 una celda muerta. Esta función
	 * retornará el número de celdas vivas alrededor de fila y columna.
	 * @param panel El panel a chequear.
	 * @param fila La fila de la celda a chequear.
	 * @param col La columna de la celda a chequear.
	 * @return El número de celdas vivas alrededor de fila y columna.
	 */
	public static short contarVecinosVivos(boolean [][]panel, int fila, int col){
		
		// Implementar está función y calcular el número de celdas vivas alrededor de fila y columna.
		/* Esta función recorre todos los vecinos de la celda (fila,col) pasada como parámetro
		   del panel a comprobar */

		short vivos = 0;
		int nFilas = panel.length;
		int ncols = panel[0].length;

		//Chequear y contar los celdas vecinas vivas
		//CAMBIO 1:ESTA RESTRICCIÓN DEBE SER <= NO SOLO < sino no se visitan todos los vecinos
		for (int k=fila-1;k<=fila+1;k++){
			for (int m= col-1;m<=col+1;m++){
				
			// Compruebo que los indices de los vecinos están dentro del panel	
			//CAMBIO 2:LAS RESTRICCIONES CON  NFILAS Y NCOLS DEBEN SER ESTRICTAS.
				if ((k < nFilas) && (k>= 0) && (m< ncols) && (m>= 0)){
					if (!(k == fila && m == col)){ // Esta celda no se debe comprobar , no es un vecino es ella misma.					
						if (panel[k][m]){
							vivos++;
						}  
					}
				}  // fin if comprobación de los límites del panel
			}  // fin for columnas	
		}  // fin for filas	

	
		return vivos;
	}


	public static void mostrar(boolean [][]panel){
		for(int i = 0;i<panel.length;i++){
			for (int j= 0; j<panel[0].length;j++){
				if(panel[i][j]){
					System.out.print("\t \u2665");
				}else{
					System.out.print("\t \u271D");
				}
			}
			System.out.println();
		}
	}

	public static boolean [][] patronDeDemo(){
		return new boolean[][]{
				{ true,	 true,	 true,	 true,	 false,	 false,	 true,	 false,	 false,	 false},
				{ false,	 true,	 true,	 false,	 false,	 true,	 true,	 true,	 false,	 false},
				{ true,	 true,	 false,	 true,	 false,	 true,	 false,	 false,	 true,	 true},
				{ false,	 true,	 false,	 false,	 false,	 false,	 false,	 false,	 false,	 false},
				{ false,	 true,	 true,	 true,	 false,	 true,	 true,	 true,	 false,	 false},
				{ true,	 false,	 true,	 true,	 false,	 true,	 true,	 true,	 true,	 true},
				{ true,	 false,	 true,	 false,	 false,	 true,	 true,	 false,	 true,	 false},
				{ true,	 false,	 false,	 true,	 false,	 false,	 false,	 true,	 false,	 false},
				{ true,	 false,	 false,	 true,	 false,	 true,	 true,	 true,	 true,	 false},
				{ false,	 false,	 true,	 true,	 false,	 false,	 false,	 false,	 true,	 true} 
		};
	}
	
	public static boolean [][] patronDeDemo2(){
		return new boolean[][]{
				{ false, true,	false},
				{ true,	 true,	false},
				{ true,	 false,	true},
				 
		};
	}

}
