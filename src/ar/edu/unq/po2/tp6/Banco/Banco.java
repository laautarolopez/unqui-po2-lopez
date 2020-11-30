package ar.edu.unq.po2.tp6.Banco;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes;
	private Float monto; 
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.monto = 0f;
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void evaluarSolicitud(SolicitudDeCredito solicitud) {
		if (solicitud.esAceptada()) {
			this.otorgarSolicitud(solicitud);
		}
	}

	private void otorgarSolicitud(SolicitudDeCredito solicitud) {
		this.monto += solicitud.monto;
	}
	
	public Float getMontoADesembolsar() {
		return this.monto;
	}
}