package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private Double precio;
	private boolean precioCuidado;
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = false;
	}
	
	public Producto(String nombre, Double precio, boolean precioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public boolean esPrecioCuidado() {
		return this.precioCuidado;
	}
	
	public void aumentarPrecio(Double aumento) {
		this.precio = this.precio + aumento;
	}
}