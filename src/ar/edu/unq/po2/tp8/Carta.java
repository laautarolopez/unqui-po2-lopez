package ar.edu.unq.po2.tp8;

public class Carta {
	private String valor;
	private String palo;
	
	public Carta(String valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public String getValor() {
		return this.valor;
	}
	
	public String getPalo() {
		return this.palo;
	}
}