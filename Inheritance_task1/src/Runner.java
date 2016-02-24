import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.PurchaseWithPriceDiscount;
import by.gsu.epamlab.PurchaseWithNumberDiscount;

public class Runner {

	public static void main(String[] args) {

		/**
		 * Create an array for 6 objects (2 – of superclass and 2 – of every
		 * subclass)
		 */
		Purchase[] purchases = { new Purchase("limon", 60000, 6), new Purchase("apple", 9000, 7),
				new PurchaseWithPriceDiscount("pasta", 20000, 2, 60),
				new PurchaseWithPriceDiscount("juice", 60000, 10, 20),
				new PurchaseWithNumberDiscount("limon", 60000, 7, 20),
				new PurchaseWithNumberDiscount("juice", 60000, 4, 20) };

		Purchase maxP = purchases[0];
		int k = 0;

		/**
		 * Print the array content to the console (one element per line)
		 */
		System.out.println("Original array:");

		for (int i = 0; i < purchases.length; i++) {
			System.out.println(purchases[i].toString());
			if (purchases[i].getCost() > maxP.getCost())
				maxP = purchases[i];
			if (purchases[0].equals(purchases[i]))
				++k;
		}
		/**
		 * Print the maximum cost purchase
		 */
		System.out.println("Maximum cost purchase " + maxP);

		/**
		 * Determine whether all purchases are equal
		 */
		if (k == purchases.length)
			System.out.println("All purchases are equal");
		else
			System.out.println("All purchases are not equal");
	}

}
