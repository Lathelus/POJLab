package Cars;

import java.util.Date;

public class Ogloszenie {
	private Samochod samochod;
	private Date dataDodania;
	private String tytul;
	
	public Ogloszenie(Samochod samochod, Date dataDodania, String tytul) {
		super();
		this.samochod = samochod;
		this.dataDodania = dataDodania;
		this.tytul = tytul;
	}
	public Samochod getSamochod() {
		return samochod;
	}
	public void setSamochod(Samochod samochod) {
		this.samochod = samochod;
	}
	public Date getDataDodania() {
		return dataDodania;
	}
	public void setDataDodania(Date dataDodania) {
		this.dataDodania = dataDodania;
	}
	
	@Override
	public String toString() {
		return "Ogłoszenie [\n" + "\t" + samochod + "\n\t" + dataDodania + "\n\t" + tytul + "]";
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	
}
