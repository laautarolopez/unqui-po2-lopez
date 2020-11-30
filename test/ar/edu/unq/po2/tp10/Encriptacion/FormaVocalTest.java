package ar.edu.unq.po2.tp10.Encriptacion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FormaVocalTest {
	private EncriptadorNaive encriptador;
	private FormaVocal forma;
		
	@BeforeEach
	public void setUp() {
		forma = new FormaVocal();
		encriptador = new EncriptadorNaive(forma);
	}

	@Test
	public void encriptadorTest() {
		String texto = "Hola mundo";
		String resultado = encriptador.encriptar(texto);
		assertEquals("Hule mandu", resultado);
	}
	
	@Test
	public void desencriptadorTest() {
		String texto = "Hule mandu";
		String resultado = encriptador.desencriptar(texto);
		assertEquals("Hola mundo", resultado);
	}
	
	@Test
	public void mockitoTest() {
		FormaVocal forma2 = mock(FormaVocal.class);
		encriptador.setForma(forma2);
		
		String texto1 = "Hola mundo";
		when(forma2.encriptar(texto1)).thenReturn("Hule mandu");
		String resultado1 = encriptador.encriptar(texto1);
		assertEquals("Hule mandu", resultado1);
		verify(forma2).encriptar(texto1);
		
		String texto2 = "Hule mandu";
		when(forma2.desencriptar(texto2)).thenReturn("Hola mundo");
		String resultado2 = encriptador.desencriptar(texto2);
		assertEquals("Hola mundo", resultado2);
		verify(forma2).desencriptar(texto2);
	}
}