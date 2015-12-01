package es.uc3m.programacion.oop.ejemplos.chocomize;

public class PedidoCliente {

	Cliente cliente;
	Pedido pedido;
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
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
		PedidoCliente other = (PedidoCliente) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PedidoCliente [cliente=" + cliente + ", pedido=" + pedido + "]";
	}
	public PedidoCliente(Cliente cliente, Pedido pedido) {
		super();
		this.cliente = cliente;
		this.pedido = pedido;
	}
	public PedidoCliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
