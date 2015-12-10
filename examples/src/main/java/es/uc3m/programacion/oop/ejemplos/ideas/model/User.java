package es.uc3m.programacion.oop.ejemplos.ideas.model;

import es.uc3m.programacion.oop.ejemplos.ideas.generators.UserIDGenerator;

public abstract class User {

	//We do not allow to modify the id, it is expected to be created by a third-party in the right range.
	protected int id = UserIDGenerator.nextUserId();
	protected String email;
	protected String name;
	
	public User(){
		this.email = "";
		this.name = "";
	}

	public User(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
