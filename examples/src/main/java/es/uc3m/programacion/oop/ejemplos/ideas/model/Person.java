package es.uc3m.programacion.oop.ejemplos.ideas.model;

public class Person extends User {

	String nickname;
	
	public Person(){
		this.nickname = "";
	}

	public Person(String nickname) {
		super();
		this.nickname = nickname;
	}

	public Person(String email, String name, String nickname) {
		super(email, name);
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "Person [nickname=" + nickname + ", id=" + id + ", email="
				+ email + ", name=" + name + "]";
	}


	
}
