import java.util.Arrays;

import by.gsu.epamlab.AbstaractPurchase;
import by.gsu.epamlab.Commodity;
import by.gsu.epamlab.PurchaseWithConstDiscount;
import by.gsu.epamlab.PurchaseWithDiscount;
import by.gsu.epamlab.PurchaseWithTranport;

public class Runner {

	public static void main(String[] args) {

		/**
		 * Create an array for 6 objects (2 – of every subclass) First create
		 * commodity
		 */
		Commodity limon = new Commodity("limon", 60000);
		Commodity pasta = new Commodity("pasta", 90000);
		Commodity juice = new Commodity("juice", 11000);
		Commodity apple = new Commodity("apple", 25000);

		AbstaractPurchase[] purchases = new AbstaractPurchase[6];

		purchases[0] = new PurchaseWithDiscount(limon, 3, 20);
		purchases[1] = new PurchaseWithDiscount(pasta, 6, 30);
		purchases[2] = new PurchaseWithConstDiscount(juice, 9, 90);
		purchases[3] = new PurchaseWithConstDiscount(apple, 10, 60);
		purchases[4] = new PurchaseWithTranport(limon, 3, 100);
		purchases[5] = new PurchaseWithTranport(apple, 11, 25);

		/**
		 * Print the array content to the console (one element per line)
		 */
		System.out.println("Original array:");
		for (int i = 0; i < purchases.length; i++) {
			System.out.println(purchases[i].toString());
		}

		/**
		 * Sort an array on the cost decreasing by the method sort( ) of the
		 * class Arrays Print the array content to the console (one element per
		 * line)
		 */
		System.out.println("Sorted array:");
		Arrays.sort(purchases);
		for (int i = 0; i < purchases.length; i++) {
			System.out.println(purchases[i].toString());
		}
	}

}
