package ar.edu.unq.po2.tp9.Observer.EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp9.Observer.Observable;

public class AplicacionDeportes extends Observable {
	private List<Partido> partidos = new ArrayList<Partido>();
	
	public void agregarPartido(Partido partido) {
		partidos.add(partido);
		this.notificar(partido);
	}

	protected void notificar(Partido partido) {
		partido.getDeporte().setChanged();
		partido.getDeporte().notifyObservers(partido);
	}
}