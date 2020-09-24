package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	private Double costoPorUnidad;
	private Integer cantidadDeUnidad;
	
	public Servicio(Double costoPorUnidad, Integer cantidadDeUnidad) {
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadDeUnidad = cantidadDeUnidad;
	}
	
	public Double getPrecio() {
		return this.costoPorUnidad * this.cantidadDeUnidad;
	}
}