package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class PokerStatusTest {
	private PokerStatus poker;
	
	@BeforeEach
	public void setUp() {
		poker = mock(PokerStatus.class);
	}
	
	@Test
	public void verificarPoker() {
		String carta1 = "1P";
		String carta2 = "JD";
		String carta3 = "1D";
		String carta4 = "1C";
		String carta5 = "1T";
		when(poker.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn(true);
		assertTrue(poker.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void verificarPokerFalse() {
		String carta1 = "3P";
		String carta2 = "JD";
		String carta3 = "4D";
		String carta4 = "1C";
		String carta5 = "KC";
		when(poker.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn(false);
		assertFalse(poker.verificar(carta1, carta2, carta3, carta4, carta5));
	}
}