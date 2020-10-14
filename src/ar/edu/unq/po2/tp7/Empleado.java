package ar.edu.unq.po2.tp7;

public abstract class Empleado {
	public final float getSueldo() {
		return this.sueldoTotal() - this.descontarPorcentaje(this.sueldoTotal());
	}
	
	protected abstract float sueldoTotal();
	
	private float descontarPorcentaje(float sueldo) {
		return 13 * sueldo / 100;
	}
}