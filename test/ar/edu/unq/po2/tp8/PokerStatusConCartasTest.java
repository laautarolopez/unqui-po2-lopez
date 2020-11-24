package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class PokerStatusConCartasTest {
	private PokerStatusConCartas poker; 
	
	@BeforeEach
	public void setUp() {
		poker = mock(PokerStatusConCartas.class);
	}

	@Test
	public void poquerTest() {
		Carta carta1 = new Carta("1", "Pica");
		Carta carta2 = new Carta("J", "Diamantes");
		Carta carta3 = new Carta("1", "Diamantes");
		Carta carta4 = new Carta("1", "Corazones");
		Carta carta5 = new Carta("1", "Treboles");
		when(poker.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn("Poquer");
		assertEquals("Poquer", poker.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void colorTest() {
		Carta carta1 = new Carta("1", "Corazones");
		Carta carta2 = new Carta("J", "Corazones");
		Carta carta3 = new Carta("K", "Corazones");
		Carta carta4 = new Carta("4", "Corazones");
		Carta carta5 = new Carta("7", "Corazones");
		when(poker.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn("Color");
		assertEquals("Color", poker.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void trioTest() {
		Carta carta1 = new Carta("1", "Corazones");
		Carta carta2 = new Carta("4", "Corazones");
		Carta carta3 = new Carta("K", "Pica");
		Carta carta4 = new Carta("4", "Pica");
		Carta carta5 = new Carta("4", "Treboles");
		when(poker.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn("Color");
		assertEquals("Color", poker.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void nadaTest() {
		Carta carta1 = new Carta("3", "Pica");
		Carta carta2 = new Carta("J", "Diamantes");
		Carta carta3 = new Carta("4", "Diamantes");
		Carta carta4 = new Carta("1", "Corazones");
		Carta carta5 = new Carta("K", "Corazones");
		when(poker.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn("");
		assertTrue(poker.verificar(carta1, carta2, carta3, carta4, carta5).isEmpty());
	}
}