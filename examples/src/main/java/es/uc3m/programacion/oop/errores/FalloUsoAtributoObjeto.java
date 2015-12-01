package es.uc3m.programacion.oop.errores;

/**
 * Problema: un atributo de objeto se intenta utilizar un método de clase (static).
 * 
 * Solución: los miembros de clase no pueden utilizar miembros de objeto ya que para estos se necesita la creación de una 
 * nueva instancia.
 *
 *
 */
public class FalloUsoAtributoObjeto {
	
	private String atributo;
	
	public static void unMetodo(){
		this.atributo = "valor";
	}

}
