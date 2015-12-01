
package es.uc3m.programacion.oop.errores;

public class FalloHerenciaCorregido{
	
	public static void main(String[] args) {
		Alpha1 a1 = new Alpha1();
		Alpha1 a2 = new Beta1();
		Alpha1 a3 = new Gamma1();
		System.out.println(a1.getType() + " " + a2.getType()+" "+ a3.getType());
	}
	
}

class Alpha1 {
	String getType() { 
		return "alpha"; 
		}
}
class Beta1 extends Alpha1 {
	String getType() { 
		return "beta"; 
		}
}

class Gamma1 extends Beta1 {
	String getType() { 
		return "gamma"; 
		}
}
