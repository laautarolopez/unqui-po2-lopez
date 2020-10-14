package ar.edu.unq.po2.tp7;

public class EmpleadoDePlanta extends Empleado {
	private float sueldoBasico = 3000;
	private int hijos;
	
	public EmpleadoDePlanta(int hijos) {
		this.hijos = hijos;
	}
	
	@Override
	protected float sueldoTotal() {
		return sueldoBasico + (150 * hijos);
	}
}