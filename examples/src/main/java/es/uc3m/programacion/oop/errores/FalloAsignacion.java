package es.uc3m.programacion.oop.errores;

/**
 * 
 * 
 * Problema: Se realiza una asignaci�n que si bien es correcta carece de sentido. 
 * 
 * 
 * Solución: si nuestra intención es asignar el nuevo valor a nuestro atributo se debe utilizar el objeto this para desambiguar nombres.
 * 
 *
 */
public class FalloAsignacion {

	private String atributo = "";
	
	public void setAtributo(String atributo){
		atributo = atributo;
		//this.atributo = atributo;
	}
	
	public String getAttribute() {
		return atributo;
	}

	public static void main(String args[]){
		FalloAsignacion fs = new FalloAsignacion();
		fs.setAtributo("hola");
		System.out.println(fs.getAttribute().equalsIgnoreCase("hola"));
		
	}
}
