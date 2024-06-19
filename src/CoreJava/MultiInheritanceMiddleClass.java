package CoreJava;

public class MultiInheritanceMiddleClass extends SingleInheritanceParentClass {
	
	String Empchildname = "Tom Holland";
	
	String Empchildid = "1";
	
	public void empchildetails() {
		
		System.out.println("The employee's child name is " + Empchildname);
		
		System.out.println("The employee's child id is " + Empchildid);

	}

	public static void main(String[] args) {
		
		MultiInheritanceMiddleClass obj = new MultiInheritanceMiddleClass();
		
		obj.empchildetails();
		
		obj.getemployeedetails();		
		
		
	}

}
