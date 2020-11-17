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
	
	// Operación concreta en clase Abstracta. Pueden ser de utilidad en las subclases.
	public String getTitular(){
		return this.titular;
	}
	
	// Operación concreta en clase Abstracta. Pueden ser de utilidad en las subclases.
	public int getSaldo(){
		return this.saldo;
	}
	
	// Operación concreta en clase Abstracta. Pueden ser de utilidad en las subclases.
	protected void setSaldo(int monto){
		this.saldo=monto;
	}
	
	// Operación concreta en clase Abstracta. Pueden ser de utilidad en las subclases.
	public void agregarMovimientos(String movimiento){
		this.movimientos.add(movimiento);
	}
	
	public final void extraer(int monto) {
		if(this.validar(monto)) {
			this.setSaldo(this.getSaldo()-monto);
			this.agregarMovimientos("Extraccion");
		}
	}
	
	// Operación primitiva. Es un método abstracto.
	// Se lo puede llamar también un método hook, ya que cada subclase adopta
	// su propio comportamiento.
	protected abstract boolean validar(int monto);
}