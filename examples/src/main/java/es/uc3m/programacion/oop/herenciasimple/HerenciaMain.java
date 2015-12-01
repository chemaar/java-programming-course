package es.uc3m.programacion.oop.herenciasimple;

public class HerenciaMain {

	public static void main (String []args){
		Animal a = new Perro();
		a.setNombre("Scooby Doo");
		a.correr();
		Perro b = new Perro();
		b.setNombre("Otro perro");
		b.correr();
	}
}
