package ar.edu.unq.po2.tp7.LlamadasTelefonicas;

public class LlamadaDescuento extends LlamadaTelefonica {
	
	public LlamadaDescuento(int tiempo, int horaDelDia) {
		super(tiempo, horaDelDia);
	}
	
	@Override
	public boolean esHoraPico() {
		return false;
	}
	
	/**
	 * Método hook, por el cual cada subclase adopta su comportamiento.
	 * También puede tomar el mismo comportamiento que la superclase.
	 */
	@Override
	public float costoNeto(){
		return this.getTiempo()*0.95f;
	}
}