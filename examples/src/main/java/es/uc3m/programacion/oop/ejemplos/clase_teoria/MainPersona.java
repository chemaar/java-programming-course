package es.uc3m.programacion.oop.ejemplos.clase_teoria;
import java.util.Random;


public class MainPersona {

	public static void main(String []args){
		Random rand = new Random();
		int maxEdad = 19;
		int minEdad = 18;
	    Persona [] alumnos = new Persona[20];
		for(int i = 0;i<alumnos.length;i++){
			alumnos[i] = new Persona("Nombre "+i);
			int edad = rand.nextInt((maxEdad - minEdad) + 1) + minEdad;
			alumnos[i].setEdad(edad);
		}
		for(int i = 0;i<alumnos.length;i++){
			System.out.println("Mi nombre es: "+alumnos[i].getNombre());
			System.out.println("...y tengo: "+alumnos[i].getEdad()+" a�os.");
		}
	}
	
//	Persona padrino = new Persona();
//	Persona apadrinado = new Persona("Michael Corleone");
//	System.out.println("El nombre del padrino es: "+padrino.getNombre());
//	System.out.println("El nombre  del apadrinado es: "+apadrinado.getNombre());
//	padrino.setNombre("Tony Soprano");
//	System.out.println("El nombre del padrino es: "+padrino.getNombre());
//	System.out.println("El nombre  del apadrinado es: "+apadrinado.getNombre());
//	padrino.andar();
//	apadrinado.andar();
//	System.out.println("Antes ten�a "+apadrinado.getEdad()+" a�os.");
//	apadrinado.cumplirAnyos();
//	System.out.println("Despu�s tengo "+apadrinado.getEdad()+" a�os.");
//	
}
