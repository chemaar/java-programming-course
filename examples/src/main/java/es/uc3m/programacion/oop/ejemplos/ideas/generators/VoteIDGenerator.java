package es.uc3m.programacion.oop.ejemplos.ideas.generators;

public class VoteIDGenerator {
	private static int id = 1;
	
	public static int nextVoteId(){
		return id++;
	}

}
