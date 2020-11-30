package ar.edu.unq.po2.tp10.Reproductor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ReproductorTest {
	private Reproductor reproductor;
	private Song cancion;
	
	@BeforeEach
	public void setUp() {
		reproductor = new Reproductor();
		cancion = mock(Song.class);
		reproductor.setCancion(cancion);
	}

	@Test
	public void reproducirCancionSeleccion() throws Exception {
		reproductor.play();
		verify(cancion).play();
		assertTrue(reproductor.getEstado() instanceof EstadoReproduciendo);
	}
	
	@Test
	public void reproducirCancionPausa() throws Exception {
		try {
			reproductor.setEstado(new EstadoPausa(reproductor));
			reproductor.play();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
		verify(cancion, times(0)).play();
	}
	
	@Test
	public void reproducirCancionReproduciendo() throws Exception {
		try {
			reproductor.setEstado(new EstadoReproduciendo(reproductor));
			reproductor.play();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
		verify(cancion, times(0)).play();
	}
	
	@Test
	public void pausarCancionSeleccion() throws Exception {
		try {
			reproductor.pause();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
		verify(cancion, times(0)).pause();
		verify(cancion, times(0)).play();
	}
	
	@Test
	public void pausarCancionPausa() throws Exception {
		reproductor.setEstado(new EstadoPausa(reproductor));
		reproductor.pause();
		verify(cancion).play();
		assertTrue(reproductor.getEstado() instanceof EstadoReproduciendo);
	}
	
	@Test
	public void pausarCancionReproduciendo() throws Exception {
		reproductor.setEstado(new EstadoReproduciendo(reproductor));
		reproductor.pause();
		verify(cancion).pause();
		assertTrue(reproductor.getEstado() instanceof EstadoPausa);
	}
	
	@Test
	public void stopCancionSeleccion() {
		reproductor.stop();
		verify(cancion, times(0)).stop();
		assertTrue(reproductor.getEstado() instanceof EstadoSeleccion);
	}
	
	@Test
	public void stopCancionPausa() {
		reproductor.setEstado(new EstadoPausa(reproductor));
		reproductor.stop();
		verify(cancion).stop();
		assertTrue(reproductor.getEstado() instanceof EstadoSeleccion);
	}
	
	@Test
	public void stopCancionReproduciendo() {
		reproductor.setEstado(new EstadoReproduciendo(reproductor));
		reproductor.stop();
		verify(cancion).stop();
		assertTrue(reproductor.getEstado() instanceof EstadoSeleccion);
	}
}