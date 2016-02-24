package by.gsu.epamlab;

/**
 * The class Commodity is describing the commodity
 * 
 * @author Yuliya Krivitskaya
 *
 */
public class Commodity {

	/** commodity name */
	private String name;

	/** price in belarusian rubles */
	private int price;

	/**
	 * Constructor
	 */
	public Commodity(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	/**
	 * Returns a string representation of the object
	 */
	public String toString() {
		return name + ";" + price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
