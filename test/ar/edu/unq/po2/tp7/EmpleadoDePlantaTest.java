package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Sueldo.EmpleadoDePlanta;

public class EmpleadoDePlantaTest {
	private EmpleadoDePlanta empleado;
	
	
	@BeforeEach
	public void setUp() {
		empleado = new EmpleadoDePlanta(4);
	}
	
	@Test
	public void testSueldoEmpleado() {
		assertEquals(3132, empleado.getSueldo());
	}
}