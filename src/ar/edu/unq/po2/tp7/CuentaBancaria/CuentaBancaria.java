package ar.edu.unq.po2.tp7.CuentaBancaria;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	private String titular;
	private int saldo;
	private List<String> movimientos;
	
	public CuentaBancaria(String titular) {
		this.titular=titular;
		this.saldo=0;
		this.movimientos=new ArrayList<String>();
	}
	
	// Operaci�n concreta en clase Abstracta. Pueden ser de utilidad en las subclases.
	public String getTitular(){
		return this.titular;
	}
	
	// Operaci�n concreta en clase Abstracta. Pueden ser de utilidad en las subclases.
	public int getSaldo(){
		return this.saldo;
	}
	
	// Operaci�n concreta en clase Abstracta. Pueden ser de utilidad en las subclases.
	protected void setSaldo(int monto){
		this.saldo=monto;
	}
	
	// Operaci�n concreta en clase Abstracta. Pueden ser de utilidad en las subclases.
	public void agregarMovimientos(String movimiento){
		this.movimientos.add(movimiento);
	}
	
	public final void extraer(int monto) {
		if(this.validar(monto)) {
			this.setSaldo(this.getSaldo()-monto);
			this.agregarMovimientos("Extraccion");
		}
	}
	
	// Operaci�n primitiva. Es un m�todo abstracto.
	// Se lo puede llamar tambi�n un m�todo hook, ya que cada subclase adopta
	// su propio comportamiento.
	protected abstract boolean validar(int monto);
}