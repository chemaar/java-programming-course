package es.uc3m.programacion.basico;
/**
 * Escribir un programa que transforme una temperatura expresada en grados Fahrenheit a Celsius.
 * 
 * Se debería aplicar la siguiente fórmula:
 * 
 * T(C) = (T(F) - 32) * 5/9
 * 
 * @author chema
 *
 */
public class FahrenheitACelsius {

	public static void main(String[] args) {
		 double temperatura = 3.0;
		 temperatura = ((temperatura - 32)*5)/9;
		 System.out.println("Temperatura en Celsius = " + temperatura);
		   
	}

}
