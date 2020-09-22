package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	private Trabajador trabajador;
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private IngresoHorasExtras ingreso3;
	
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador();
		ingreso1 = new Ingreso("Julio","Sueldo",10200d);
		ingreso2 = new Ingreso("Marzo", "Sueldo", 9700d);
		ingreso3 = new IngresoHorasExtras("Enero","horas extra curriculares",3500d , 14);
	}
	
	@Test
	void test() {
		trabajador.agregarIngreso(ingreso1);
		assertEquals(10200, trabajador.getTotalPercibido());
		assertEquals(10200, trabajador.getMontoImponible());
		assertEquals(204, trabajador.getImpuestoAPagar());
		
		trabajador.agregarIngreso(ingreso2);
		assertEquals(19900, trabajador.getTotalPercibido());
		assertEquals(19900, trabajador.getMontoImponible());
		assertEquals(398, trabajador.getImpuestoAPagar());
		
		trabajador.agregarIngreso(ingreso3);
		assertEquals(23400, trabajador.getTotalPercibido());
		assertEquals(19900, trabajador.getMontoImponible());
		assertEquals(398, trabajador.getImpuestoAPagar());
	}
}