package ar.edu.unq.po2.tp7;

public class EmpleadoTemporario extends Empleado {
	private float sueldoBasico = 1000;
	private int horasTrabajadas;
	private boolean tieneHijos;
	private boolean estaCasado;
	
	public EmpleadoTemporario(int horasTrabajadas, boolean tieneHijos, boolean estaCasado) {
		this.horasTrabajadas = horasTrabajadas;
		this.tieneHijos = tieneHijos;
		this.estaCasado = estaCasado;
	}
	
	@Override
	protected float sueldoTotal() {
		return sueldoBasico + (5 * this.horasTrabajadas) + this.bonoPorHijoOConyuge();
	}

	private float bonoPorHijoOConyuge() {
		if(this.tieneHijos || this.estaCasado) {
			return 100;
		} else {
			return 0;
		}
	}
}