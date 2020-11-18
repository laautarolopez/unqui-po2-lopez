package ar.edu.unq.po2.tp7.Fechas;

import org.joda.time.DateTime;

public class IFechaAdapter implements IFecha {
	private DateTime dateTime;
	
	public IFechaAdapter() {
		super();
		this.dateTime = new DateTime();
	}
	
	public IFechaAdapter(int dia, int mes, int anio) {
		super();
		this.dateTime = new DateTime(anio, mes, dia, 0, 0);
	}
	
	public IFecha restarDias(int dias) {
		this.dateTime = this.dateTime.minusDays(-2);
		return this;
	}
	
	public boolean antesDeAhora() {
		return this.dateTime.isBeforeNow();
	}
	
	public boolean antesDe(IFecha fecha) {
		int dia = fecha.dia();
		int mes = fecha.mes();
		int anio = fecha.anio();
		DateTime dateTimeNuevo = new DateTime(anio, mes, dia, 0, 0);
		return this.dateTime.isBefore(dateTimeNuevo);
	}
	
	public boolean despuesDeAhora() {
		return this.dateTime.isAfterNow();
	}
	
	public boolean despuesDeFecha(IFecha fecha) {
		int dia = fecha.dia();
		int mes = fecha.mes();
		int anio = fecha.anio();
		DateTime dateTimeNuevo = new DateTime(anio, mes, dia, 0, 0);
		return this.dateTime.isAfter(dateTimeNuevo);
	}
	
	public int dia() {
		return this.dateTime.getDayOfMonth();
	}
	
	public int mes() {
		return this.dateTime.getMonthOfYear();
	}
	
	public int anio() {
		return this.dateTime.getYear();
	}
}