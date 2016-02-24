package by.gsu.epamlab;

import java.util.Comparator;

public class KindComparator<T> implements Comparator<Shipment> {

	@Override
	public int compare(Shipment s0, Shipment s1) {
		return s0.getKind().ordinal() - s1.getKind().ordinal();
	}

}
