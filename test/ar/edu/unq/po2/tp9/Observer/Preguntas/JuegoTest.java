package ar.edu.unq.po2.tp9.Observer.Preguntas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoTest {
	private Juego juego;
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador jugador3;
	private Jugador jugador4;
	private Jugador jugador5;

	@BeforeEach
	public void setUp() {
		Map<String, String> preguntas = new HashMap<String, String>();
		preguntas.put("¿Cuál es la capital de Paraguay?", "Asuncion");
		preguntas.put("¿Cuántas provincias tiene Argentina?", "23");
		preguntas.put("¿Qué animal es el rey de la selva?", "Tigre");
		preguntas.put("¿Cuánto es: 4 + 4 x 0 + 4?", "8");
		preguntas.put("¿Cuándo es el día de la bandera?", "20 de Junio");
		juego = new Juego(preguntas);
		jugador1 = new Jugador("Lautaro", juego);
		jugador2 = new Jugador("Nicolas", juego);
		jugador3 = new Jugador("Matias", juego);
		jugador4 = new Jugador("Alberto", juego);
		jugador5 = new Jugador("Diego", juego);
	}

	@Test
	public void faltanJugadoresTest() {
		juego.agregarJugador(jugador1);
		juego.agregarJugador(jugador2);
		juego.agregarJugador(jugador3);
		juego.empezarJuego();
	}
	
	@Test
	public void jugarTest() {
		juego.agregarJugador(jugador1);
		juego.agregarJugador(jugador2);
		juego.agregarJugador(jugador3);
		juego.agregarJugador(jugador4);
		juego.agregarJugador(jugador5);
		juego.empezarJuego();
	}
	
	@Test
	public void respuestaCorrectaTest() {
		juego.agregarJugador(jugador1);
		juego.recibirRespuesta(jugador1, "¿Cuál es la capital de Paraguay?", "Asuncion");
	}
	
	@Test
	public void respuestaIncorrectaTest() {
		juego.agregarJugador(jugador2);
		juego.recibirRespuesta(jugador2, "¿Cuál es la capital de Paraguay?", "Paraguay");
	}
	
	public static void main(String[] args) {
		Map<String, String> preguntas2 = new HashMap<String, String>();
		preguntas2.put("¿Cuál es la capital de Paraguay?", "Asuncion");
		preguntas2.put("¿Cuántas provincias tiene Argentina?", "23");
		preguntas2.put("¿Qué animal es el rey de la selva?", "Tigre");
		preguntas2.put("¿Cuánto es: 4 + 4 x 0 + 4?", "8");
		preguntas2.put("¿Cuándo es el día de la bandera?", "20 de Junio");
		Juego juego2 = new Juego(preguntas2);
		
		Jugador jugador1 = new Jugador("Lautaro", juego2);
		Jugador jugador2 = new Jugador("Nicolas", juego2);
		Jugador jugador3 = new Jugador("Matias", juego2);
		Jugador jugador4 = new Jugador("Alberto", juego2);
		Jugador jugador5 = new Jugador("Diego", juego2);
	
		juego2.agregarJugador(jugador1);
		juego2.agregarJugador(jugador2);
		juego2.agregarJugador(jugador3);
		juego2.agregarJugador(jugador4);
		juego2.agregarJugador(jugador5);
		juego2.empezarJuego();
	}
}