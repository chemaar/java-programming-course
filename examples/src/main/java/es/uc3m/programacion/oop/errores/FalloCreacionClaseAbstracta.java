package es.uc3m.programacion.oop.errores;

/**
 * Problema: intento de creaci�n de una instancia de una clase abstracta.
 * 
 * Solución: creaci�n de una instancia de una clase no-abstracta que herede de la que s� es abstracta.
 * 
 *
 */
public abstract class FalloCreacionClaseAbstracta {

	public static void main(String []args) {
		new ClaseAbstracta();
	}
}
