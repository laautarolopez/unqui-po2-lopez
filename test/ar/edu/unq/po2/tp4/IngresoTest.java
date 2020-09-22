package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {
	private Ingreso ingreso;
	
	@BeforeEach
	public void setUp() {
		ingreso = new Ingreso("Julio","Sueldo",10200d);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Julio", ingreso.getMes());
		assertEquals("Sueldo", ingreso.getConcepto());
		assertEquals(10200, ingreso.getMonto());
	}
	
	@Test
	public void testCalculados() {
		assertEquals(10200, ingreso.getMontoImponible());
		assertEquals(204, ingreso.getImpuesto());
	}
}