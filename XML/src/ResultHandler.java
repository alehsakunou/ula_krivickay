import org.xml.sax.helpers.DefaultHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 * Class override methods of DefaultHandler, which helps load data from the file
 * into the collection Student
 * 
 * @author Yuliya Krivitskaya
 *
 */

public class ResultHandler extends DefaultHandler {

	/** boolean field */
	boolean bLogin = false;

	/** the collection of Student */
	List<Student> students = new ArrayList<Student>();

	/** login name */
	String login;

	/**
	 * Override method startElement return adding to collection if element has
	 * attributes
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase("login")) {
			// makes a mark if find start element "login"
			bLogin = true;
		}
		if (qName.equalsIgnoreCase("test")) {
			String test = attributes.getValue("name");
			String date = attributes.getValue("date");
			String mark = attributes.getValue("mark");
			// add into collection
			students.add(new Student(login, test, parseDate(date), parseMark(mark)));
		}
	}

	/**
	 * Override method endElement
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("login")) {
			// makes a mark if find end element "login"
			bLogin = false;
		}
	}

	/**
	 * Override method characters
	 */
	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		// if element "login" , field login is set
		if (bLogin) {
			login = new String(ch, start, length);
		}
		new String(ch, start, length);
	}

	/**
	 * Print the collection in the format: student;test;date;mark
	 */
	public void print() {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	/**
	 * Parse Date from string
	 * 
	 * @param date - string date
	 * @return date as object Date
	 */
	private Date parseDate(String date) {
		SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
		Date t = new Date();
		try {
			t = ft.parse(date);
		} catch (ParseException e) {
		}
		return t;
	}

	/**
	 * Parse Mark from string to Integer
	 * 
	 * @param mark - string mark
	 * @return integer mark
	 */
	private int parseMark(String mark) {
		String[] params;
		params = mark.split("\\.");
		String m = params[0] + params[1];
		int mar = Integer.parseInt(m);
		return mar;
	}

}
