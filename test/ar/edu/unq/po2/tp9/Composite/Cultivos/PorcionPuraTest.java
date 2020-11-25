package ar.edu.unq.po2.tp9.Composite.Cultivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PorcionPuraTest {
	private PorcionPura p;
	private PorcionPura p2;
	
	@BeforeEach
	public void setUp() {
		p = new PorcionPura(new Trigo());
		p2 = new PorcionPura(new Soja());
	}

	@Test
	public void trigoTest() {
		assertEquals(1200, p.getGananciaAnual());
	}
	
	@Test
	public void sojaTest() {
		assertEquals(2000, p2.getGananciaAnual());
	}
}