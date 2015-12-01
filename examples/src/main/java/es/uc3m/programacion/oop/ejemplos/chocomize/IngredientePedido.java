package es.uc3m.programacion.oop.ejemplos.chocomize;

public class IngredientePedido {

	private Ingrediente ingrediente;
	private double cantidad;

	
	public Ingrediente getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public IngredientePedido(Ingrediente ingrediente, double cantidad) {
		super();
		this.ingrediente = ingrediente;
		this.cantidad = cantidad;
	}
	public IngredientePedido() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cantidad);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ingrediente == null) ? 0 : ingrediente.hashCode());
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
		IngredientePedido other = (IngredientePedido) obj;
		if (Double.doubleToLongBits(cantidad) != Double
				.doubleToLongBits(other.cantidad))
			return false;
		if (ingrediente == null) {
			if (other.ingrediente != null)
				return false;
		} else if (!ingrediente.equals(other.ingrediente))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "IngredientePedido [ingrediente=" + ingrediente + ", cantidad=" + cantidad
				+ "]";
	}
	
	
}
