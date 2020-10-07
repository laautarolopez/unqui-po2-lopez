package ar.edu.unq.po2.tp6.Banco;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {
	
	
	public SolicitudDeCreditoPersonal(Cliente cliente, Float monto, Integer plazo) {
		super(cliente, monto, plazo);
	}
	
	public boolean esAceptada() {
		return this.ingresosAnualesDeAlMenos15000() &&
			   !this.montoSuperaXDeIngresosMensuales(70);
	}

	private boolean ingresosAnualesDeAlMenos15000() {
		return cliente.sueldoNetoAnual() >= 15000.0;
	}
}