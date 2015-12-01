package es.uc3m.programacion.oop.ejemplos.clase_teoria;

public class Persona {

	/**
	 * Declaramos las propiedades de nuestra clase.
	 */
	private int edad;
	private String nombre;
	
	/*
	 * 
	 * M�todo constructor para inicializar
	 * el estado de las instancias.
	 */
	public Persona(){
		this.edad = 0;
		this.nombre = "";
	}
	
	public Persona(String nombre){
		this.edad = 0;
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}

	public int getEdad(){
		return this.edad;
	}
	
	public void setNombre(String nuevoNombre){
		if(nuevoNombre!=null && 
				!nuevoNombre.equals("")){
			this.nombre = nuevoNombre;	
		}
	}
	
	public void setEdad(int nuevaEdad){
		if(nuevaEdad>0){
			this.edad = nuevaEdad;	
		}
	}
	
	public void andar(){
		System.out.println(this.nombre+" estoy andando.");
	}

	public void cumplirAnyos(){
		this.edad++;
	}
}
