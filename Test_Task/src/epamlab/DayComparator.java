package epamlab;

import java.util.Comparator;

public class DayComparator<T> implements Comparator<Purchase> {

	@Override
	public int compare(Purchase o1, Purchase o2) {
		return ((Purchase) o1).getDay() - ((Purchase) o2).getDay();
	}

}
