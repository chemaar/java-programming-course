package es.uc3m.programacion.oop.ejemplos.ideas.model;

import es.uc3m.programacion.oop.ejemplos.ideas.generators.TopicIDGenerator;

public class Topic {

	int id = TopicIDGenerator.nextTopicId();
	String title;
	String description;
	public Topic(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", title=" + title + ", description="
				+ description + "]";
	}
	
	
}
