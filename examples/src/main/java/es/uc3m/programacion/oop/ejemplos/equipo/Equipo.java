package es.uc3m.programacion.oop.ejemplos.equipo;

import java.util.LinkedList;
import java.util.List;

public class Equipo {

	private List<Jugador> jugadores;
	private String nombre;

	public Equipo(List<Jugador> jugadores, String nombre) {
		super();
		this.jugadores = jugadores;
		this.nombre = nombre;
	}

	public Equipo(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getJugadores() {
		if(this.jugadores==null){
			this.jugadores = new LinkedList<Jugador>();
		}
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((jugadores == null) ? 0 : jugadores.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		if (jugadores == null) {
			if (other.jugadores != null)
				return false;
		} else if (!jugadores.equals(other.jugadores))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Equipo [jugadores=" + jugadores + ", nombre=" + nombre + "]";
	}


	
	
	
	
}
