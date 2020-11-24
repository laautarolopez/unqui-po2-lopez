package ar.edu.unq.po2.tp8;

public class Jugada {
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	public Jugada(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		this.carta1 = carta1;
		this.carta2 = carta2;
		this.carta3 = carta3;
		this.carta4 = carta4;
		this.carta5 = carta5;
	}

	public Carta getCarta1() {
		return carta1;
	}

	public Carta getCarta2() {
		return carta2;
	}

	public Carta getCarta3() {
		return carta3;
	}

	public Carta getCarta4() {
		return carta4;
	}

	public Carta getCarta5() {
		return carta5;
	}
}