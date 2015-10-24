package es.uc3m.programacion.basico;
/**
 * Escribir un programa que dado un mes (m), día (d) y año (y) muestre por pantalla
 * el nº de día de la samena. 
 * 
 * Los meses comienzan en 1 hasta 12.
 * Los días comienzan en 0 (domingo).
 * 
 * Se deberí aplicar la siguiente fórmula:
 *
 *        y0 = y - (14 - m) / 12
 *        x = y0 + y0/4 - y0/100 + y0/400
 *        m0 = m + 12 * ((14 - m) / 12) - 2
 *        d = (d + x + (31*m0)/12) mod 7
 * 
 * @author chema
 *
 */
public class DiaDeLaSemana {
	 public static void main(String[] args) { 
	        int m = 10;
	        int d = 5;
	        int y = 2015;

	        int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + (31*m0)/12) % 7;

	        System.out.println(d0);
	    }
}
