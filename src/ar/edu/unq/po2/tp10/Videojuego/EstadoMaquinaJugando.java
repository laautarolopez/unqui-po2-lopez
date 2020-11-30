package ar.edu.unq.po2.tp10.Videojuego;

public class EstadoMaquinaJugando extends EstadoMaquina {

	@Override
	public void ingresarFicha(Maquina maquina) {}

	@Override
	public void presionarBoton(Maquina maquina) {
		maquina.setEstado(new EstadoMaquinaInicial());
	}
}