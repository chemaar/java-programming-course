/**
 * Escribir un programa que calcule la sensación térmica siguiendo la siguiente fórmula.
 * 
 * Se deberá aplicar la siguiente fórmula en función de la temperatura y la velocidad:
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
	        System.out.println("Sensación térmica  = " + ts);
	    }
}
