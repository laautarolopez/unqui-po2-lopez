package ar.edu.unq.po2.tp7.PalabrasOrdenadas;

import javax.swing.DefaultListModel;

public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel<String> {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private ListaDePalabrasOrdenadas lista;

	public ListaDePalabrasOrdenadasAdapter() {
		super();
		this.lista = new ListaDePalabrasOrdenadas();
	}
	
	@Override
	public void addElement(String palabra) {
		this.lista.agregarPalabra(palabra);
	}
	
	@Override
	public String getElementAt(int posicion){
		return this.lista.getPalabraDePosicion(posicion);
	}
	
	@Override
	public int getSize(){
		return this.lista.cantidadDePalabras();
	}
}