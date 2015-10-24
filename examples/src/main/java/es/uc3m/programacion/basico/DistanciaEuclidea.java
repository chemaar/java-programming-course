package es.uc3m.programacion.basico;
/**
 * Escribir un programa que calcule la distancia entre dos puntos.
 * 
 * @author chema
 *
 */
public class DistanciaEuclidea {

	public static void main(String []args){
		double x1 = 2.0;
		double y1 = 3.0;
		double x2 = 4.0;
		double y2 = 5.0;

		double distancia   = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
		
		System.out.println("Distancia = " + distancia);  
	}
}
