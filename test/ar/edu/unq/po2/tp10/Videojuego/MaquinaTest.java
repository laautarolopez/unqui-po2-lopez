package ar.edu.unq.po2.tp10.Videojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaquinaTest {
	private Maquina maquina;
		
	@BeforeEach
	public void setUp() {
		maquina = new Maquina();
	}

	@Test
	public void getYSetEstadoTest() {
		maquina.setEstado(new EstadoMaquina1Jugador());
		assertTrue(maquina.getEstado() instanceof EstadoMaquina1Jugador);
	}
	
	@Test
	public void ingresarFichaTest() {
		maquina.ingresarFicha();
		assertTrue(maquina.getEstado() instanceof EstadoMaquina1Jugador);
	}
	
	@Test
	public void ingresarFichaEstado1JugadorTest() {
		maquina.setEstado(new EstadoMaquina1Jugador());
		maquina.ingresarFicha();
		assertTrue(maquina.getEstado() instanceof EstadoMaquina2Jugadores);
	}
	
	@Test
	public void ingresarFichaEstado2JugadoresTest() {
		maquina.setEstado(new EstadoMaquina2Jugadores());
		maquina.ingresarFicha();
		assertTrue(maquina.getEstado() instanceof EstadoMaquina2Jugadores);
	}
	
	@Test
	public void ingresarFichaEstadoJugandoTest() {
		maquina.setEstado(new EstadoMaquinaJugando());
		maquina.ingresarFicha();
		assertTrue(maquina.getEstado() instanceof EstadoMaquinaJugando);
	}
	
	@Test
	public void presionarBotonTest() {
		maquina.presionarBoton();
		assertTrue(maquina.getEstado() instanceof EstadoMaquinaInicial);
	}
	
	@Test
	public void presionarBotonEstado1JugadorTest() {
		maquina.setEstado(new EstadoMaquina1Jugador());
		maquina.presionarBoton();
		assertTrue(maquina.getEstado() instanceof EstadoMaquinaJugando);
	}
	
	@Test
	public void presionarBotonEstado2JugadoresTest() {
		maquina.setEstado(new EstadoMaquina2Jugadores());
		maquina.presionarBoton();
		assertTrue(maquina.getEstado() instanceof EstadoMaquinaJugando);
	}
	
	@Test
	public void presionarBotonEstadoJugandoTest() {
		maquina.setEstado(new EstadoMaquinaJugando());
		maquina.presionarBoton();
		assertTrue(maquina.getEstado() instanceof EstadoMaquinaInicial);
	}
}