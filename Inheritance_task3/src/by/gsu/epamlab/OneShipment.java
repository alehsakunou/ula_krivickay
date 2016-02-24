package by.gsu.epamlab;
/**
 * The class "OneShipment" describe one shipment
 * 
 *  @author Yuliya Krivitskaya
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OneShipment {

	/** List of shipments */
	List<Shipment> shipments;

	/**
	 * Constructor
	 */
	public OneShipment() {
		shipments = new ArrayList<Shipment>();
	}

	/**
	 * Add weight of people
	 * 
	 * @param loadWeight
	 *            - weight of passengers
	 */
	public void AddPeople(double loadWeight) {
		shipments.add(new People(KindShipment.People, loadWeight));
	}

	/**
	 * Add weight of the cargo on the rectangular container
	 * 
	 * @param length
	 *            - length of container
	 * @param width
	 *            - width of container
	 * @param height
	 *            - height of container
	 * @param density
	 *            - density of the cargo
	 */
	public void AddRectangularContainer(double length, double width, double height, double density) {
		shipments.add(new RectangularContainer(KindShipment.RectangularContainer, length, width, height, density));
	}

	/**
	 * Add weight of the cargo on the platform
	 * 
	 * @param loadWeight
	 *            - weight of the cargo on the platform
	 */
	public void AddPlatform(double loadWeight) {
		shipments.add(new Platform(KindShipment.Platform, loadWeight));
	}

	/**
	 * Add weight of the cargo on the tank
	 * 
	 * @param radius
	 *            - radius of tank
	 * @param height
	 *            - height of tank
	 * @param density
	 *            - density of the cargo
	 */
	public void AddTank(double radius, double height, double density) {
		shipments.add(new Tank(KindShipment.Tank, radius, height, density));
	}

	/**
	 * Print all kind of the cargo on the console
	 */
	public void printAll() {
		for (Shipment shipment : shipments) {
			System.out.println(shipment.toString());
		}
	}

	/**
	 * Specifies whether to put all kind of the cargo
	 * 
	 * @param capacity
	 *            - capacity of the ferry
	 * @return true or false
	 */
	public boolean IsPlacedAll(double capacity) {
		double allWeight = 0.0;
		for (Shipment shipment : shipments) {
			allWeight += shipment.totalWeight();
		}
		if (allWeight <= capacity) {
			return true;
		}
		return false;
	}

	/**
	 * Sort by Category (first People, than Rectangular Container, Platform,
	 * Tank)
	 */
	public void sortByCategory() {
		Collections.sort(shipments, new KindComparator<Shipment>());
	}

	public List<Shipment> getShipments() {
		return shipments;
	}
}
