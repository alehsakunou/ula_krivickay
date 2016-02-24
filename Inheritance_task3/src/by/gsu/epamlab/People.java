package by.gsu.epamlab;

/**
 * The class "People" implements interface "Shipment"
 * 
 * @author Yuliya Krivitskaya
 *
 */

public class People implements Shipment {

	/** Category of KindShipment (enum) */
	public KindShipment kind;

	/** Weight of crew */
	public double ñrew = 250.6;

	/** Weight of other people */
	private double loadWeight;

	/**
	 * Constructor
	 */
	public People(KindShipment kind, double loadWeight) {
		super();
		this.kind = kind;
		this.loadWeight = loadWeight;
	}

	/**
	 * Calculate weight of all people
	 */
	public double totalWeight() {
		return loadWeight + ñrew;
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
