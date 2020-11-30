package ar.edu.unq.po2.tp11.Cuenta;

public abstract class CuentaBancaria {
	protected HistorialMovimientos historialDeMovimientos;
	protected Notificador notificador;
	protected int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	
	// Template method
	// pasos
	public void extraer(Integer monto) {
		if(this.puedeExtraer(monto)) { // condicion
			this.saldo = saldo - monto; // restar saldo
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto); //registrar movimiento
			this.notificador.notificarNuevoSaldoACliente(this); // notifica
		}
	}

	protected abstract boolean puedeExtraer(Integer monto);
}