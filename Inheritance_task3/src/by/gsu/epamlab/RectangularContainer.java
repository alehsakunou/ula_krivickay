package by.gsu.epamlab;

/**
 * The class "RectangularContainer" implements interface "Shipment" This class
 * describes the weight of the cargo transported on the rectangular container
 * 
 * @author Yuliya Krivitskaya
 *
 */

public class RectangularContainer implements Shipment {

	/** Category of KindShipment (enum) */
	public KindShipment kind;

	/** Weight of shell */
	public double shellWeight = 15.2;

	/** Size of container */
	private double length;
	private double width;
	private double height;
	private double density;

	/**
	 * Constructor
	 */
	public RectangularContainer(KindShipment kind, double length, double width, double height, double density) {
		super();
		this.kind = kind;
		this.length = length;
		this.width = width;
		this.height = height;
		this.density = density;
	}

	/**
	 * Calculate weight of cargo
	 */
	public double loadWeight() {
		return length * width * height * density;
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

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
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
