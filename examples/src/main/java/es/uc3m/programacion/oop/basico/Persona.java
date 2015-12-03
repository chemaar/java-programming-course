package es.uc3m.programacion.oop.basico;

public class Persona {

	//Atributos definidos a nivel de clase
	//Modificador *static*

	public static int N_BRAZOS = 4; //Es una constante

	//Atributos definidos a nivel de objeto
	//Visibilidad: por omisión es *protected* y 
	//a nivel de paquete Java
	private int edad = 0;
	private String nombre = "";

	//Métodos
	/**
	 * Definidos por:
	 * a-Nombre
	 * b-Tipo del valor de retorno
	 * c-Nº y tipo de los parámetros
	 * 
	 * a+c->Signatura del método
	 * 
	 * En una misma clase, no pueden existir dos métodos con 
	 * la misma signatura.
	 * 
	 * Sintaxis:
	 * 
	 * 
	 * modificadores+tipo_valor_retorno+nombre(lista_params)
	 * 
	 * lista_params::= vacia
	 * lista_params::=param (,lista_params)*
	 * 
	 *
	 * param::=tipo_de_dato nombre
	 * 
	 */

	/**
	 * Un método constructor inicializa el estado 
	 * del objeto.
	 * 
	 * -No devuelve ningún valor
	 * -Su signatura es:
	 * --modificadores nombre_clase(lista_params)
	 */
	public Persona(){
		this.edad = 0;
		this.nombre = "";
	}

	public Persona(int edad){
		this.edad = edad;
		
	}
	
	public Persona(int edadInicial, String nombreInicial){
		this.edad = edadInicial;
		this.nombre = nombreInicial;
	}
	
	
	public void cumplirAnyos(){
		this.edad++;
	}
	
	public int getEdad(){
		return this.edad;
	}

	public String getNombre(){
		return this.nombre;
	}
	

}
