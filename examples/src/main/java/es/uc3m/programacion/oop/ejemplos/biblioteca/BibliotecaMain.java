package es.uc3m.programacion.oop.ejemplos.biblioteca;

public class BibliotecaMain {

	public static void main(String []args){
		Biblioteca bibliotecaSimple = new Biblioteca();
		for(int i = 0; i<10;i++){
			Libro libro = new Libro(String.valueOf(i), "T�tulo "+String.valueOf(i));
			bibliotecaSimple.anyadirLibro(libro);
		}
		System.out.println(bibliotecaSimple.getLibro("0"));
		bibliotecaSimple.prestarLibro("0");
		System.out.println(bibliotecaSimple.estaPrestado("0"));
		bibliotecaSimple.devolverLibro("0");
		System.out.println(bibliotecaSimple.estaPrestado("0"));
	}
}
