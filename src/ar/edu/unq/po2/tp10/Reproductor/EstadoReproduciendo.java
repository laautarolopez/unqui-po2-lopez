package ar.edu.unq.po2.tp10.Reproductor;

public class EstadoReproduciendo extends EstadoReproductor {

	public EstadoReproduciendo(Reproductor reproductor) {
		super(reproductor);
	}
	
	@Override
	public void play() throws Exception {
		throw new Exception("El reproductor no está en modo selección de canciones");
	}
	
	@Override
	public void pause() {
		this.reproductor.getCancion().pause();
		this.reproductor.setEstado(new EstadoPausa(this.reproductor));
	}
	
	@Override
	public void stop() {
		this.reproductor.getCancion().stop();
		this.reproductor.setEstado(new EstadoSeleccion(this.reproductor));
	}
}