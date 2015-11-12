package es.uc3m.programacion.juegos.gol;

import java.io.IOException;

/**
 * Esta clase presenta una simulación del clásico Juego de la vida utilizando funciones.
 * 
 * @see http://es.wikipedia.org/wiki/Juego_de_la_vida
 * @see http://en.wikipedia.org/wiki/Conway's_Game_of_Life
 * @author chema
 *
 */
public class JuegoDeLaVidaSimple {

	private static final int NGENERACIONES = 100;
	private static final int TAMANYO = 3;


	public static void main(String []args) throws IOException, InterruptedException{
		boolean [][]panel;
		boolean [][] panelNuevo = new boolean[TAMANYO][TAMANYO];
		int nVecinosVivos=0;
		int totalCeldasVivas = 0;
		//panel = crearPanelAleatorio(TAMANYO, TAMANYO);
		//panel = patronDeDemo();
		panel = patronDeDemo2();
		totalCeldasVivas = contarCeldasVivas(panel);

		for(int generacion=0;generacion<NGENERACIONES;generacion++){
			//Evolución
			System.out.println("Generación: "+generacion+" total de celdas vidas: "+totalCeldasVivas);
			mostrar(panel);
			totalCeldasVivas = 0;
			for(int i = 0;i<panel.length;i++){
				for (int j= 0; j<panel[0].length;j++){
					nVecinosVivos=contarVecinosVivos(panel,i,j);
					//Una celda viva con menos de 2 vecinos vivos->muere
					//Una celda viva con 2 o 3 vecinos vivos->permanece como está
					//Una celda viva con más de 3 vecinos vivos->muere
					//Una celda muerta con exactamente 3 vecinos vivos->nace (viva)
					if(panel[i][j]){
						if(nVecinosVivos<2){
							panelNuevo[i][j] = false;
						}else if((nVecinosVivos>=2 && nVecinosVivos<=3)){
							panelNuevo[i][j] = true;
						}else if (nVecinosVivos>3){
							panelNuevo[i][j] = false;
						}
					}else{
						panelNuevo[i][j] = (nVecinosVivos==3);
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
	 * 
	 * Se utiliza la expresión ternaria en Java para comprimir un poco el código.
	 * if(expr.) valor_1 else valor_2. E.j. a = (b>2?b:-b); if (b>2){ a = b;} else{a = -b;}
	 * 
	 * 
	 * @param panel El panel a chequear.
	 * @param fila La fila de la celda a chequear.
	 * @param col La columna de la celda a chequear.
	 * @return El número de celdas vivas alrededor de fila y columna.
	 */
	public static short contarVecinosVivos(boolean [][]panel, int fila, int col){
		short vivos = 0;
		if(panel != null && fila>=0 && fila<panel.length && col>=0 && col<panel[0].length){
			int nrows = panel.length;
			int ncols = panel[0].length;
			vivos += (col+1<ncols?(panel[fila][col+1]?1:0):0);
			vivos += (col-1>=0?(panel[fila][col-1]?1:0):0);
			vivos += (fila+1<nrows?(panel[fila+1][col]?1:0):0);
			vivos += (fila-1>=0?(panel[fila-1][col]?1:0):0);
			vivos += (fila-1>=0 && col-1>=0?(panel[fila-1][col-1]?1:0):0);
			vivos += (fila-1>=0 && col+1<ncols?(panel[fila-1][col+1]?1:0):0);
			vivos += (fila+1<nrows && col-1>=0?(panel[fila+1][col-1]?1:0):0);
			vivos += (fila+1<nrows && col+1<ncols?(panel[fila+1][col+1]?1:0):0);
		}
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
	
	public static boolean [][] crearPanelAleatorio(int filas, int cols){
		if(filas>0 && cols>0){
			boolean [][] panel = new boolean[filas][cols];
			for(int i = 0;i<filas;i++){
				for (int j= 0; j<cols;j++){
					panel[i][j]=Math.random()>0.5;
				}
			}
			return panel;
		}
		return new boolean[0][0];
	}

	public static int contarCeldasVivas(boolean [][] panel){
		int celdasVivas = 0;
		if(panel!=null){
			for(int i = 0;i<panel.length;i++){
				for (int j= 0; j<panel[0].length;j++){
					celdasVivas = (panel[i][j]?celdasVivas+1:celdasVivas);
				}
			}
		}
		return celdasVivas;
	}

}

