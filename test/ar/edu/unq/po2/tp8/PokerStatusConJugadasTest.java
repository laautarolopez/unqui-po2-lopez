package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class PokerStatusConJugadasTest {
	private PokerStatusConJugadas poker;
	
	@BeforeEach
	public void setUp() {
		poker = mock(PokerStatusConJugadas.class);
	}

	@Test
	public void poquerEmpatadosGanaJugada1() {
		Carta carta1p1 = new Carta("1", "Pica");
		Carta carta2p1 = new Carta("J", "Diamantes");
		Carta carta3p1 = new Carta("1", "Diamantes");
		Carta carta4p1 = new Carta("1", "Corazones");
		Carta carta5p1 = new Carta("1", "Treboles");
		Jugada jugada1 = poker.verificar(carta1p1, carta2p1, carta3p1, carta4p1, carta5p1);
		
		Carta carta1p2 = new Carta("3", "Pica");
		Carta carta2p2 = new Carta("2", "Diamantes");
		Carta carta3p2 = new Carta("3", "Diamantes");
		Carta carta4p2 = new Carta("3", "Corazones");
		Carta carta5p2 = new Carta("3", "Treboles");
		Jugada jugada2 = poker.verificar(carta1p2, carta2p2, carta3p2, carta4p2, carta5p2);
		
		when(poker.jugadaGanadora(jugada1, jugada2)).thenReturn(jugada1);
		
		assertEquals(jugada1, poker.jugadaGanadora(jugada1, jugada2));
	}
	
	@Test
	public void colorGanaATrio() {
		Carta carta1p1 = new Carta("1", "Pica");
		Carta carta2p1 = new Carta("J", "Diamantes");
		Carta carta3p1 = new Carta("2", "Diamantes");
		Carta carta4p1 = new Carta("1", "Corazones");
		Carta carta5p1 = new Carta("1", "Treboles");
		Jugada jugada1 = poker.verificar(carta1p1, carta2p1, carta3p1, carta4p1, carta5p1);
		
		Carta carta1p2 = new Carta("5", "Corazones");
		Carta carta2p2 = new Carta("K", "Corazones");
		Carta carta3p2 = new Carta("7", "Corazones");
		Carta carta4p2 = new Carta("J", "Corazones");
		Carta carta5p2 = new Carta("4", "Corazones");
		Jugada jugada2 = poker.verificar(carta1p2, carta2p2, carta3p2, carta4p2, carta5p2);
		
		when(poker.jugadaGanadora(jugada1, jugada2)).thenReturn(jugada2);
		
		assertEquals(jugada2, poker.jugadaGanadora(jugada1, jugada2));
	}
	
	@Test
	public void poquerGanaATrio() {
		Carta carta1p1 = new Carta("1", "Pica");
		Carta carta2p1 = new Carta("J", "Diamantes");
		Carta carta3p1 = new Carta("1", "Diamantes");
		Carta carta4p1 = new Carta("1", "Corazones");
		Carta carta5p1 = new Carta("1", "Treboles");
		Jugada jugada1 = poker.verificar(carta1p1, carta2p1, carta3p1, carta4p1, carta5p1);
		
		Carta carta1p2 = new Carta("3", "Pica");
		Carta carta2p2 = new Carta("J", "Pica");
		Carta carta3p2 = new Carta("3", "Diamantes");
		Carta carta4p2 = new Carta("3", "Corazones");
		Carta carta5p2 = new Carta("2", "Treboles");
		Jugada jugada2 = poker.verificar(carta1p2, carta2p2, carta3p2, carta4p2, carta5p2);
		
		when(poker.jugadaGanadora(jugada1, jugada2)).thenReturn(jugada1);
		
		assertEquals(jugada1, poker.jugadaGanadora(jugada1, jugada2));
	}
}