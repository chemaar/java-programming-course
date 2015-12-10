package es.uc3m.programacion.oop.ejemplos.ideas.generators;

public class IdeaIDGenerator {
	private static int id = 1;
	
	public static int nextVoteID(){
		return id++;
	}

}
