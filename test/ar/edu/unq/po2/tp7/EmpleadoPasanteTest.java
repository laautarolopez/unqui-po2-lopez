package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Sueldo.EmpleadoPasante;

public class EmpleadoPasanteTest {
	private EmpleadoPasante empleado;
	
	
	@BeforeEach
	public void setUp() {
		empleado = new EmpleadoPasante(31);
	}
	
	@Test
	public void testSueldoEmpleado() {
		assertEquals(1078.8f, empleado.getSueldo());
	}
}