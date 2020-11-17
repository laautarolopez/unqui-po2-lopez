package ar.edu.unq.po2.tp7.LlamadasTelefonicas;

public abstract class LlamadaTelefonica {
	private int tiempo;
	private int horaDelDia;
	
	public LlamadaTelefonica(int tiempo, int horaDelDia){
		this.tiempo=tiempo;
		this.horaDelDia=horaDelDia;
	}
	
	/**
	 * Operaci�n concreta: operaci�n que es de utilidad en las subclases.
	 */
	public int getTiempo(){
		return this.tiempo;
	}
	
	/**
	 * Operaci�n concreta: operaci�n que es de utilidad en las subclases.
	 */
	public int getHoraDelDia(){
		return this.horaDelDia;
	}
	
	/**
	 * Operaci�n primitiva: m�todo abstracto.
	 */
	public abstract boolean esHoraPico();
	
	/**
	 * Es el esqueleto del template method, sin embargo le falta el "final".
	 */
	public float costoFinal(){
		if(this.esHoraPico()){
			return this.costoNeto()*1.2f*this.getTiempo();
		}else{
			return this.costoNeto()*this.getTiempo();
		}
	}
	
	/**
	 * Es un m�todo Hook, ya que las subclases redefinen el m�todo con su propio comportamiento.
	 */
	public float costoNeto(){   
		return this.getTiempo()*1;
	}
}