package ar.edu.unq.po2.tp9.Observer.Preguntas;

import java.util.Scanner;
import java.util.Set;

import ar.edu.unq.po2.tp9.Observer.Observer;

public class Jugador implements Observer {
	private Juego juego;
	private String nombre;
	
	public Jugador(String nombre, Juego juego) {
		this.nombre = nombre;
		this.juego = juego;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void update(Object param) {
		if(param instanceof Set) {
			// Entrada desde teclado
			Scanner entrada = new Scanner(System.in);
			
			@SuppressWarnings("unchecked")
			Set<String> set = (Set<String>) param;
			
			// Numero de pregunta
			for(String s : set) {
				if(this.juego.getEstado()) {
					System.out.println(this.nombre + "- Pregunta: " + s);
					String respuesta = entrada.nextLine();
					this.enviarRespuesta(s, respuesta);
				}
			}
			entrada.close();
		}
		if(param instanceof String) {
			String texto = (String) param;
			System.out.println(texto);
		}
	}

	private void enviarRespuesta(String pregunta, String respuesta) {
		this.juego.recibirRespuesta(this, pregunta, respuesta);
	}
}