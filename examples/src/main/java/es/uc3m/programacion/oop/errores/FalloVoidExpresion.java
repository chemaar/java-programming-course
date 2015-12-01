package es.uc3m.programacion.oop.errores;

/**
 * Problema: intento de asignaci�n de un valor void a una variable de tipo entero.
 * 
 * 
 * Solución: cambiar el tipo del valor de retorno, uso de funciones.
 *
 */
public class FalloVoidExpresion {

	public void getValue(){
	}
	
	public static void main(String []args){
		int a = new FalloVoidExpresion().getValue();
	}
}
