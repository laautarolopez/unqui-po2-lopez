package ar.edu.unq.po2.tp9.Observer.EncuentrosDeportivos;

import java.util.List;

public class Partido {
	private String resultado;
	private List<Contrincante> contrincantes;
	private Deporte deporte;
	
	public Partido(String resultado, List<Contrincante> contrincantes, Deporte deporte) {
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deporte;
	}

	public String getResultado() {
		return resultado;
	}

	public List<Contrincante> getContrincantes() {
		return contrincantes;
	}

	public Deporte getDeporte() {
		return deporte;
	}
}