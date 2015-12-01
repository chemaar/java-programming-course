package es.uc3m.programacion.oop.ejemplos.chocomize;

public class FrutoSeco extends Ingrediente{
	int nivelSalado = 0;

	public FrutoSeco() {
		super();
		this.nivelSalado = 1;
	}

	public FrutoSeco(int id, String descripcion, double costeUnitario) {
		super(id, descripcion, costeUnitario);
		this.nivelSalado = 1;
	}

}
