package ar.edu.unq.po2.tp9.Composite.Cultivos;

public interface Porcion {
	public int getGananciaAnual();
	
	public void add(Porcion porcion);
	
	public void remove(Porcion porcion);
}