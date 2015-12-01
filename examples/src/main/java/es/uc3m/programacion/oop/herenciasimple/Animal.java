package es.uc3m.programacion.oop.herenciasimple;

public class Animal {

	private String nombre;
	
	public Animal(){
		this.nombre = "name";
	}
	
	public Animal(String nombre){
		this.nombre = nombre;
	}
	public void correr(){
		System.out.println(nombre+" est� corriendo.");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
