package es.uc3m.programacion.oop.ejemplos.chocomize;

public class Pedido {

	private int id;
	private int cantidad;
	private TabletaChocolate tableta;
	
	public Pedido(int cantidad, TabletaChocolate tableta) {
		super();
		this.cantidad = cantidad;
		this.tableta = tableta;
	}
	
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}


	




	public double calcularPrecio(){
		return this.cantidad*this.tableta.calculatePrize();
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public TabletaChocolate getTableta() {
		return tableta;
	}


	public void setTableta(TabletaChocolate tableta) {
		this.tableta = tableta;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + id;
		result = prime * result + ((tableta == null) ? 0 : tableta.hashCode());
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
		Pedido other = (Pedido) obj;
		if (cantidad != other.cantidad)
			return false;
		if (id != other.id)
			return false;
		if (tableta == null) {
			if (other.tableta != null)
				return false;
		} else if (!tableta.equals(other.tableta))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cantidad=" + cantidad + ", tableta="
				+ tableta + "]";
	}
	
	

	
	
}
