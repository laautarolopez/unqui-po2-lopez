package ar.edu.unq.po2.tp9.Observer.Publicaciones;

import ar.edu.unq.po2.tp9.Observer.Observable;
import ar.edu.unq.po2.tp9.Observer.Observer;

public class Investigador implements Observer {
	private String nombre;
	private Observable articulo;
	
	public Investigador(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Observable getArticulo() {
		return this.articulo;
	}
	
	@Override
	public void update(Object param) {
		System.out.println("Ingreso una nueva publicacion de: " + param);
	}
	
	public void suscribirse(Articulo articulo) {
		this.articulo = articulo;
		articulo.addObserver(this);
	}
}