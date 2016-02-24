package by.gsu.epamlab;

/**
 * The class "Tank" implements interface "Shipment" This class describes the
 * weight of the cargo transported on the tank
 * 
 * @author Yuliya Krivitskaya
 *
 */

public class Tank implements Shipment {

	/** Category of KindShipment (enum) */
	public KindShipment kind;

	/** Weight of shell */
	public double shellWeight = 30.7;

	/** Size of tank */
	private double radius;
	private double height;
	private double density;

	/**
	 * Constructor
	 */
	public Tank(KindShipment kind, double radius, double height, double density) {
		this.kind = kind;
		this.radius = radius;
		this.height = height;
		this.density = density;
	}

	/**
	 * Calculate weight of cargo
	 */
	public double loadWeight() {
		return Math.PI * Math.pow(radius, 2.0) * height * density;
	}

	/**
	 * Calculate weight of cargo with shell
	 */
	public double totalWeight() {
		return loadWeight() + shellWeight;
	}

	/**
	 * Returns a string representation of the object
	 */
	@Override
	public String toString() {
		return kind + ";" + totalWeight();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}

	public KindShipment getKind() {
		return kind;
	}

	public void setKind(KindShipment kind) {
		this.kind = kind;
	}

}
