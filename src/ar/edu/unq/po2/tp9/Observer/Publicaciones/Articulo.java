package ar.edu.unq.po2.tp9.Observer.Publicaciones;

import java.util.List;
import ar.edu.unq.po2.tp9.Observer.Observable;

public class Articulo extends Observable {
	private String titulo;
	private List<String> autores;
	private String filiacion;
	private String tipo;
	private String lugarPublicado;
	private List<String> palabrasClave;
	
	public Articulo(String titulo, List<String> autores, String filiacion,
						  String tipo, String lugarPublicado, List<String> palabrasClave) {
		this.titulo = titulo;
		this.autores = autores;
		this.filiacion = filiacion;
		this.tipo = tipo;
		this.lugarPublicado = lugarPublicado;
		this.palabrasClave = palabrasClave;
	}

	public String getTitulo() {
		return titulo;
	}

	public List<String> getAutores() {
		return autores;
	}

	public String getFiliacion() {
		return filiacion;
	}

	public String getTipo() {
		return tipo;
	}

	public String getLugarPublicado() {
		return lugarPublicado;
	}

	public List<String> getPalabrasClave() {
		return palabrasClave;
	}
}