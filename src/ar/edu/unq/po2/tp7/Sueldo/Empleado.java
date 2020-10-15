package ar.edu.unq.po2.tp7.Sueldo;

public abstract class Empleado {
	public final float getSueldo() {
		float sueldo = this.sueldoTotal();
		return sueldo - this.aportesYObraSocial(sueldo);
	}
	
	protected abstract float sueldoTotal();
	
	private float aportesYObraSocial(float sueldo) {
		return 13f * sueldo / 100f;
	}
}