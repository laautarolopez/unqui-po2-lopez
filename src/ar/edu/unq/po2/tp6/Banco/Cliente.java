package ar.edu.unq.po2.tp6.Banco;

public class Cliente {
	String nombre;
	String apellido;
	String direccion;
	Integer edad;
	Float sueldoNetoMensual;
	
	public Cliente(String nombre, String apellido, String direccion, Integer edad,
													Float sueldoNetoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public Float sueldoNetoAnual() {
		return this.sueldoNetoMensual * 12;
	}
	
	public void solicitarCredito(SolicitudDeCredito solicitud, Banco banco) {
		banco.evaluarSolicitud(solicitud);
	}
}