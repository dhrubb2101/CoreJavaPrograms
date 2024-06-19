package CoreJava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEg {

			public static void main(String[] args) {
				
						//maintains insertion order ,do not allows duplicate values,not allows null values,non sync
						
						TreeSet<String>al = new TreeSet<String>();
						
						al.add("Seema");
						al.add("Roza");
						al.add("King");
						al.add("Queen");
						al.add("Roopa");
						al.add("Jaya");
						al.add(null);
						al.add("Seema");
						System.out.println(al);
						al.remove("Jaya");
						System.out.println(al);
						System.out.println(al.contains("Peter"));
						//Traversing elements
						Iterator<String>itr = al.iterator();
						while(itr.hasNext()) {
							System.out.println(itr.next());

					}

				}

}
