package ar.edu.unq.po2.tp10.Encriptacion;

public class FormaVocal implements FormaEncriptador {
	
	@Override
	public String encriptar(String texto) {
		return texto;
	}
	
	@Override
	public String desencriptar(String texto) {
		return texto;
	}
}