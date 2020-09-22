package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoHorasExtrasTest {
	private IngresoHorasExtras ingresoHorasExtras;
	
	@BeforeEach
	public void setUp() {
		ingresoHorasExtras = new IngresoHorasExtras("Enero","horas extra curriculares",3500d , 14);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Enero", ingresoHorasExtras.getMes());
		assertEquals("horas extra curriculares", ingresoHorasExtras.getConcepto());
		assertEquals(3500, ingresoHorasExtras.getMonto());
	}
	
	@Test
	public void testCalculados() {
		assertEquals(0, ingresoHorasExtras.getMontoImponible());
		assertEquals(0, ingresoHorasExtras.getImpuesto());
	}
}