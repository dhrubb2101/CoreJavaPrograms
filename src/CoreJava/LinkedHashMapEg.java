package CoreJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEg {

	public static void main(String[] args) {
		
		 Map<Integer,String> map = new LinkedHashMap<Integer,String>();
			
			map.put(100,"Seema");
			map.put(101,"Roza");
			map.put(102,"King");
			map.put(103,"Queen");
			map.put(104,"Roopa");
			map.put(105,"Jaya");
			map.put(106,null);
			map.put(107,"Seema");
			map.remove(108,"Jaya");
			map.put(109,"Jaya");
			map.put(110,"Jaya");
			map.put(null, "see");
			map.put(null,"sed");
			map.put(1, null);
			map.put(2, null);
			map.put(3, null);
			
			for(Map.Entry m:map.entrySet()) {
				System.out.println(m.getKey()+" "+ m.getValue());
		}
	}

}
	
