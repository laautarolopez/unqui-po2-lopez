package ar.edu.unq.po2.tp10.Encriptacion;

public class FormaVocal implements FormaEncriptador {
	
	@Override
	public String encriptar(String texto) {
		String resultado = "";
		for(int i = 0; i <= texto.length()-1; i++) {
			resultado += this.agregarLetra(texto.charAt(i));
		}
		return resultado;
	}
	
	private char agregarLetra(char letra) {
		if(this.esVocal(letra)) {
			return this.cambiarVocal(letra);
		} else { 
			return letra;
		}
	}

	private boolean esVocal(char letra) {
		switch (letra) {
			case 'a':
        	case 'e':
        	case 'i':
        	case 'o':
        	case 'u':
        	case 'A':
        	case 'E':
        	case 'I':
        	case 'O':
        	case 'U':
        		return true;
        	default: return false;
		}
	}
	
	private char cambiarVocal(char letra) {
		switch (letra) {
			case 'a': return 'e';
	    	case 'e': return 'i';
	    	case 'i': return 'o';
	    	case 'o': return 'u';
	    	case 'u': return 'a';
	    	case 'A': return 'E';
	    	case 'E': return 'I';
	    	case 'I': return 'O';
	    	case 'O': return 'U';
	    	case 'U': return 'A';
	    	default: return letra;
		}
	}

	@Override
	public String desencriptar(String texto) {
		String resultado = "";
		for(int i = 0; i <= texto.length()-1; i++) {
			resultado += this.agregarLetra2(texto.charAt(i));
		}
		return resultado;
	}
	
	private char agregarLetra2(char letra) {
		if(this.esVocal(letra)) {
			return this.cambiarVocalReversa(letra);
		} else { 
			return letra;
		}
	}

	private char cambiarVocalReversa(char letra) {
		switch (letra) {
			case 'a': return 'u';
	    	case 'e': return 'a';
	    	case 'i': return 'e';
	    	case 'o': return 'i';
	    	case 'u': return 'o';
	    	case 'A': return 'U';
	    	case 'E': return 'A';
	    	case 'I': return 'E';
	    	case 'O': return 'I';
	    	case 'U': return 'O';
	    	default: return letra;
		}
	}
}