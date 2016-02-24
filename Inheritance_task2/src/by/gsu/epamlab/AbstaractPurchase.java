package by.gsu.epamlab;

/**
 * The superclass AbstaractPurchase is describing the commodity purchase and
 * implementing interface Comparable<AbstaractPurchase>
 * 
 * @author Yuliya Krivitskaya
 *
 */
public abstract class AbstaractPurchase implements Comparable<AbstaractPurchase> {

	/** commodity */
	Commodity commodity;

	/** number of purchased units */
	protected int amount;

	/**
	 * Default constructor
	 */
	public AbstaractPurchase() {
		super();
	}

	/**
	 * General-purpose constructor
	 */
	public AbstaractPurchase(Commodity commodity, int amount) {
		super();
		this.commodity = commodity;
		this.amount = amount;
	}

	/**
	 * abstract method notes the method of calculating the cost of purchase
	 */
	abstract public int getCost();

	/**
	 * Returns a string representation of the object
	 */
	@Override
	public String toString() {

		return commodity + ";" + amount + ";" + getCost();
	}

	/**
	 * comparing purchases on the cost decreasing
	 * 
	 * @param purchase
	 * @return number in order
	 */
	public int CompareTo(AbstaractPurchase purchase) {
		if (getCost() > purchase.getCost())
			return -1;
		if (getCost() < purchase.getCost())
			return 1;
		else
			return 0;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
