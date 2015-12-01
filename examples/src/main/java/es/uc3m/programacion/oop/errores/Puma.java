package es.uc3m.programacion.oop.errores;

class Felino {
	public String type = "f ";
	public Felino() {
		System.out.print("felino ");
	}
}

public class Puma  extends Felino {
	public Puma() {
		System.out.print("puma "); 
	}
	public static void main(String[] args) {
		new Puma().go();
	}
	void go() {
		type = "p ";
		System.out.print(this.type + super.type);
	}
}


