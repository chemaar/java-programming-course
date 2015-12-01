package es.uc3m.programacion.oop.ejemplos.chocomize;

import java.util.List;


public class TabletaChocolate {

	Chocolate chocolate;
	double cantidad;
	List<IngredientePedido> ingredientesPedido;
	
	
	public double calculatePrize(){
		double prize = 0.0;
		prize = prize + (this.cantidad*this.chocolate.getCosteUnitario());
		for(IngredientePedido ingredientePedido: this.ingredientesPedido){
			prize = prize + (ingredientePedido.getCantidad()*
					ingredientePedido.getIngrediente().getCosteUnitario());
		}
		return prize;
	}


	public Chocolate getChocolate() {
		return chocolate;
	}


	public void setChocolate(Chocolate chocolate) {
		this.chocolate = chocolate;
	}


	public double getCantidad() {
		return cantidad;
	}


	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	public List<IngredientePedido> getIngredientesPedido() {
		return ingredientesPedido;
	}


	public void setIngredientesPedido(List<IngredientePedido> ingredientesPedido) {
		this.ingredientesPedido = ingredientesPedido;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cantidad);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((chocolate == null) ? 0 : chocolate.hashCode());
		result = prime
				* result
				+ ((ingredientesPedido == null) ? 0 : ingredientesPedido
						.hashCode());
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
		TabletaChocolate other = (TabletaChocolate) obj;
		if (Double.doubleToLongBits(cantidad) != Double
				.doubleToLongBits(other.cantidad))
			return false;
		if (chocolate == null) {
			if (other.chocolate != null)
				return false;
		} else if (!chocolate.equals(other.chocolate))
			return false;
		if (ingredientesPedido == null) {
			if (other.ingredientesPedido != null)
				return false;
		} else if (!ingredientesPedido.equals(other.ingredientesPedido))
			return false;
		return true;
	}


	public TabletaChocolate(Chocolate chocolate, double cantidad,
			List<IngredientePedido> ingredientesPedido) {
		super();
		this.chocolate = chocolate;
		this.cantidad = cantidad;
		this.ingredientesPedido = ingredientesPedido;
	}


	public TabletaChocolate() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "TabletaChocolate [chocolate=" + chocolate + ", cantidad="
				+ cantidad + ", ingredientesPedido=" + ingredientesPedido + "]";
	}
	
	
	
}
