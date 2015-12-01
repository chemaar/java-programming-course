package es.uc3m.programacion.oop.errores;

/**
 * Problema: se intenta modificar el valor de una constante.
 * 
 * Solución: si necesitamos una constante debemos asumir que no se va a poder cambiar.  Si necesitamos cambio de valor
 * deberemos pensar en alguna variable.
 * 
 *
 */
public class FalloCambiarConstante {

	public static final String VALOR_CONSTANTE = "UC3M";
	
	public static void main(String []args){
		FalloCambiarConstante.VALOR_CONSTANTE = "Universidad Carlos III de Madri";
	}
}
