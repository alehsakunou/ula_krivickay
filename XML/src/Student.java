import java.util.Date;

/**
 * Class describe Student and his tests
 * 
 * @author Yuliya Krivitskaya
 *
 */
public class Student {
	/** field login is name of student, test is name of test */
	String login, test;
	/** field mark of passed test */
	int mark;
	/** date of passed test */
	Date date;

	/**
	 * Constructor
	 * 
	 * @param login
	 *            - name of student
	 * @param test
	 *            - name of test
	 * @param date
	 *            - date of passed test
	 * @param mark
	 *            - mark of passed test
	 */
	public Student(String login, String test, Date date, int mark) {
		super();
		this.login = login;
		this.test = test;
		this.date = date;
		this.mark = mark;
	}

	/**
	 * Override method in the format: student;test;date;mark
	 */
	@Override
	public String toString() {
		// string format of date
		String strdate = String.format("%1$tY.%1$tm.%1$td", date);
		return login + ";" + test + ";" + strdate + ";" + mark / 10 + "," + mark % 10;
	}

}
