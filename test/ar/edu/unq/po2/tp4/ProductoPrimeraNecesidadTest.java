package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad agua;
	private ProductoPrimeraNecesidad pan;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10d);
		agua = new ProductoPrimeraNecesidad("agua", 45d, true, 5d);
		pan = new ProductoPrimeraNecesidad("pan", 90d, 3d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
		assertEquals(42.75, agua.getPrecio());
		assertEquals(87.3, pan.getPrecio());
	}
}
