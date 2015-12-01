package es.uc3m.programacion.oop.ejemplos.chocomize;

public class Ingrediente {

	private int id;
	private String descripcion;
	private double costeUnitario;
	
	
	
	public Ingrediente(int id, String description, double costeUnitario) {
		super();
		this.id = id;
		this.descripcion = description;
		this.costeUnitario = costeUnitario;
	}
	
	
	public Ingrediente() {
		super();

	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getCosteUnitario() {
		return costeUnitario;
	}


	public void setCosteUnitario(double costeUnitario) {
		this.costeUnitario = costeUnitario;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(costeUnitario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Ingrediente other = (Ingrediente) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(costeUnitario) != Double
				.doubleToLongBits(other.costeUnitario))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Topping [id=" + id + ", description=" + descripcion
				+ ", unitCost=" + costeUnitario + "]";
	}
	
	
}
