package es.uc3m.programacion.oop.ejemplos.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void testAnyadirLibro() {
		Biblioteca bibliotecaSimple = new Biblioteca();
		assertEquals(0, bibliotecaSimple.getLibros().size());
		Libro libro = new Libro(String.valueOf(1), "T�tulo "+String.valueOf(1));
		bibliotecaSimple.anyadirLibro(libro);
		assertEquals(1, bibliotecaSimple.getLibros().size());
		assertEquals(libro, bibliotecaSimple.getLibro("1"));
	}

	@Test
	public void testGetLibro() {
		Biblioteca bibliotecaSimple = new Biblioteca();
		Libro libro = new Libro(String.valueOf(1), "T�tulo "+String.valueOf(1));
		bibliotecaSimple.anyadirLibro(libro);
		assertEquals(libro, bibliotecaSimple.getLibro("1"));
	}

	@Test
	public void testPrestarLibro() {
		Biblioteca bibliotecaSimple = new Biblioteca();
		assertEquals(0, bibliotecaSimple.getPrestamos().size());
		Libro libro = new Libro(String.valueOf(1), "T�tulo "+String.valueOf(1));
		bibliotecaSimple.anyadirLibro(libro);
		bibliotecaSimple.prestarLibro("1");
		assertEquals(1, bibliotecaSimple.getPrestamos().size());
	}

	@Test
	public void testReturnBook() {
		Biblioteca bibliotecaSimple = new Biblioteca();
		assertEquals(0, bibliotecaSimple.getPrestamos().size());
		Libro libro = new Libro(String.valueOf(1), "T�tulo "+String.valueOf(1));
		bibliotecaSimple.anyadirLibro(libro);
		bibliotecaSimple.prestarLibro("1");
		assertEquals(1, bibliotecaSimple.getPrestamos().size());
		bibliotecaSimple.devolverLibro("1");
		assertEquals(0, bibliotecaSimple.getPrestamos().size());
	}

	@Test
	public void testIsLoan() {
		Biblioteca bibliotecaSimple = new Biblioteca();
		assertEquals(0, bibliotecaSimple.getPrestamos().size());
		Libro libro = new Libro(String.valueOf(1), "T�tulo "+String.valueOf(1));
		bibliotecaSimple.anyadirLibro(libro);
		bibliotecaSimple.prestarLibro("1");
		assertTrue(bibliotecaSimple.estaPrestado("1"));
	}

}
