package ar.edu.unq.po2.tp10.Reproductor;

public abstract class EstadoReproductor {
	Reproductor reproductor;
	
	public EstadoReproductor(Reproductor reproductor) {
		this.reproductor = reproductor;
	}
	
	public abstract void play() throws Exception;
	
	public abstract void pause() throws Exception;
	
	public abstract void stop();
}