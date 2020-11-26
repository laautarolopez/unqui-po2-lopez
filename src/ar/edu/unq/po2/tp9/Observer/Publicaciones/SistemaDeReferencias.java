package ar.edu.unq.po2.tp9.Observer.Publicaciones;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeReferencias {
	private List<Articulo> articulos = new ArrayList<Articulo>();
	
	public void cargarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		articulo.setChanged();
		articulo.notifyObservers(articulo.getTitulo());
	}
}