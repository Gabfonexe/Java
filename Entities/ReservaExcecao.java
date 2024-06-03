package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import Exception.DomainException;

public class ReservaExcecao {
  
  private Integer numeroQuarto;
  private Date checkIn;
  private Date checkOut;

  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public ReservaExcecao (Integer numeroQuarto, Date checkIn, Date checkOut){
    if(!checkOut.after(checkIn)){ // repetindo no construtor para fins de bons costumes
      throw new DomainException("Data de CheckOut não pode ser antes da data de CheckIn");
    }
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

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservas devem ser feitas para datas futuras");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Data de CheckOut não pode ser antes da data de CheckIn");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Quarto "
			+ numeroQuarto
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " Noites";
	}
}
