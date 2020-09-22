package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	private Double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Double descuento) {
		super(nombre, precio);
		this.descuento = descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean precioCuidado,
																  Double descuento) {
		super(nombre, precio, precioCuidado);
		this.descuento = descuento;
	}

	public Double getPrecio() {
		return super.getPrecio() * (100 - descuento) / 100;
	}
}