package ar.edu.unq.po2.tp10.Videojuego;

public class EstadoMaquinaInicial extends EstadoMaquina {
	
	@Override
	public void ingresarFicha(Maquina maquina) {
		maquina.setEstado(new EstadoMaquina1Jugador());
	}
	
	@Override
	public void presionarBoton(Maquina maquina) {
		System.out.println("Ingrese fichas.");
	}
}