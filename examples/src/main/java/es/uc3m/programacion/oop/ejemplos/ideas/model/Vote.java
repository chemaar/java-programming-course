package es.uc3m.programacion.oop.ejemplos.ideas.model;

import es.uc3m.programacion.oop.ejemplos.ideas.generators.VoteIDGenerator;

public class Vote {
	int id = VoteIDGenerator.nextVoteId();
	boolean isPositive;
	long timestamp;
	User author;
	
	public Vote(boolean isPositive, User author) {
		super();
		this.isPositive = isPositive;
		this.author = author;
		this.timestamp = System.currentTimeMillis();
	}
	public boolean isPositive() {
		return isPositive;
	}
	public void setPositive(boolean isPositive) {
		this.isPositive = isPositive;
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
	public long getTimestamp() {
		return timestamp;
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
		Vote other = (Vote) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vote [id=" + id + ", isPositive=" + isPositive + ", timestamp="
				+ timestamp + ", author=" + author + "]";
	}
	
	

}
