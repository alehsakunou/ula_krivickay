package epamlab;

public class Runner {

	public static void main(String[] args) {

		/**
		 * Define a set of various types of purchases
		 */
		MonthPurchase monthPurchases = new MonthPurchase(1000);
		monthPurchases.addPurchaseWithCostDiscount(10, 2, 20);
		monthPurchases.addPurchaseWithCostDiscount(11, 90, 10);
		monthPurchases.addPurchaseWithPriceDiscount(20, 7, 15);
		monthPurchases.addPurchaseWithPriceDiscount(3, 45, 100);
		monthPurchases.addPurchaseWithTransportCharges(4, 6, 100);
		monthPurchases.addPurchaseWithTransportCharges(8, 32, 100);

		/**
		 * Print the set of purchases on the console of one purchase on line
		 */
		System.out.println("Original array:");
		monthPurchases.printAll();

		/**
		 *  Calculate and print the sum of all purchases
		 */
		System.out.println("Cost of all purchases: " + monthPurchases.CostOfAll());

		/**
		 * Sort purchases by day and print them
		 */
		System.out.println("Sorted array:");
		monthPurchases.sortByDay();
		monthPurchases.printAll();

		/**
		 * Determine whether the purchase of the tenth day of the month
		 */
		int day = 10;
		boolean isPurchase = monthPurchases.isPurchaseExist(day);
		System.out.println("Was a purchase in " + day + " : " + isPurchase);

	}

}
