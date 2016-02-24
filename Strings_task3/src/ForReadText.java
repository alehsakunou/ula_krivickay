import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class helps remove spaces between groups of categories in monies and
 * Convert the date to the English-language format Month day, year
 * 
 * @author Yuliya Krivitskaya
 *
 */
public class ForReadText {

	public ForReadText() {
	}

	/**
	 * Method find incorrect format of monies and convert to correct: sum
	 * belarusian roubles or sum blr, where the sum – a sum of money
	 * 
	 * @param line
	 *            - input line
	 * @return correct line
	 */
	public String replaceSpace(String line) {

		Pattern pattern = Pattern.compile(
				"((([0-9]{1,3})\\s*)blr)|(([0-9]{1,2}\\s*(([0-9]{3})\\s*)+)blr)|(((\\s*[0-9]{1,3})\\s*)belarusian)|(([0-9]{1,2}\\s*(([0-9]{3})\\s*)+)belarusian)");
		Matcher m = pattern.matcher(line);

		StringBuffer bufStr = new StringBuffer();
		while (m.find()) {
			// find pattern
			String rep = m.group();
			// remove space
			Pattern space = Pattern.compile("\\s*");
			String newstr = space.matcher(rep).replaceAll("");

			m.appendReplacement(bufStr, newstr);
		}
		m.appendTail(bufStr);
		String result = bufStr.toString();
		// add space between word and sum
		return replaceS(result);
	}

	/**
	 * Supplementary method - add space between word and sum
	 * 
	 * @param group
	 *            - pattern line of monies without any space
	 * @return
	 */
	private String replaceS(String group) {
		Pattern pattern2 = Pattern.compile("blr|belarusian");
		Matcher m2 = pattern2.matcher(group);
		StringBuffer bufStr = new StringBuffer();
		while (m2.find()) {
			String rep = m2.group();
			m2.appendReplacement(bufStr, " " + rep);
		}
		m2.appendTail(bufStr);
		String result = bufStr.toString();

		return result;
	}

	/**
	 * Method convert the date with point to the English-language format Month
	 * day, year
	 * 
	 * @param line
	 *            - input line
	 * @return correct line
	 */
	public String replaceDateWithPoint(String line) {
		Pattern pattern = Pattern.compile("[0-9]{1,2}\\.[0-9]{1,2}\\.[0-9]{2}");
		Matcher m = pattern.matcher(line);

		StringBuffer bufStr = new StringBuffer();
		while (m.find()) {
			String rep = m.group();
			String newstr = newDatePoint(rep);
			m.appendReplacement(bufStr, newstr);
		}
		m.appendTail(bufStr);
		String result = bufStr.toString();
		return replaceS(result);
	}

	/**
	 * Supplementary method convert date
	 * 
	 * @param line
	 *            - input line
	 * @return correct line
	 */
	private String newDatePoint(String line) {
		SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yy");

		Date t = new Date();
		try {
			t = ft.parse(line);
		} catch (ParseException e) {
		}
		String str = String.format(Locale.ENGLISH, "%tB %<te, %<tY", t);
		return str;
	}

	/**
	 * Method convert the date with slash to the English-language format Month
	 * day, year
	 * 
	 * @param line
	 *            - input line
	 * @return correct line
	 */

	public String replaceDateWithSlash(String line) {
		Pattern pattern = Pattern.compile("[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}");
		Matcher m = pattern.matcher(line);

		StringBuffer bufStr = new StringBuffer();
		while (m.find()) {
			String rep = m.group();
			String newstr = newDateSlash(rep);
			m.appendReplacement(bufStr, newstr);
		}
		m.appendTail(bufStr);
		String result = bufStr.toString();

		return replaceS(result);
	}

	/**
	 * Supplementary method convert date
	 * 
	 * @param line
	 *            - input line
	 * @return correct line
	 */
	private String newDateSlash(String line) {
		SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
		Date t = new Date();
		try {
			t = ft.parse(line);
		} catch (ParseException e) {
		}
		String str = String.format(Locale.ENGLISH, "%tB %<te, %<tY", t);
		return str;
	}

}
