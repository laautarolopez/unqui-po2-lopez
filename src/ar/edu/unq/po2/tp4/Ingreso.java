package ar.edu.unq.po2.tp4;

public class Ingreso {
	private String mes;
	private String concepto;
	private Double monto;
	
	public Ingreso(String mes, String concepto, Double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public String getMes() {
		return this.mes;
	}


	public String getConcepto() {
		return this.concepto;
	}


	public Double getMonto() {
		return this.monto;
	}
	
	public Double getMontoImponible() {
		return this.monto;
	}
	
	public Double getImpuesto() {
		return monto * 0.02;
	}
}