package ar.edu.unq.po2.tp8;

public interface PokerStatusConJugadas {
	
	public Jugada verificar(Carta carta1, Carta carta2, Carta carta3,
			Carta carta4, Carta carta5);
	
	public Jugada jugadaGanadora(Jugada jugada1, Jugada jugada2);
}