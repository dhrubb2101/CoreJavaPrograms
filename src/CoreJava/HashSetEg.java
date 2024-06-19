package CoreJava;

import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
		
				//maintains no insertion order , it inserts values based on hashcode,do not allows duplicate values,allows null values,non sync
				
				HashSet<String> st = new HashSet<String>();
				
				st.add("Seema");
				st.add("Roza");
				st.add("King");
				st.add("Queen");
				st.add("Roopa");
				st.add("Jaya");
				st.add(null);
				st.add("Seema");
				System.out.println(st);
				st.remove("Jaya");
				System.out.println(st);
				System.out.println(st.contains("Peter"));

			}

		}


	


