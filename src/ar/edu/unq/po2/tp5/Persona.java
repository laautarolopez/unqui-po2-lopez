package ar.edu.unq.po2.tp5;

public class Persona implements SerVivo{
	private String nombre;
	private Integer fechaDeNacimiento;
	private Integer a�oActual = 2020;
	
	public Persona(String nombre, Integer fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Integer getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public Integer getEdad() {
		return this.a�oActual - this.fechaDeNacimiento;
	}
	
	public boolean esMenorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
}