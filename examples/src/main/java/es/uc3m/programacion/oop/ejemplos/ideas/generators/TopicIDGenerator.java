package es.uc3m.programacion.oop.ejemplos.ideas.generators;

public class TopicIDGenerator {
	private static int id = 1;
	
	public static int nextTopicId(){
		return id++;
	}

}
