package by.gsu.epamlab;

/**
 * The class "PurchaseWithConstDiscount" extends the class "AbstaractPurchase"
 * subclass for the purchase with a discount to be presented if the number of
 * purchased units is greater than the given subclass constant. A discount rate
 * is given by the percent from the purchase cost.
 * 
 * @author Yuliya Krivitskaya
 *
 */
public class PurchaseWithConstDiscount extends AbstaractPurchase {

	/**
	 * if the number of purchased units is greater than the this constant are
	 * given discount
	 */
	public int N = 6;

	/** the discount */
	private int discount;

	/**
	 * Default constructor
	 */
	public PurchaseWithConstDiscount() {
		super();
	}

	/**
	 * General-purpose constructor
	 */
	public PurchaseWithConstDiscount(Commodity commodity, int amount, int discount) {
		super(commodity, amount);
		this.discount = discount;
	}

	/**
	 * calculating the purchase cost
	 * 
	 * @return the purchase cost with discount or without
	 */
	@Override
	public int getCost() {
		return (amount >= N) ? commodity.getPrice() * (100 - discount) / 100 * amount : commodity.getPrice() * amount;
	}

	/**
	 * Comparing purchases on the cost decreasing
	 */
	@Override
	public int compareTo(AbstaractPurchase o) {
		return super.CompareTo(o);
	}

	/**
	 * Returns a string representation of the object
	 */
	@Override
	public String toString() {
		return super.toString() + ";" + discount;
	}

}
