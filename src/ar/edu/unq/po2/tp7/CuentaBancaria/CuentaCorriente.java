package ar.edu.unq.po2.tp7.CuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {
	private int descubierto;
	
	public CuentaCorriente(String titular, int descubierto) {
		super(titular);
		this.descubierto=descubierto;
	}
	
	// Operación concreta
	public int getDescubierto() {
		return this.descubierto;
	}
	
	// Operación concreta
	protected boolean validar(int monto) {
		return (this.getSaldo()+this.getDescubierto()) >= monto;
	}
}