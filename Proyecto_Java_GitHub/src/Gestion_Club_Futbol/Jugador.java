package Gestion_Club_Futbol;

//Esta es la clase Jugador que tiene los datos de los 11 jugadores titulares del equipo que en la clase club utilizaremos.

	public class Jugador {

//Aqui creamos los atributos que tendran los jugadores.
	
	private String nombre;
	private int numeroCamiseta;
	private String posicion;
	
//Despues con varios constructores creamos a los jugadores asignandoles los atributos.
	
	public Jugador(String string, int i, String string2) {
		
	}

	public void Jugador1() {
		
		this.nombre = "Tribaut Courtois";
		this.numeroCamiseta = 1;
		this.posicion = "Portero";
		
	}
	
	public void Jugador2() {
		
		this.nombre = "Daniel Carvajal";
		this.numeroCamiseta = 2;
		this.posicion = "Defensa";
		
	}
	
	public void Jugador3() {
		
		this.nombre = "Eder Militao";
		this.numeroCamiseta = 3;
		this.posicion = "Defensa";
		
	}
	
	public void Jugador4() {
		
		this.nombre = "Antonio Rudiger";
		this.numeroCamiseta = 22;
		this.posicion = "Defensa";
		
	}
	
	public void Jugador5() {
		
		this.nombre = "David Alaba";
		this.numeroCamiseta = 4;
		this.posicion = "Defensa";
		
	}
	
	public void Jugador6() {
		
		this.nombre = "Eduardo Camavinga";
		this.numeroCamiseta = 12;
		this.posicion = "Centrocampista";
		
	}
	
	public void Jugador7() {
		
		this.nombre = "Toni Kroos";
		this.numeroCamiseta = 8;
		this.posicion = "Centrocampista";
		
	}
	
	public void Jugador8() {
		
		this.nombre = "Luka Modric";
		this.numeroCamiseta = 10;
		this.posicion = "Centrocampista";
		
	}
	
	public void Jugador9() {
		
		this.nombre = "Jude Bellingham";
		this.numeroCamiseta = 5;
		this.posicion = "Centrocampista";
		
	}
	
	public void Jugador10() {
		
		this.nombre = "Vinicius Junior";
		this.numeroCamiseta = 7;
		this.posicion = "Delantero";
		
	}
	
	public void Jugador11() {
		
		this.nombre = "Rodrygo Goes";
		this.numeroCamiseta = 11;
		this.posicion = "Delantero";
		
	}
	
//Y por ultimo añadiremos los metodos necesarios.
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getNumeroCamiseta() {
		
		return numeroCamiseta;
	}
	
	public void setNumeroCamiseta(int numeroCamiseta) {
		
		this.numeroCamiseta = numeroCamiseta;
	}
	
	public String getPosicion() {
		
		return posicion;
	}
	
	public void setPosicion(String posicion) {
		
		this.posicion = posicion;
	}
	
	
	
	
	
	
	
}
