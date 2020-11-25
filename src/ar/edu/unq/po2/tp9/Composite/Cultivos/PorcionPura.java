package ar.edu.unq.po2.tp9.Composite.Cultivos;

public class PorcionPura implements Porcion {
	// Leaf(hoja)
	private Cultivo cultivo;
	
	public PorcionPura(Cultivo cultivo) {
		this.cultivo = cultivo;
	}
	
	public int getGananciaAnual() {
		return this.cultivo.getGananciaAnual() * 4;
	}
	
	public void add(Porcion porcion) {}
	
	public void remove(Porcion porcion) {}
}