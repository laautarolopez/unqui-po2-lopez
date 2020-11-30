package ar.edu.unq.po2.tp10.Videojuego;

public class Maquina {
	private EstadoMaquina estado;
	
	public Maquina() {
		this.estado = new EstadoMaquinaInicial();
	}
	
	public void setEstado(EstadoMaquina estado) {
		this.estado = estado;
	}
	
	public EstadoMaquina getEstado() {
		return this.estado;
	}
	
	public void ingresarFicha() {
		this.estado.ingresarFicha(this);
	}
	
	public void presionarBoton() {
		this.estado.presionarBoton(this);
	}
}