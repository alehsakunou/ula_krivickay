package by.gsu.epamlab;

/**
 * The class "Platform" implements interface "Shipment" Tis class describes the
 * weight of the cargo transported on the platform
 * 
 * @author Yuliya Krivitskaya
 *
 */
public class Platform implements Shipment {

	/** Category of KindShipment (enum) */
	public KindShipment kind;

	/** Weight of shell */
	public double shellWeight = 0.0;

	/** Weight of the cargo */
	private double loadWeight;

	/**
	 * Constructor
	 */
	public Platform(KindShipment kind, double loadWeight) {
		this.kind = kind;
		this.loadWeight = loadWeight;
	}

	/**
	 * Calculate weight of cargo with shell
	 */
	public double totalWeight() {
		return loadWeight + shellWeight;
	}

	/**
	 * Returns a string representation of the object
	 */
	@Override
	public String toString() {
		return kind + ";" + totalWeight();
	}

	public double getLoadWeight() {
		return loadWeight;
	}

	public void setLoadWeight(double loadWeight) {
		this.loadWeight = loadWeight;
	}

	public KindShipment getKind() {
		return kind;
	}

	public void setKind(KindShipment kind) {
		this.kind = kind;
	}

}
