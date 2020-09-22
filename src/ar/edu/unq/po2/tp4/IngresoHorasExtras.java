package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends Ingreso {
	private Integer horasExtras;
	
	public IngresoHorasExtras(String mes, String concepto, Double monto, Integer horasExtras) {
		super(mes, concepto, monto);
		this.horasExtras = horasExtras;
	}

	public Integer getHorasExtras() {
		return this.horasExtras;
	}
	
	public Double getMontoImponible() {
		return 0d;
	}
	
	public Double getImpuesto() {
		return 0d;
	}
}