package CoreJava;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		//maintains insertion order,allows duplicate values,allows null values,non sync
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Seema");
		list.add("Roza");
		list.add("King");
		list.add("Queen");
		list.add("Roopa");
		list.add("Jaya");
		list.add(null);
		list.add("Seema");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.out.println(list.contains("Peter"));

	}

}
