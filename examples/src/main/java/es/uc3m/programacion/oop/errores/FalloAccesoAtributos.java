package es.uc3m.programacion.oop.errores;

/**
 * Problema: se intenta modifcar el valor de un atributo de clase utilizando el objeto this para acceder a dicho atributo.
 * 
 * Solución: el objeto this s�lo existe cuando existe una instancia. Por lo tanto, para acceder a un atributo de 
 * clase se utiliza NOMBRE_DE_LA_CLASE.NOMBRE_ATRIBUTO (teniendo en cuenta la visibilidad).
 * 
 *
 */
public class FalloAccesoAtributos {

	public static String NOMBRE="UC3M";
	
	public FalloAccesoAtributos(){
		this.NOMBRE = "OTRO NOMBRE"; //Warning
		FalloAccesoAtributos.NOMBRE = "OTRO NOMBRE";
	}
}
