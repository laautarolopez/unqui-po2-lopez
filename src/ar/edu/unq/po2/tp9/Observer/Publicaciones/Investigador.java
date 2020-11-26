package ar.edu.unq.po2.tp9.Observer.Publicaciones;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Investigador implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Ingreso una nueva publicacion");
	}

}