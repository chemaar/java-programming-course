package es.uc3m.programacion.oop.ejemplos.ideas.model;

import java.util.Arrays;
import java.util.Date;

import es.uc3m.programacion.oop.ejemplos.ideas.generators.PollIDGenerator;



public class Poll {
	
	int id = PollIDGenerator.nextPollId();
	String title;
	String description;
	User owner;
	Idea []ideas;
	Date startingDate;
	Date closingDate;
	Topic topic;
	int nextFreeIdeaPosition = 0;
	
	public Poll(String title, String description, User owner, Date startingDate, Date closingDate, Topic t) {
		super();
		//The title and description cannot be null or empty.
		this.setTitle(title);
		this.setDescription(description);
		//Owner cannot be null
		this.setOwner(owner);
		this.ideas = new Idea[PlatformConstants.MAX_NUMBER_OF_IDEAS_PER_POLL];
		//We must check that startingDate < closingDate and if they are not null.
		this.setStartingDate(startingDate);
		this.setClosingDate(closingDate);
		//Topic cannot be null
		this.setTopic(t);
		//If these restrictions fail an exception could be thrown...
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title!=null && !title.equals("")){
			this.title = title;	
		}
		
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if(description!=null && !description.equals("")){
			this.description = description;
		}
		//Throw an exception
	}
	public int getId() {
		return id;
	}
	
	
	
	public User getOwner() {
		return owner;
	}



	public void setOwner(User owner) {
		if(owner!=null){
			this.owner = owner;
		}
	
	}



	public Date getStartingDate() {
		return startingDate;
	}



	public void setStartingDate(Date startingDate) {
		if(startingDate!=null && (closingDate==null || 
				(closingDate!=null && this.startingDate.before(this.closingDate)))){
			this.startingDate = startingDate;
		}
		
		//Throw an exception
	}

	public Date getClosingDate() {
		return closingDate;
	}


	public boolean addIdea(Idea a){
		if(this.nextFreeIdeaPosition<this.ideas.length && a!=null && !existsIdea(a)){
			this.ideas[this.nextFreeIdeaPosition] = a;
			this.nextFreeIdeaPosition++;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	protected boolean existsIdea(Idea idea){
		boolean exists = Boolean.FALSE;
		if(idea!=null){
			int i = 0;
			while(!exists && i<this.ideas.length){
				exists = idea.equals(ideas[i]);
				i++;
			}
		}
		return exists;
	}



	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
		if(closingDate!=null && (startingDate==null || 
				(startingDate!=null && this.closingDate.after(this.startingDate)))){
			this.closingDate = closingDate;
		}
		//Throw an exception
	}


	public Idea selectBestIdea(){
		//Check that current time is > closing date. If we want to close the poll.
		Idea bestIdea = this.ideas[0];
		Idea currentIdea = null;
		for(int i =1; i<this.ideas.length;i++){
			if(bestIdea==null){
				bestIdea = currentIdea;
			}else if(this.ideas[i]!=null && bestIdea!=null){
				currentIdea = this.ideas[i];
				//If there is a draw we select the last one...Other criteria could be used or we could return a list...
				if(currentIdea.value()>bestIdea.value()){
					bestIdea = currentIdea;
				}
			}
		}
		return bestIdea;
		
	}

	public Topic getTopic() {
		return topic;
	}



	public void setTopic(Topic topic) {
		if(topic!=null){
			this.topic = topic;
		}
		
	}



	@Override
	public String toString() {
		return "Poll [id=" + id + ", title=" + title + ", description="
				+ description + ", owner=" + owner + ", ideas="
				+ Arrays.toString(ideas) + ", startingDate=" + startingDate
				+ ", closingDate=" + closingDate + ", topic=" + topic
				+ ", nextFreeIdeaPosition=" + nextFreeIdeaPosition + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poll other = (Poll) obj;
		if (id != other.id)
			return false;
		return true;
	}







	
}
