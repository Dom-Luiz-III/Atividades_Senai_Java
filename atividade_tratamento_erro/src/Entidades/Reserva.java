package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}
	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duracao() {
		// Retorna quantos dias existem entre o check-in e o check-out
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String atualizarDatas(Date checkIn, Date checkOut) {
		if(checkOut.after(checkIn)) {
			this.checkIn = checkIn;
			this.checkOut = checkOut;
			return null;
		}
		else {
			return "Não é possível realizar reserva: Data de Check-In posterior à de Check-Ou";
		}
		
	}
	
	@Override
	public String toString() {
		return "Quarto " + numeroQuarto 
				+ ", check-in " + formatador.format(checkIn)
				+ ", check-out " + formatador.format(checkOut)
				+ ". Hospedagem por " + duracao() + " noite(s).";
	}
	
	
}
