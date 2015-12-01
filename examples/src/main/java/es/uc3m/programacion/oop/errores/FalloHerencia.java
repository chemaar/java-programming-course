package es.uc3m.programacion.oop.errores;

/*
 * Problema: intento de asignación de una instancia de una subclase a una superclase.
 * 
 * No es posible asignar referencias de arriba-abajo (genérico-específico).
 * 
 * Solución: cambiar el tipo de la variable que recibe la referencia. Utilizar la clase situada en la parte superior de la jerarquía.
 */
public class FalloHerencia{

	public static void main(String[] args) {
		Gamma g1 = new Alpha();
		Gamma g2 = new Beta();
		System.out.println(g1.getType() + " " 
				+ g2.getType());
	}

}
class Alpha {
	String getType() { 
		return "alpha"; 
	}
}
class Beta extends Alpha {
	String getType() { 
		return "beta"; 
	}
}

class Gamma extends Beta {
	String getType() { 
		return "gamma"; 
	}
}

