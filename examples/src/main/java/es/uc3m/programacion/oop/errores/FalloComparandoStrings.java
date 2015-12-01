package es.uc3m.programacion.oop.errores;

public class FalloComparandoStrings {

	public static void main(String []args){
		String a = new String("a");
		String b = new String("a");
		String c = a;
		if(a.equals(b)){
			System.out.println("a=b");
		}
		if(b.equals(c)){
			System.out.println("b=c");
		}
		if(a.equals(c)){
			System.out.println("a=c");
		}
	}
}
