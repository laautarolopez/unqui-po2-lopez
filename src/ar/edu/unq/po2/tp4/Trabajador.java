package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
	public Double getTotalPercibido() {
		Double total = 0d;
		for (int i = 0; i < ingresos.size(); i++) {
			total += ingresos.get(i).getMonto();
		}
		return total;
	}
	
	public Double getMontoImponible() {
		Double total = 0d;
		for (int i = 0; i < ingresos.size(); i++) {
			total += ingresos.get(i).getMontoImponible();
		}
		return total;
	}
	
	public Double getImpuestoAPagar() {
		Double total = 0d;
		for (int i = 0; i < ingresos.size(); i++) {
			total += ingresos.get(i).getImpuesto();
		}
		return total;
	}
}