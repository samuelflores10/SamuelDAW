package Gestion_Club_Futbol;

import java.util.ArrayList;

//En esta clase Club creamos varios datos principales del club.

public class Club {
	
	private static final String RealMadrid = null;
	private String nombre;
	private int añoFundacion;
	private ArrayList<Jugador> jugadores;
	
//Despues crearemos un constructor de Club para que el Club exista.
	
	public Club() {
		
		this.nombre = RealMadrid;
		this.añoFundacion = 1902;
		this.jugadores = new ArrayList<>();
		OnceInicial();
		
	}
	
//Continuamos creando una lista de jugadores simulando que el club tiene a estos jugadores para poder formar el Once Inicial a traves de un ArrayList
	
	private void OnceInicial() {
		
		jugadores.add(new Jugador("Courtois",1,"Portero"));
		jugadores.add(new Jugador("Carvajal",2,"Defensa"));
		jugadores.add(new Jugador("Militao",3,"Defensa"));
		jugadores.add(new Jugador("Rudiger",22,"Defensa"));
		jugadores.add(new Jugador("Alaba",4,"Defensa"));
		jugadores.add(new Jugador("Camavinga",12,"Centrocampista"));
		jugadores.add(new Jugador("Kroos",8,"Centrocampista"));
		jugadores.add(new Jugador("Modric",10,"Centrocampista"));
		jugadores.add(new Jugador("Bellingham",5,"Centrocampista"));
		jugadores.add(new Jugador("Vinicius",7,"Delantero"));
		jugadores.add(new Jugador("Rodrygo",11,"Delantero"));
	}
	
//Y por ultimo añadimos estos metodos.
	
	public ArrayList<Jugador> getJugadores(){
		return jugadores;
	}
	
	public void  setJugadores(ArrayList Jugador){
		
		this.jugadores = jugadores;
	}
	
	
}
