package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaAgenciaTest {
	private Caja caja;
	private Servicio servicio;
	private Impuesto impuesto;
	
	
	@BeforeEach
	public void setUp() {
		caja = new Caja();
		servicio = new Servicio(10d, 5);
		impuesto = new Impuesto(500d);
		
	}
	
	@Test
	public void testConstructor() {
		assertEquals(0d, caja.getMontoTotal());
	}
	
	@Test
	public void testPago() {
		caja.registrarPago(servicio);
		caja.registrarPago(impuesto);
		assertEquals(550d, caja.getMontoTotal());
	}
}