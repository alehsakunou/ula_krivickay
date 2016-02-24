import java.io.*;

public class Runner {

	public static void main(String[] args) {

		ForReadText m = new ForReadText();
		try (BufferedReader br = new BufferedReader(new FileReader("in.txt"))) {
			// read to line
			String s;
			while ((s = br.readLine()) != null) {
				// create string where remove spaces between groups of
				// categories in monies
				String withoutSpace = m.replaceSpace(s);
				// Convert the date to the English-language format
				String dateWithoutPoint = m.replaceDateWithPoint(withoutSpace);
				// Convert the date to the English-language format
				String dateWithoutSlash = m.replaceDateWithSlash(dateWithoutPoint);

				// !!! I don't know why but we should again remove space
				String j = m.replaceSpace(dateWithoutSlash);
				System.out.println(j);

				// write result to file out.txt
				BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt", true));
				writer.append(j);
				writer.append("\n");
				writer.flush();
				writer.close();
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
