package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {
	public ProductoDeCooperativa(String nombre, Double precio, Integer stock) {
		super(nombre, precio, stock);
	}

	@Override
	public Double getPrecio() {
		return super.getPrecio() * 0.9;
	}
}