package ar.edu.unq.po2.tp9.Observer.EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AplicacionDeportesContrincantesTest {
	private AplicacionDeportesContrincantes aplicacion;
	private Partido partido;
	private Deporte deporte;
	private Contrincante contrincante1;
	private Contrincante contrincante2;
	private Servidor servidor;
	
	@BeforeEach
	public void setUp() {
		aplicacion = new AplicacionDeportesContrincantes();
		servidor = new Servidor(aplicacion);
		deporte = new Deporte("Futbol");
		contrincante1 = new Contrincante("Boca Juniors");
		contrincante2 = new Contrincante("River Plate");
		partido = new Partido("2-0", Arrays.asList(contrincante1, contrincante2), deporte);
	}

	@Test
	public void noSuscriptoTest() {
		aplicacion.agregarPartido(partido);
		assertEquals(0, deporte.countObservers());
		assertEquals(0, contrincante1.countObservers());
		assertEquals(0, contrincante2.countObservers());
	}
	
	@Test
	public void suscriptoTest() {
		servidor.agregarContrincante(contrincante1);
		assertEquals(1, contrincante1.countObservers());
		aplicacion.agregarPartido(partido);
	}
	
	@Test
	public void mockitoTest() {
		Servidor servMock = mock(Servidor.class);
		aplicacion.addObserver(servMock);
		contrincante1.addObserver(servMock);
		aplicacion.agregarPartido(partido);
		
		verify(servMock).update(partido);
	}
}