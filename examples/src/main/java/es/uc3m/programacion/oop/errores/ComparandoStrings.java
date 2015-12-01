package es.uc3m.programacion.oop.errores;

public class ComparandoStrings {

	public static void main(String []args){
		String a = new String("a");
		String b = new String("a");
		String c = a;
		if(a==b){
			System.out.println("a=b");
		}
		if(b==c){
			System.out.println("b=c");
		}
		if(a==c){
			System.out.println("a=c");
		}
	}
}
