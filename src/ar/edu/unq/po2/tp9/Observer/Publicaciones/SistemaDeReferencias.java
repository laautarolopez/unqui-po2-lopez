package ar.edu.unq.po2.tp9.Observer.Publicaciones;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeReferencias {
	private List<Articulo> articulos = new ArrayList<Articulo>();
	
	@SuppressWarnings("deprecation")
	public void cargarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		articulo.notifyObservers();
	}
	
	@SuppressWarnings("deprecation")
	public void suscibirse(Articulo articulo, Investigador investigador) {
		articulo.addObserver(investigador);
	}
	
	@SuppressWarnings("deprecation")
	public void desuscribirse(Articulo articulo, Investigador investigador) {
		articulo.deleteObserver(investigador);
	}
}