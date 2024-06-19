package CoreJava;

import java.util.Vector;


public class VectorEg {

	public static void main(String[] args) {
		
		//maintains insertion order,allows duplicate values,allows null values, sync
		
		Vector<Integer> v= new Vector<Integer>();
		
		v.add(1);
		
		v.add(2);
		
		v.add(null);
		
		v.add(6);
		
		v.add(9);
		
		v.add(10);
		
		System.out.println(v);
		
		v.remove(0);
		
		System.out.println(v);
		
		System.out.println(v.contains("Peter")); 
		
		System.out.println(v.capacity());
		
		System.out.println(v.clone());
		

	}

}
