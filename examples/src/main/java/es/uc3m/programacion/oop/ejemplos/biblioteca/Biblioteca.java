package es.uc3m.programacion.oop.ejemplos.biblioteca;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Biblioteca {

	private List<Libro> libros;
	private Set<Libro> prestamos;
	public Biblioteca(){
		this.libros = new LinkedList<Libro>();
		this.prestamos = new HashSet<Libro>();
	}
	
	public void anyadirLibro(Libro libro){
		this.libros.add(libro);
	}
	
	public Libro getLibro(String id){
		boolean encontrado = false;
		Libro libro = null;
		int i = 0;
		while(!encontrado && i<this.libros.size()){
			if(this.libros.get(i).getId().equalsIgnoreCase(id)){
				encontrado = true;
				libro = this.libros.get(i);
			}
			i++;
		}
		return libro;
	}
	
	public void prestarLibro(String id){
		Libro libroAprestar = getLibro(id);
		if(libroAprestar != null){
			this.prestamos.add(libroAprestar);
		}
	}
	public void devolverLibro(String id){
		Libro devuelto = getLibro(id);
		if(devuelto != null && this.prestamos.contains(devuelto)){
			this.prestamos.remove(devuelto);
		}
	}
	
	public boolean estaPrestado(String id){
		Libro libro = getLibro(id);
		return this.prestamos.contains(libro);
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public Set<Libro> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(Set<Libro> prestamos) {
		this.prestamos = prestamos;
	}
	
 }
