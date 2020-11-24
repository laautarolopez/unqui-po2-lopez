package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PokerStatusContinuacionTest {
	private PokerStatusContinuacion poker;
	
	@BeforeEach
	public void setUp() {
		poker = mock(PokerStatusContinuacion.class);
	}

	@Test
	public void poquerTest() {
		String carta1 = "1P";
		String carta2 = "JD";
		String carta3 = "1D";
		String carta4 = "1C";
		String carta5 = "1T";
		when(poker.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn("Poquer");
		assertEquals("Poquer", poker.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void colorTest() {
		String carta1 = "1C";
		String carta2 = "JC";
		String carta3 = "KC";
		String carta4 = "4C";
		String carta5 = "7C";
		when(poker.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn("Color");
		assertEquals("Color", poker.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void trioTest() {
		String carta1 = "1C";
		String carta2 = "4C";
		String carta3 = "KP";
		String carta4 = "4P";
		String carta5 = "4T";
		when(poker.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn("Color");
		assertEquals("Color", poker.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void nadaTest() {
		String carta1 = "3P";
		String carta2 = "JD";
		String carta3 = "4D";
		String carta4 = "1C";
		String carta5 = "KC";
		when(poker.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn("");
		assertTrue(poker.verificar(carta1, carta2, carta3, carta4, carta5).isEmpty());
	}
}