package ar.edu.unq.po2.tp9.Observer.EncuentrosDeportivos;

public class AplicacionDeportesContrincantes extends AplicacionDeportes {
	
	@Override
	protected void notificar(Partido partido) {
		super.notificar(partido);
		
		partido.getContrincantes().get(0).setChanged();
		partido.getContrincantes().get(0).notifyObservers(partido);
		
		partido.getContrincantes().get(1).setChanged();
		partido.getContrincantes().get(1).notifyObservers(partido);
	}
}