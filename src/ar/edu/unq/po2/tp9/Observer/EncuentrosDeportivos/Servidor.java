package ar.edu.unq.po2.tp9.Observer.EncuentrosDeportivos;

import ar.edu.unq.po2.tp9.Observer.Observer;

public class Servidor implements Observer {
	private AplicacionDeportes aplicacion;
	
	public Servidor(AplicacionDeportes aplicacion) {
		this.aplicacion = aplicacion;
		this.aplicacion.addObserver(this);
	}
	
	public void agregarDeporte(Deporte deporte) {
		deporte.addObserver(this);
	}
	
	public void eliminarDeporte(Deporte deporte) {
		deporte.deleteObserver(this);
	}
	
	public void agregarContrincante(Contrincante contrincante) {
		contrincante.addObserver(this);
	}
	
	public void eliminarContrincante(Contrincante contrincante) {
		contrincante.deleteObserver(this);
	}
	
	@Override
	public void update(Object param) {
		if(param instanceof Partido) {
			Partido partido = (Partido) param;
			System.out.printf("Nuevo partido de %s%n" + "Se enfrentó %s vs %s %n" +
							   "El resultado fue: %s%n",
							   	partido.getDeporte().getNombre(),
							   	partido.getContrincantes().get(0).getNombre(),
							   	partido.getContrincantes().get(1).getNombre(),
							   	partido.getResultado());
		}
	}
}