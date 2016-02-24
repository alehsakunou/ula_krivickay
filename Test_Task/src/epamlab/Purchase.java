package epamlab;

/**
 * The class "Purchase" 
 * Implement interface Comparator for override standard method of sort purchases
 * 
 * @author Yulia_Krivitkaya
 *
 */
public class Purchase {

	/** day of a purchase */
	private int day;

	/** number of units of a purchase */
	private int count;

	/** Category of purchase (enum) */
	private PurchaseCategory category;

	/** the value of all purchases */
	private double totalCost;

	/**
	 * Constructor
	 */
	public Purchase(int day, int count, PurchaseCategory category, double totalCost) {
		super();
		this.day = day;
		this.count = count;
		this.category = category;
		this.totalCost = totalCost;
	}

	/**
	 * Returns a string representation of the object
	 */
	@Override
	public String toString() {
		return "day " + day + " count " + count + " category " + category + " totalCost " + totalCost;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public PurchaseCategory getCategory() {
		return category;
	}

	public void setCategory(PurchaseCategory category) {
		this.category = category;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

}
