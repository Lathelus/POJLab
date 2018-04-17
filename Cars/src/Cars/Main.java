package Cars;

import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Ogloszenie> lista = new ArrayList<Ogloszenie>();
		lista.add(new Ogloszenie(new Samochod("Opel", "Corsa", 2000, 150000),
				getInstance()));
		lista.add(new Ogloszenie(new Samochod("Fiat", "125", 1989, 300000),
				Calendar(95, 5, 17, 0, 0, 0)));
		lista.add(new Ogloszenie(new Samochod("FSO", "Warszawa", 1970, 400000),
				Calendar(80, 5, 27, 0, 0, 0)));

//		lista.sort(Comparator.comparing(ogl -> ogl.getSamochod().getRocznik()));
//		lista.sort(new RocznikComparator());
		Collections.sort(lista, new RocznikComparator());
		System.out.println(lista);
	}

}
