package ar.edu.unq.po2.tp7.CuentaBancaria;

public class CajaDeAhorro extends CuentaBancaria {
	private int limite;
	
	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		this.limite=limite;
	}
	
	// Operación concreta
	public int getLimite(){
		return this.limite;
	}
	
	// Operación concreta
	protected boolean validar(int monto) {
		return (this.getSaldo() >= monto && this.getLimite() >= monto);
	}
}