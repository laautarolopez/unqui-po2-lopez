package ar.edu.unq.po2.tp6.Banco;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {
	private PropiedadInmobiliaria propiedad;
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, Float monto, Integer plazo,
														PropiedadInmobiliaria propiedad) {
		super(cliente, monto, plazo);
		this.propiedad = propiedad;
	}
	
	public boolean esAceptada() {
		return !this.montoMayorA70ValorFiscal() &&
			   !this.montoSuperaXDeIngresosMensuales(50) &&
			   !this.supera65Años();
	}

	private boolean montoMayorA70ValorFiscal() {
		return (this.monto * 100 / propiedad.valorFiscal) > 70;
	}
	
	private boolean supera65Años() {
		return this.cliente.edad > 65;
	}
}