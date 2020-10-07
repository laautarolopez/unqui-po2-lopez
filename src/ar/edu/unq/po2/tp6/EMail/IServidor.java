package ar.edu.unq.po2.tp6.EMail;

public interface IServidor extends IntercambiarCorreo, ComplementosCorreo {

	public void conectar(String nombreUsuario, String passusuario);

}