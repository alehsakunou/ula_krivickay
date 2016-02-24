package by.gsu.epamlab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class create the list of kind (len; num) from txt-file
 * 
 * @author Yuliya Krivitskaya
 *
 */
public class LenList {

	/** List of coordinates (len; num) */
	private List<Coordinate> coordinates;

	/**
	 * Constructor let the file contains double coordinates of segments (one per
	 * line) in the format:(x1;y1) (x2;y2) and create the list of kind (len;
	 * num)
	 */
	public LenList(String filename) {
		coordinates = new ArrayList<Coordinate>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename + ".txt"))) {
			// read to line
			String s;
			int num = 0;
			while ((s = br.readLine()) != null) {
				// count the number of segments of the length len
				num++;
				int len = createCoordinate(s);
				if (len > 0)
					coordinates.add(new Coordinate(len, num));
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Create the segment length rounded to integer from string
	 * 
	 * @param txtString
	 *            - string from .txt file
	 * @return the segment length rounded to integer if string is valid of
	 *         pattern or return -1 if not
	 */

	private int createCoordinate(String txtString) {

		// pattern of input line
		Pattern pattern = Pattern.compile(
				"\\s*\\(\\s*-?[0-9]+\\.?[0-9]*\\s*;\\s*-?[0-9]+\\.?[0-9]*\\s*\\)\\s*\\(\\s*-?[0-9]+\\.?[0-9]*\\s*;\\s*-?[0-9]+\\.?[0-9]*\\s*\\)");
		Matcher matcher = pattern.matcher(txtString);

		// if string matches
		if (matcher.find()) {
			String[] params;
			double[] doubleParams = new double[4];

			// replace spaces
			Pattern space = Pattern.compile("\\s*");
			String newstring = space.matcher(txtString).replaceAll("");
			// replace "("
			Pattern bracket = Pattern.compile("\\(");
			String newstr = bracket.matcher(newstring).replaceAll("");

			// split string to String[] separated by a semicolon
			params = newstr.split("[\\)\\(;]");

			// parse to Double from String[] element 0-3
			for (int i = 0; i < params.length; i++) {
				try {
					doubleParams[i] = Double.parseDouble(params[i]);
				} catch (NumberFormatException e) {
					System.out.println(e.getMessage());
				}
			}
			// Calculate len
			Coordinate t = new Coordinate();
			return t.getLen(doubleParams[0], doubleParams[1], doubleParams[2], doubleParams[3]);

		} else
			return -1;
	}

	/**
	 * Sort list by num
	 */
	public void sort() {
		Collections.sort(coordinates, new SortByNum<>());
	}

	/**
	 * Print list to console
	 */
	public void print() {
		for (Coordinate coordinate : coordinates) {
			System.out.println(coordinate.toString());
		}

	}

}
