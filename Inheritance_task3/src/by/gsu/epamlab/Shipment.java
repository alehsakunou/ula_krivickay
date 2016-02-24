package by.gsu.epamlab;

/**
 * Interface Shipment which implement various kinds
 * 
 * @author Yuliya Krivitskaya
 *
 */

public interface Shipment {

	/** Get kind */
	KindShipment getKind();

	/** Total weight */
	double totalWeight();

}
