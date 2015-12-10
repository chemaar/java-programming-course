package es.uc3m.programacion.oop.ejemplos.ideas.generators;

public class PollIDGenerator {
	private static int id = 1;
	
	public static int nextPollId(){
		return id++;
	}

}
