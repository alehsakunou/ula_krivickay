package by.gsu.epamlab;

import java.util.Comparator;

public class SortByNum<T> implements Comparator<Coordinate>{
	
	@Override
	public int compare(Coordinate s0, Coordinate s1) {
		return s1.getNum() - s0.getNum();
	}
}
