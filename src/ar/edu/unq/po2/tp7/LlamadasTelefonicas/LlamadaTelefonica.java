package ar.edu.unq.po2.tp7.LlamadasTelefonicas;

public abstract class LlamadaTelefonica {
	private int tiempo;
	private int horaDelDia;
	
	public LlamadaTelefonica(int tiempo, int horaDelDia){
		this.tiempo=tiempo;
		this.horaDelDia=horaDelDia;
	}
	
	/**
	 * Operación concreta: operación que es de utilidad en las subclases.
	 */
	public int getTiempo(){
		return this.tiempo;
	}
	
	/**
	 * Operación concreta: operación que es de utilidad en las subclases.
	 */
	public int getHoraDelDia(){
		return this.horaDelDia;
	}
	
	/**
	 * Operación primitiva: método abstracto.
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
	 * Es un método Hook, ya que las subclases redefinen el método con su propio comportamiento.
	 */
	public float costoNeto(){   
		return this.getTiempo()*1;
	}
}