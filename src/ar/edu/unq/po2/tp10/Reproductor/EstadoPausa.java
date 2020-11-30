package ar.edu.unq.po2.tp10.Reproductor;

public class EstadoPausa extends EstadoReproductor {
	
	public EstadoPausa(Reproductor reproductor) {
		super(reproductor);
	}
	
	@Override
	public void play() throws Exception {
		throw new Exception("El reproductor no está en modo selección de canciones");
	}
	
	@Override
	public void pause() {
		this.reproductor.getCancion().play();
		this.reproductor.setEstado(new EstadoReproduciendo(this.reproductor));
	}
	
	@Override
	public void stop() {
		this.reproductor.getCancion().stop();
		this.reproductor.setEstado(new EstadoSeleccion(this.reproductor));
	}
}