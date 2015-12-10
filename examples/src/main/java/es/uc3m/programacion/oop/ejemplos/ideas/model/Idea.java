package es.uc3m.programacion.oop.ejemplos.ideas.model;

import java.util.Arrays;

import es.uc3m.programacion.oop.ejemplos.ideas.generators.UserIDGenerator;


public class Idea {

	int id = UserIDGenerator.nextUserId();
	String title;
	String description;
	User author;
	Vote [] votes;
	//We could also keep a link to the poll...
	long timestamp;
	int nextFreeVotePosition = 0;
	public Idea(String title, String description, User author) {
		super();
		this.setTitle(title);
		this.setDescription(description);
		this.setAuthor(author);
		this.timestamp = System.currentTimeMillis();
		this.votes = new Vote[PlatformConstants.MAX_NUMBER_OF_VOTES_PER_IDEA];
		//Check valid ranges, errors->exceptions could be used...
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

	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		if(author!=null){
			this.author = author;
		}
	}
	public int getId() {
		return id;
	}
	public Vote[] getVotes() {
		return votes;
	}
	public long getTimestamp() {
		return timestamp;
	}
	
	//Maybe for all these add element and check if the element already exists, Java generics could be used...
	public boolean addVote(Vote a){
		if(this.nextFreeVotePosition<this.votes.length && a!=null && !existsVote(a)){
			this.votes[this.nextFreeVotePosition] = a;
			this.nextFreeVotePosition++;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	protected boolean existsVote(Vote vote){
		boolean exists = Boolean.FALSE;
		if(vote!=null){
			int i = 0;
			while(!exists && i<this.votes.length){
				exists = vote.equals(votes[i]) && !vote.getAuthor().equals(votes[i].getAuthor());
				i++;
			}
		}
		return exists;
	}
	
	public int value(){
		int value = 0;
		for(Vote vote:this.votes){
			if(vote!=null){
				if(vote.isPositive){
					value++;
				}else{
					value--;
				}
			}
		}
		return value;
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
		Idea other = (Idea) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Idea [id=" + id + ", title=" + title + ", description="
				+ description + ", author=" + author + ", votes="
				+ Arrays.toString(votes) + ", timestamp=" + timestamp + "]";
	}
	
	
}
