package ar.edu.unq.po2.tp9.Observer.Preguntas;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unq.po2.tp9.Observer.Observable;

public class Juego extends Observable {
	private Map<Jugador, Integer> jugadores = new HashMap<Jugador, Integer>();
	private Map<String, String> preguntas;
	private boolean estado;
	
	public Juego(Map<String, String> preguntas) {
		this.preguntas = preguntas;
	}
	
	public void agregarJugador(Jugador jugador) {
		this.jugadores.put(jugador, 0);
	}
	
	public void empezarJuego() {
		if(this.jugadores.size() == 5) {
			this.estado = true;
			this.notifyObservers(this.preguntas.keySet());
		} else {
			System.out.println("Hay " + this.jugadores.size() + " jugadores. Deben ser 5.");
		}
	}
	
	public void terminarJuego() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void recibirRespuesta(Jugador jugador, String pregunta, String respuesta) {
		if(this.esRespuestaCorrecta(pregunta,  respuesta)) {
			this.contabilizarRespuestaJugador(jugador);
			jugador.update("La pregunta: " + pregunta + " fue contestada correctamente.");
			this.notifyObservers("El jugador " + jugador.getNombre() +
								 " respondió correcto a la pregunta " + pregunta);
			this.validarSiEsGanador(jugador);
		} else {
			jugador.update("La respuesta no fue correcta.");
		}
	}
	
	private boolean esRespuestaCorrecta(String pregunta, String respuesta) {
		return this.preguntas.get(pregunta).equals(respuesta);
	}
	
	private void contabilizarRespuestaJugador(Jugador jugador) {
		this.jugadores.put(jugador, this.jugadores.get(jugador) + 1);
	}

	private void validarSiEsGanador(Jugador jugador) {
		if(this.jugadores.get(jugador) == 5) {
			this.notifyObservers("El ganador del juego es: " + jugador.getNombre());
			this.terminarJuego();
		}
	}
}