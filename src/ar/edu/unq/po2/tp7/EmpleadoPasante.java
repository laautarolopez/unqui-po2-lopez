package ar.edu.unq.po2.tp7;

public class EmpleadoPasante extends Empleado {
	private int horasTrabajadas;
	
	public EmpleadoPasante(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	@Override
	protected float sueldoTotal() {
		return 40 * this.horasTrabajadas;
	}
}