package ar.edu.unq.po2.tp10.Encriptacion;

public class FormaNormal implements FormaEncriptador{
	
	@Override
	public String encriptar(String texto) {
		String[] cads = texto.split(" ");
		String resultado = "";
		for(int i = cads.length-1 ; i >= 0; i--) {
			resultado += cads[i] + " ";
		}
		return resultado.substring(0, resultado.length()-1); // saca el último espacio.
	}
	
	@Override
	public String desencriptar(String texto) {
		return this.encriptar(texto);
	}
}