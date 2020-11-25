package ar.edu.unq.po2.tp9.Composite.Cultivos;

import java.util.ArrayList;
import java.util.List;

public class PorcionMixta implements Porcion{
	// Composite
	private List<Porcion> porciones = new ArrayList<Porcion>();
	
	public PorcionMixta() {}
	
	public PorcionMixta(List<Porcion> porciones) {
		this.porciones = porciones;
	}
	
	public int getGananciaAnual() {
		int ganancia = 0;
		for(Porcion p : porciones) {
			ganancia += (p.getGananciaAnual() / 4);
		}
		return ganancia;
	}
	
	public void add(Porcion porcion) {
		this.porciones.add(porcion);
	}
	
	public void remove(Porcion porcion) {
		this.porciones.remove(porcion);
	}
}