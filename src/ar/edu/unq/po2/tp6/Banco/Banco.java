package ar.edu.unq.po2.tp6.Banco;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
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
	}
}