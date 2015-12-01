package es.uc3m.programacion.oop.ejemplos.clase_teoria;

public abstract class Animal {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public abstract void correr();
	
}
