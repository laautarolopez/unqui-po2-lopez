package ar.edu.unq.po2.tp10.Encriptacion;

public class EncriptadorNaive {
	private FormaEncriptador forma;
	
	public EncriptadorNaive(FormaEncriptador forma) {
		this.forma = forma;
	}
	
	public String encriptar(String texto) {
		return this.forma.encriptar(texto);
	}
	
	public String desencriptar(String texto) {
		return this.forma.desencriptar(texto);
	}
	
	public void setForma(FormaEncriptador forma) {
		this.forma = forma;
	}
}