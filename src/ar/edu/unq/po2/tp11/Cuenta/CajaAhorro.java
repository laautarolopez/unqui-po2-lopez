package ar.edu.unq.po2.tp11.Cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	protected boolean puedeExtraer(Integer monto) {
		return this.saldo >= monto;
	}
}