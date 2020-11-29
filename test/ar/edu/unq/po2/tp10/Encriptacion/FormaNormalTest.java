package ar.edu.unq.po2.tp10.Encriptacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class FormaNormalTest {
	private EncriptadorNaive encriptador;
	private FormaNormal forma;
		
	@BeforeEach
	public void setUp() {
		forma = new FormaNormal();
		encriptador = new EncriptadorNaive(forma);
	}

	@Test
	public void encriptadorTest() {
		String texto = "Hola mundo";
		String resultado = encriptador.encriptar(texto);
		assertEquals("mundo Hola", resultado);
	}
	
	@Test
	public void desencriptadorTest() {
		String texto = "mundo Hola";
		String resultado = encriptador.desencriptar(texto);
		assertEquals("Hola mundo", resultado);
	}
	
	@Test
	public void mockitoTest() {
		FormaNormal forma2 = mock(FormaNormal.class);
		encriptador.setForma(forma2);
		
		String texto1 = "Hola mundo";
		when(forma2.encriptar(texto1)).thenReturn("mundo Hola");
		String resultado1 = encriptador.encriptar(texto1);
		assertEquals("mundo Hola", resultado1);
		verify(forma2).encriptar(texto1);
		
		String texto2 = "mundo Hola";
		when(forma2.desencriptar(texto2)).thenReturn("Hola mundo");
		String resultado2 = encriptador.desencriptar(texto2);
		assertEquals("Hola mundo", resultado2);
		verify(forma2).desencriptar(texto2);
	}
}