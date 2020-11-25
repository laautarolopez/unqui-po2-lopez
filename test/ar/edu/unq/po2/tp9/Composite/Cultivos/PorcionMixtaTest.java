package ar.edu.unq.po2.tp9.Composite.Cultivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PorcionMixtaTest {
	private PorcionMixta p;
	
	@BeforeEach
	public void setUp() {
		p = new PorcionMixta();
		PorcionMixta p2 = new PorcionMixta();
		PorcionPura PPTrigo = new PorcionPura(new Trigo());
		PorcionPura PPSoja = new PorcionPura(new Soja());
		p2.add(PPSoja);
		p2.add(PPSoja);
		p2.add(PPTrigo);
		p2.add(PPTrigo);
		p.add(PPSoja);
		p.add(PPTrigo);
		p.add(p2);
		p.add(PPSoja);
	}

	@Test
	public void gananciaTest() {
		assertEquals(1700, p.getGananciaAnual());
	}
}