package ar.edu.unq.po2.tp6.Banco;

public abstract class SolicitudDeCredito {
	Cliente cliente;
	Float monto;
	Integer plazo; // en meses
	
	public SolicitudDeCredito(Cliente cliente, Float monto, Integer plazo) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}
	
	public Float cuotaMensual() {
		return this.monto / this.plazo;
	}
	
	public abstract boolean esAceptada();
	
	boolean montoSuperaXDeIngresosMensuales(Integer porcentaje) {
		return (this.cuotaMensual() * 100 / cliente.sueldoNetoMensual ) > porcentaje;
	}
}