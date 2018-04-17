package Cars;

import java.util.Comparator;

public class CenaComparator implements Comparator<Ogloszenie> {

	@Override
	public int compare(Ogloszenie o1, Ogloszenie o2) {
		if (o1.getSamochod().getCena() > o2.getSamochod().getCena())
			return 1;
		else if (o1.getSamochod().getCena() < o2.getSamochod().getCena())
			return -1;
		else
			return 0;
	}
	
}