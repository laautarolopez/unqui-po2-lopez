package ar.edu.unq.po2.tp10.Reproductor;

public class EstadoSeleccion extends EstadoReproductor {
	
	public EstadoSeleccion(Reproductor reproductor) {
		super(reproductor);
	}
	
	@Override
	public void play() {
		this.reproductor.getCancion().play();
		this.reproductor.setEstado(new EstadoReproduciendo(this.reproductor));
	}
	
	@Override
	public void pause() throws Exception {
		throw new Exception("El reproductor no está en pausa ni reproduciendo.");
	}
	
	@Override
	public void stop() {}
}