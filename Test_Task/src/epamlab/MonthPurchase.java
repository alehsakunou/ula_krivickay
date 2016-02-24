package epamlab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The class "MonthPurchase" describe a purchase the same commodity by the same price
 * during a month and contain information about day and count of purchase
 * @author Z70-80
 *
 */


public class MonthPurchase {

	/** List of purchase */
	private List<Purchase> purchases;
	
	/** fix price of one unit */
	private final int itemCost;
	
	/**
	 * Constructor
	 */
	public MonthPurchase(int itemCost) {
		this.itemCost = itemCost;
		purchases = new ArrayList<Purchase>();
	}

	/**
	 * Add purchase with discount (percent of the value) 
	 * @param day - the day of the purchase
	 * @param count - the number of units of the purchase
	 * @param costDiscount - the discount 
	 */
	public void addPurchaseWithCostDiscount(int day, int count, int costDiscount) {
		double totalCost = count * itemCost * (1 - costDiscount / 100);
		purchases.add(new Purchase(day, count, PurchaseCategory.PurchaseWithCostDiscount, totalCost));
	}

	/** 
	 * Add purchase with discount in the price
	 * @param day - the day of the purchase
	 * @param count - the number of units of the purchase
	 * @param priceDiscount - the discount 
	 */
	public void addPurchaseWithPriceDiscount(int day, int count, int priceDiscount) {
		double totalCost = count * (itemCost - priceDiscount);
		purchases.add(new Purchase(day, count, PurchaseCategory.PurchaseWithPriceDiscount, totalCost));
	}

	/**
	 * Add purchase with transport charges
	 * @param day - the day of the purchase
	 * @param count - the number of units of the purchase
	 * @param transportCharges - transport charges
	 */
	public void addPurchaseWithTransportCharges(int day, int count, int transportCharges) {
		double totalCost = count * itemCost + transportCharges;
		purchases.add(new Purchase(day, count, PurchaseCategory.PurchaseWithTransportCharges, totalCost));
	}

	/**
	 * Sort purchases by day
	 */
	public void sortByDay() {
		Collections.sort(purchases, new DayComparator<>());
	}

	/**
	 * determine whether the purchase of the day of the month
	 * @param day - the day which is defined 
	 * @return whether the purchase of the day of the month: true or false
	 */
	public boolean isPurchaseExist(int day) {
		for (Purchase purchase : purchases) {
			if (purchase.getDay() == day) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Print all purchases on the console
	 */
	public void printAll() {
		for (Purchase purchase : purchases) {
			System.out.println(purchase.toString());
		}
	}

	/**
	 * Calculate the sum of all purchases
	 * @return the sum of all purchases
	 */
	public double CostOfAll() {
		double cost = 0.0;
		for (Purchase purchase : purchases) {
			cost += purchase.getTotalCost();
		}
		return cost;
	}

	public List<Purchase> getPurchases() {
		return purchases;
	}

	public int getItemCost() {
		return itemCost;
	}

}
