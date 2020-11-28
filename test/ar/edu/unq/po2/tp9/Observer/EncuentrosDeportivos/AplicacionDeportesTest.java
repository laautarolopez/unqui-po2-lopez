package ar.edu.unq.po2.tp9.Observer.EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class AplicacionDeportesTest {
	private AplicacionDeportes aplicacion;
	private Partido partido;
	private Deporte deporte;
	private Contrincante contrincante1;
	private Contrincante contrincante2;
	private Servidor servidor;
	
	@BeforeEach
	public void setUp() {
		aplicacion = new AplicacionDeportes();
		servidor = new Servidor(aplicacion);
		deporte = new Deporte("Futbol");
		contrincante1 = mock(Contrincante.class);
		when(contrincante1.getNombre()).thenReturn("Boca Juniors");
		contrincante2 = mock(Contrincante.class);
		when(contrincante2.getNombre()).thenReturn("River Plate");
		partido = new Partido("2-0", Arrays.asList(contrincante1, contrincante2), deporte);	  
	}

	@Test
	public void noSuscriptoTest() {
		aplicacion.agregarPartido(partido);
		assertEquals(0, deporte.countObservers());
	}
	
	@Test
	public void suscriptoTest() {
		servidor.agregarDeporte(deporte);
		assertEquals(1, deporte.countObservers());
		aplicacion.agregarPartido(partido);
	}
	
	@Test
	public void mockitoTest() {
		Servidor servMock = mock(Servidor.class);
		aplicacion.addObserver(servMock);
		deporte.addObserver(servMock);
		aplicacion.agregarPartido(partido);
		
		verify(servMock).update(partido);
	}
}