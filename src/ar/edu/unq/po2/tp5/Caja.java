package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja implements Agencia {
	private Double monto;
	
	public Caja() {
		this.monto = 0d;
	}
	
	public void registrarPago(Facturable facturable) {
		monto += facturable.getPrecio();
		facturable.facturar();
	}
	
	public void registrarPago(ArrayList<Facturable> listaDeFacturables) {
		for (int i = 0; i < listaDeFacturables.size(); i++) {
			this.registrarPago(listaDeFacturables.get(i));
		}
	}
	
	public Double getMontoTotal() {
		return this.monto;
	}
}