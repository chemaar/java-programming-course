package es.uc3m.programacion.oop.errores;

import java.util.List;

/**
 * Problema: se utiliza un atributo sin inicializaci�n, posibilidad de una excepci�n de tipo NullPointerException.
 * 
 * Solución: inicializaci�n de los atributos o bien en la declaración o bien en el constructor para inicializar el estado 
 * del objeto.
 * 
 *
 */

public class FalloIniciarObjeto {

	private List<String> valores;
	
	public FalloIniciarObjeto(){
		//The attribute values is not started so it is null.
	}
	
	public void anyadirValor(String valor){
		this.valores.add(valor);
	}
	
	public static void main(String []args){
		new FalloIniciarObjeto().anyadirValor("valor");
	}
}
