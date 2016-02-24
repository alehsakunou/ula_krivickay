import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Runner {

	public static void main(String[] args) {
		 try {	
	         File inputFile = new File("results.xml");
	         SAXParserFactory factory = SAXParserFactory.newInstance();
	         SAXParser saxParser = factory.newSAXParser();
	         ResultHandler resultHandler = new ResultHandler();
	         saxParser.parse(inputFile, resultHandler); 
	         resultHandler.print();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }   
	}
