package by.gsu.epamlab;

public class Runner {

	public static void main(String[] args) {
		
		// create List from the txt file
		LenList list=new LenList("in");
		
		// Sort the list on descending the field num
		list.sort();
		list.print();
		

	}

}
