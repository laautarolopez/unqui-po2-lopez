package ar.edu.unq.po2.tp10.Encriptacion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FormaNumericaTest {
	private EncriptadorNaive encriptador;
	private FormaNumerica forma;
		
	@BeforeEach
	public void setUp() {
		forma = new FormaNumerica();
		encriptador = new EncriptadorNaive(forma);
	}

	@Test
	public void encriptadorTest() {
		String texto = "Hola mundo";
		String resultado = encriptador.encriptar(texto);
		assertEquals("8,16,12,1,0,13,22,14,4,16", resultado);
	}
	
	@Test
	public void desencriptadorTest() {
		System.out.println(Character.getNumericValue('0'));
		String texto = "8,16,12,1,0,13,22,14,4,16";
		String resultado = encriptador.desencriptar(texto);
		assertEquals("hola mundo", resultado);
	}
	
	@Test
	public void mockitoTest() {
		FormaNumerica forma2 = mock(FormaNumerica.class);
		encriptador.setForma(forma2);
		
		String texto1 = "Hola mundo";
		when(forma2.encriptar(texto1)).thenReturn("8,16,12,1,0,13,22,14,4,16");
		String resultado1 = encriptador.encriptar(texto1);
		assertEquals("8,16,12,1,0,13,22,14,4,16", resultado1);
		verify(forma2).encriptar(texto1);
		
		String texto2 = "8,16,12,1,0,13,22,14,4,16";
		when(forma2.desencriptar(texto2)).thenReturn("hola mundo");
		String resultado2 = encriptador.desencriptar(texto2);
		assertEquals("hola mundo", resultado2);
		verify(forma2).desencriptar(texto2);
	}
}