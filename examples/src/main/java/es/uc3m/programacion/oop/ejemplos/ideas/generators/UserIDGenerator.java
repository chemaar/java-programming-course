package es.uc3m.programacion.oop.ejemplos.ideas.generators;
public class UserIDGenerator {
	private static int id = 1;
	
	public static int nextUserId(){
		return id++;
	}

}
