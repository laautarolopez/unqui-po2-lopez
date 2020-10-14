package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTemporarioTest {
	private EmpleadoTemporario empleado;
	private EmpleadoTemporario empleado2;
	
	
	@BeforeEach
	public void setUp() {
		empleado = new EmpleadoTemporario(100, false, true);
		empleado2 = new EmpleadoTemporario(100, false, false);
	}
	
	@Test
	public void testSueldoEmpleado() {
		assertEquals(1392, empleado.getSueldo());
	}
	
	@Test
	public void testSueldoEmpleado2() {
		assertEquals(1305, empleado2.getSueldo());
	}
}