package es.uc3m.programacion.oop.ejemplos.equipo;

public class EquipoMain {

	public static void main(String []args){
		Equipo lakers = new Equipo("Lakers");
		for(int i = 0; i<10;i++){
			Persona person = new Persona(i+18,"Name "+i);
			Jugador player = new Jugador(i,person);
			lakers.getJugadores().add(player);
		}
		System.out.println(lakers);
	}
}
