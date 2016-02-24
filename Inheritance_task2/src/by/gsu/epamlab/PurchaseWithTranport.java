package by.gsu.epamlab;

/**
 * The class "PurchaseWithTranport" extends the class "AbstaractPurchase"
 * subclass for the purchase with an addition for transport expenses
 * 
 * @author Yuliya Krivitskaya
 *
 */

public class PurchaseWithTranport extends AbstaractPurchase {

	/** addition for transport expenses */
	public int transport;

	/**
	 * Default constructor
	 */
	public PurchaseWithTranport() {
		super();
	}

	/**
	 * General-purpose constructor
	 */
	public PurchaseWithTranport(Commodity commodity, int amount, int transport) {
		super(commodity, amount);
		this.transport = transport;
	}

	/**
	 * calculating the purchase cost
	 * 
	 * @return the purchase cost with discount
	 */
	@Override
	public int getCost() {
		return (commodity.getPrice() + transport) * amount;
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
		return super.toString() + ";" + transport;
	}

}
