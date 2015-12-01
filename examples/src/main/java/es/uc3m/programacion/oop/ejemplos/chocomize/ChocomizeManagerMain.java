package es.uc3m.programacion.oop.ejemplos.chocomize;
import java.util.LinkedList;
import java.util.List;




public class ChocomizeManagerMain {

	public static void main(String []args){
		Cliente c = new Cliente(1,"Juan");
		ChocomizeManager manager = new ChocomizeManager();
		//A�adimos un chocolate
		Chocolate chocolate = manager.getTiposDeChocolate().get(0);
		int cantidad = 100;
		//A�adimos alg�n ingrediente
		List<IngredientePedido> ingredientePedido = new LinkedList<IngredientePedido>();
		for(Ingrediente ingrediente:manager.getTiposDeIngredientes()){
			ingredientePedido.add(new IngredientePedido(ingrediente, 2));
		}
	
		//Hacemos el pedido del cliente
		PedidoCliente clientePedido = manager.crearPedido(c, chocolate , cantidad , ingredientePedido );
	
		System.out.println("El cliente "+clientePedido.getCliente()+" ha pedido...");
		System.out.println(clientePedido.getPedido());
		System.out.println("Precio = "+clientePedido.getPedido().calcularPrecio());
	}
}
