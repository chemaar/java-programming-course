package es.uc3m.programacion.basico;
/**
 * Escribir un programa que calcule los valores de: r y theta, necesarios para transformar unas coordenadas 
 * cartesianas (x,y) a polares.
 * 
 * @author chema
 *
 */
public class CartesianoAPolar {
	 public static void main(String[] args) { 
	        double x = 2.0;
	        double y = 3.0;
	        
	        double r     = Math.sqrt(x*x + y*y);
	        double theta = Math.atan2(y, x);

	        System.out.println("r     = " + r);
	        System.out.println("theta = " + theta);
	    }
}
