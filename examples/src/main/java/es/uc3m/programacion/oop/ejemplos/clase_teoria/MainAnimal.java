package es.uc3m.programacion.oop.ejemplos.clase_teoria;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leon l = new Leon();
		l.setNombre("SEAT");
		l.correr();
		Perro p = new Perro();
		p.setNombre("Scooby Doo");
		p.correr();
		Animal[]animales = new 
				Animal[]{
				l,
				p
		};
		for(int i  = 0;i<animales.length;i++){
			animales[i].correr();
			if(animales[i] instanceof Perro){
				Perro temp = (Perro) animales[i];
				temp.ladrar();
			}
		}
	}

}
