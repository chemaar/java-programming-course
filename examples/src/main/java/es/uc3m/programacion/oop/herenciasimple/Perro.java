package es.uc3m.programacion.oop.herenciasimple;

public class Perro extends Mamifero{

	private int patas = 4;

	public Perro() {
		super();
		
	}
	
	public void correr(){
	//�Qu� ocurre si se descomenta la siguiente sentencia?
	//	super.run(); 
		System.out.println("El perro "+this.getNombre()+" est� corriendo.");
	}
	
}
