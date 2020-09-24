package ar.edu.unq.po2.tp5;

public class Producto implements Facturable {
	private String nombre;
	private Double precio;
	private Integer stock;
	
	public Producto(String nombre, Double precio, Integer stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public Integer getStock() {
		return this.stock;
	}
	
	public void decrementarStock() {
		this.stock--;
	}
	
	public void facturar() {
		this.decrementarStock();
	}
}