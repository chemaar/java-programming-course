/**
 * Escribir un programa que calcule la sensaci�n t�rmica siguiendo la siguiente f�rmula.
 * 
 * Se deber� aplicar la siguiente f�rmula en funci�n de la temperatura y la velocidad:
 * 
 * T_{s}=13,12+0,6215*T-11,37*V^{0,16}+0,3965*T*V^{0,16}
 * 
 * @author chema
 *
 */
public class SensacionTermica {
	 public static void main(String[] args) {
	        double t = 10.0; //Temperatura del aire
	        double v = 5.0; //Velocidad del aire
	        double ts = 13.12 + 0.6215*t -(11.37*Math.pow(v, 0.16))+(0.3965*t* Math.pow(v, 0.16));
	        System.out.println("Temperatura = " + t);
	        System.out.println("Velocidad del tiempo  = " + v);
	        System.out.println("Sensaci�n t�rmica  = " + ts);
	    }
}
