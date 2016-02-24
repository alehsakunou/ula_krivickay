package by.gsu.epamlab;

/**
 * The class "PurchaseWithNumberDiscount" extends the class "Purchase" subclass
 * for the purchase with a discount to be presented if the number of purchased
 * units is greater than the given subclass constant. A discount rate is given
 * by the percent from the purchase cost.
 * 
 * @author Yuliya Krivitskaya
 *
 */
public class PurchaseWithNumberDiscount extends Purchase {

	/**
	 * if the number of purchased units is greater than the this constant are
	 * given discount
	 */
	public int count = 12;

	/** the discount */
	private int discount;

	/**
	 * Constructor
	 */
	public PurchaseWithNumberDiscount(String name, int price, int number, int discount) {
		super(name, price, number);
		this.discount = discount;
	}

	/**
	 * calculating the purchase cost
	 * 
	 * @return the purchase cost with discount or without
	 */
	@Override
	public int getCost() {
		if (getNumber() >= count)
			return super.getCost() * (1 - discount / 100);
		else
			return super.getCost();
	}

	/**
	 * Returns a string representation of the object with discount
	 */
	@Override
	public String toString() {
		return super.toString() + ";" + discount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
