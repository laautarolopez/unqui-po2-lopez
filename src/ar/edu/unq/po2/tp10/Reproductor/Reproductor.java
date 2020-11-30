package ar.edu.unq.po2.tp10.Reproductor;

public class Reproductor {
	private EstadoReproductor estado;
	private Song cancion;
	
	public Reproductor() {
		this.estado = new EstadoSeleccion(this);
	}
	
	public EstadoReproductor getEstado() {
		return this.estado;
	}
	
	public void setEstado(EstadoReproductor estado) {
		this.estado = estado;
	}
	
	public void setCancion(Song cancion) {
		this.cancion = cancion;
	}
	
	public Song getCancion() {
		return this.cancion;
	}
	
	public void play() throws Exception {
		this.estado.play();
	}
	
	public void pause() throws Exception {
		this.estado.pause();
	}

	public void stop() {
		this.estado.stop();
	}
}