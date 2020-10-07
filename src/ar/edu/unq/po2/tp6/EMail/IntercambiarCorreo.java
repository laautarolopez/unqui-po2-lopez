package ar.edu.unq.po2.tp6.EMail;

import java.util.List;

public interface IntercambiarCorreo {

	public List<Correo> recibirNuevos(String user, String pass);
	
	public void enviar(Correo correo);
}