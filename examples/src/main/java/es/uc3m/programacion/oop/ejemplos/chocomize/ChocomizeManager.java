package es.uc3m.programacion.oop.ejemplos.chocomize;
import java.util.LinkedList;
import java.util.List;


public class ChocomizeManager {
	
	public List<Chocolate> tiposDeChocolate;
	public List<Ingrediente> tiposDeIngredientes;
	


	public ChocomizeManager(List<Chocolate> tiposDeChocolate,
			List<Ingrediente> tiposDeIngredientes) {
		super();
		this.tiposDeChocolate = tiposDeChocolate;
		this.tiposDeIngredientes = tiposDeIngredientes;
	}



	public ChocomizeManager() {
		super();
		this.tiposDeChocolate = crearChocolates();
		this.tiposDeIngredientes = crearIngredientes();
		
	}



	private List<Ingrediente> crearIngredientes() {
		List<Ingrediente> listaDeIngredientes = new LinkedList<Ingrediente>();
		listaDeIngredientes.add(new FrutoSeco(1, "Nueces", 1.0));
		listaDeIngredientes.add(new FrutoSeco(2, "Avellanas", 2.0));
		listaDeIngredientes.add(new Frutas(3, "Moras", 3.0));
		return listaDeIngredientes;
	}



	private List<Chocolate> crearChocolates() {
		List<Chocolate> listaDeChocolates = new LinkedList<Chocolate>();
		listaDeChocolates.add(new Chocolate(1, "Negro", 1.0));
		listaDeChocolates.add(new Chocolate(2, "Con Leche", 1.5));
		listaDeChocolates.add(new Chocolate(3, "Blanco", 2.0));
		return listaDeChocolates;
	}



	public PedidoCliente crearPedido(Cliente c, Chocolate chocolate, int cantidad, List<IngredientePedido> ingredientes){
		TabletaChocolate barChocolate = new TabletaChocolate(chocolate, cantidad, ingredientes);
		return new PedidoCliente(c,new Pedido(cantidad,barChocolate));
	}



	public List<Chocolate> getTiposDeChocolate() {
		return tiposDeChocolate;
	}



	public void setTiposDeChocolate(List<Chocolate> tiposDeChocolate) {
		this.tiposDeChocolate = tiposDeChocolate;
	}



	public List<Ingrediente> getTiposDeIngredientes() {
		return tiposDeIngredientes;
	}



	public void setTiposDeIngredientes(List<Ingrediente> tiposDeIngredientes) {
		this.tiposDeIngredientes = tiposDeIngredientes;
	}




	
	
}
