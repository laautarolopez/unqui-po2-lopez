package ar.edu.unq.po2.tp9.Observer.Publicaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PublicacionesTest {
	private SistemaDeReferencias sistema;
	private Articulo articulo;
	private Investigador investigador;
	
	@BeforeEach
	public void setUp() {
		sistema = new SistemaDeReferencias();
		articulo = new Articulo("Titulo", Arrays.asList("Autor"),
								"Filiacion", "Tipo", "Lugar Publicado",
								Arrays.asList("Palabras Clave"));
		investigador = new Investigador(articulo);
	}

	@Test
	public void notificadorTest() {
		assertEquals(1, articulo.countObservers());
		
		sistema.cargarArticulo(articulo);
		sistema.contiene(articulo);
	}
	
	@Test
	public void investigadorTest() {
		investigador.update("Hola");
		// Se espera que haga su comportamiento.
	}
}