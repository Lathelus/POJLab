package Cars;

public class Samochod {
	private String marka;
	private String model;
	private int rocznik;
	private int przebieg;
	private int cena;
	
	public Samochod(String marka, String model, int rocznik, int przebieg,
			int cena) {
		super();
		this.marka = marka;
		this.model = model;
		this.rocznik = rocznik;
		this.przebieg = przebieg;
		this.cena = cena;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRocznik() {
		return rocznik;
	}

	public void setRocznik(int rocznik) {
		this.rocznik = rocznik;
	}

	public int getPrzebieg() {
		return przebieg;
	}

	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Samochod [marka=" + marka + ", model=" + model + ", rocznik="
				+ rocznik + ", przebieg=" + przebieg + ", cena=" + cena + "]";
	}
	
	
	
}
