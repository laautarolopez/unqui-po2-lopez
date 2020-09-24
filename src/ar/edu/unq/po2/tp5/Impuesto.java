package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	private Double tasaDelServicio;
	
	public Impuesto(Double tasaDelServicio) {
		this.tasaDelServicio = tasaDelServicio;
	}
	
	public Double getPrecio() {
		return this.tasaDelServicio;
	}
}