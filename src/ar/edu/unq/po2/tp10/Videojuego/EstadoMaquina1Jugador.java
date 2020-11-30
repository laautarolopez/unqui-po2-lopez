package ar.edu.unq.po2.tp10.Videojuego;

public class EstadoMaquina1Jugador extends EstadoMaquina {
	
	@Override
	public void ingresarFicha(Maquina maquina) {
		maquina.setEstado(new EstadoMaquina2Jugadores());
	}
	
	@Override
	public void presionarBoton(Maquina maquina) {
		maquina.setEstado(new EstadoMaquinaJugando());
	}
}