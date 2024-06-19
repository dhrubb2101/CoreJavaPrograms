package CoreJava;

public class SuperChildEg extends SuperEg {
	
	String color = "red";
	
	public void displaycolor() {
		System.out.println(color);
		
		System.out.println(super.color);
		
		System.out.println(super.age);
		
		super.access();
	}

	public static void main(String[] args) {
		
		SuperChildEg obj = new SuperChildEg();
		obj.displaycolor();


	}

}
