package by.gsu.epamlab;

/**
 * Class describes of len and num and contain method of calculate len
 * 
 * @author Yuliya Krivitskaya
 *
 */

public class Coordinate {

	/** Coordinates of segments */
	private double x1, y1, x2, y2;

	/**
	 * len is the segment length rounded to integer and num is the number of
	 * segments of the length len
	 */
	private int len, num;

	public Coordinate() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param len - the segment length;
	 * @param num - the number of segments of the length;
	 */
	public Coordinate(int len, int num) {
		super();
		this.len = len;
		this.num = num;
	}

	/**
	 * Calculate the segment length
	 * 
	 * @param x1
	 *            - Coordinate x of first point
	 * @param y1
	 *            - Coordinate y of first point
	 * @param x2
	 *            - Coordinate x of second point
	 * @param y2
	 *            - Coordinate y of second point
	 * 
	 * @return integer length
	 */
	public int getLen(double x1, double y1, double x2, double y2) {
		return (int) Math.round(Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
	}

	/**
	 * Returns a string representation of the object with discount
	 * 
	 * @return string
	 */
	public String toString() {
		return len + ";" + num + ";";
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}
}