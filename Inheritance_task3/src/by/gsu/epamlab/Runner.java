package by.gsu.epamlab;

public class Runner {

	public static void main(String[] args) {

		/**
		 * One Shipment
		 */
		OneShipment oneShipment = new OneShipment();
		oneShipment.AddTank(20.1, 15, 60);
		oneShipment.AddPeople(60.3);
		oneShipment.AddRectangularContainer(2.0, 9.4, 1.2, 2);
		oneShipment.AddPlatform(56.9);

		/**
		 * Print the array content to the console (one element per line)
		 */
		System.out.println("Original array:");
		oneShipment.printAll();

		/**
		 * Sort an array on the cost decreasing by the method sort( ) of the
		 * class Arrays
		 */
		System.out.println("Sorted array:");
		oneShipment.sortByCategory();

		/**
		 * Print the array content to the console (one element per line)
		 */
		oneShipment.printAll();

		/**
		 * Determine whether a given transport ferry cargo and people
		 */
		double capacity = 1150000.0;
		boolean IsPlaced = oneShipment.IsPlacedAll(capacity);
		System.out.println("The capacity - " + capacity + " whether to put the whole cargo:" + IsPlaced);
	}

}
