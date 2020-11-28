package ar.edu.unq.po2.tp9.Observer.EncuentrosDeportivos;

import ar.edu.unq.po2.tp9.Observer.Observable;

public class Deporte extends Observable{
	private String nombre;
	
	public Deporte(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}