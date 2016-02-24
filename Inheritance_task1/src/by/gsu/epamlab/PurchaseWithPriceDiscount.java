package by.gsu.epamlab;

/**
 * The class "PurchaseWithPriceDiscount" extends the class "Purchase". It is
 * subclass for the purchase with a price discount
 * 
 * @author Yuliya Krivitskaya
 *
 */
public class PurchaseWithPriceDiscount extends Purchase {

	/** the discount */
	private int discount;

	/**
	 * Constructor
	 */
	public PurchaseWithPriceDiscount(String name, int price, int number, int discount) {
		super(name, price, number);
		this.discount = discount;
	}

	/**
	 * calculating the purchase cost
	 * 
	 * @return the purchase cost with discount
	 */
	@Override
	public int getCost() {

		return super.getCost() - getNumber() * discount;
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
