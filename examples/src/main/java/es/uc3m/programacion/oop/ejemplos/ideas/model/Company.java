package es.uc3m.programacion.oop.ejemplos.ideas.model;

public class Company extends User{

	String companyID;

	public Company(String companyID) {
		super();
		this.companyID = companyID;
	}

	public Company(String email, String name, String companyID) {
		super(email, name);
		this.companyID = companyID;
	}

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	@Override
	public String toString() {
		return "Company [companyID=" + companyID + ", id=" + id + ", email="
				+ email + ", name=" + name + "]";
	}
	
	
	
}
