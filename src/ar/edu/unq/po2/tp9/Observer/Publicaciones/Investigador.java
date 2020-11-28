package ar.edu.unq.po2.tp9.Observer.Publicaciones;

import ar.edu.unq.po2.tp9.Observer.Observer;

public class Investigador implements Observer {
	private Articulo articulo;
	
	public Investigador(Articulo articulo) {
		this.articulo = articulo;
		articulo.addObserver(this);
	}
	
	@Override
	public void update(Object param) {
		System.out.println("Ingreso una nueva publicacion de: " + this.articulo.getTitulo());
	}
}