package CoreJava;

public class ObjectEg {
	
	//data
	String employename ="John";
	String empBU       ="HR";
	
	//method		
			
	public void displayemp() {
		System.out.println("Employee is a person from Delhi");
	}
			

	public static void main(String[] args) {
		
		ObjectEg obj = new ObjectEg();
		
		System.out.println(obj.empBU);
		
		System.out.println(obj.employename);
		
		obj.displayemp();
		
		
		
	}

}
