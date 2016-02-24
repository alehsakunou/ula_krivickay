package by.gsu.epamlab;

/**
 * The class "PurchaseWithDiscount" extends the class "AbstaractPurchase"
 * subclass for the purchase with a price discount
 * 
 * @author Yuliya Krivitskaya
 *
 */
public class PurchaseWithDiscount extends AbstaractPurchase {

	/** the discount */
	private int discount;

	/**
	 * Default constructor
	 */
	public PurchaseWithDiscount() {
		super();
	}

	/**
	 * General-purpose constructor
	 */
	public PurchaseWithDiscount(Commodity commodity, int amount, int discount) {
		super(commodity, amount);
		this.discount = discount;
	}

	/**
	 * calculating the purchase cost
	 * 
	 * @return the purchase cost with discount
	 */
	@Override
	public int getCost() {
		return (commodity.getPrice() - discount) * amount;
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
