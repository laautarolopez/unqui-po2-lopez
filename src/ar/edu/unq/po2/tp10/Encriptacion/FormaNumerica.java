package ar.edu.unq.po2.tp10.Encriptacion;

public class FormaNumerica implements FormaEncriptador {
	private String abecedario = " abcdefghijklmnñopqrstuvwxyz";
	private String abecedarioMayuscula = " ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	
	@Override
	public String encriptar(String texto) {
		String resultado = "";
		for(int i = 0; i <= texto.length()-1; i++) {
			resultado += this.agregarNumero(texto.charAt(i)) + ",";
		}
		return resultado.substring(0, resultado.length()-1);
	}

	private int agregarNumero(char letra) {
		if(this.abecedario.indexOf(letra) != -1) {
			return this.abecedario.indexOf(letra);
		} else {
			return this.abecedarioMayuscula.indexOf(letra);
		}
	}

	@Override
	public String desencriptar(String texto) {
		String resultado = "";
		String[] cads = texto.split(",");
		for(int i = 0; i <= cads.length-1 ; i++) {
			resultado += this.agregarLetra(cads[i]);
		}
		return resultado;
	}

	private char agregarLetra(String numero) {
		return this.abecedario.charAt(Integer.parseInt(numero));
	}
}