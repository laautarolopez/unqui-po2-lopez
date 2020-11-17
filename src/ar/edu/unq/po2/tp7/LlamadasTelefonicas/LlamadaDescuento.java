package ar.edu.unq.po2.tp7.LlamadasTelefonicas;

public class LlamadaDescuento extends LlamadaTelefonica {
	
	public LlamadaDescuento(int tiempo, int horaDelDia) {
		super(tiempo, horaDelDia);
	}
	
	@Override
	public boolean esHoraPico() {
		return false;
	}
	@Override
	public float costoNeto(){
		return this.getTiempo()*0.95f;
	}
}