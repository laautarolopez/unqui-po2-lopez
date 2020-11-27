package ar.edu.unq.po2.tp9.Observer.Publicaciones;

import ar.edu.unq.po2.tp9.Observer.Observable;
import ar.edu.unq.po2.tp9.Observer.Observer;

public class Investigador implements Observer {
	private Observable observable;
	
	public Investigador(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public Observable getObservable() {
		return this.observable;
	}
	
	@Override
	public void update(Object param) {
		System.out.println("Ingreso una nueva publicacion de: " + this.observable.toString());
	}
}