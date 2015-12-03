package es.uc3m.programacion.oop.basico;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		Persona cristiano = new Persona(30,"Cristiano");
		System.out.println("Edad:" +cristiano.getEdad());
		System.out.println(cristiano.getNombre()+" va a cumplir años.");
		cristiano.cumplirAnyos();
		System.out.println("Edad:" +cristiano.getEdad());
		
		//Acceso a un atributo de **clase**
		//Nombre_de_la_clase.nombre_atributo (depende de la visibilidad)
//		System.out.println(Persona.N_BRAZOS);
//		System.out.println("Edad:" +cristiano.getEdad());
//
		
	}

}
