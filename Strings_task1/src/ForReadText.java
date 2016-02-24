import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The class read file, the initial element of any line has an index 0. Its
 * value determines the index of an element in the line. Sum of this value and
 * error string are counted
 * 
 * @author Yuliya Krivitskaya
 *
 */

public class ForReadText {

	/** Sum of elements, determined by zero elements */
	private double sum;

	/** Number of lines with “errors” */
	private int errorLine;

	/**
	 * Constructor let read csv-file and return sum and error
	 * 
	 * @param filename
	 *            - name of file
	 */
	public ForReadText(String filename) {
		try (BufferedReader br = new BufferedReader(new FileReader(filename + ".csv"))) {
			// read to line
			String s;
			while ((s = br.readLine()) != null) {
				try {
					sum += readCsvString(s);
				} catch (CsvLineException e) {
					// counter of error
					errorLine++;
				}
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public double readCsvString(String csvString) throws CsvLineException {
		String[] params;
		int index;
		double member;
		// split csvString to String[] separated by a semicolon
		params = csvString.split(";");
		try {
			// parse first element; value determines the index of an element in
			// the line
			index = Integer.parseInt(params[0]);
		} catch (NumberFormatException e) {
			throw new CsvLineException("Illegal param type", e);
		}
		try {
			// value of index -element
			member = Double.parseDouble(params[index]);
		} catch (NumberFormatException e) {
			throw new CsvLineException("Illegal param type", e);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new CsvLineException("Illegal param type", e);
		}
		return member;
	}

	/**
	 * Print result of input file
	 */
	public void print() {
		System.out.println("sum = " + sum + "\nerror-lines = " + errorLine);
	}

}
