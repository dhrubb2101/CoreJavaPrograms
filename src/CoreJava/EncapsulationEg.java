package CoreJava;

public class EncapsulationEg {
	
	private int empID;
	
	private String empname;
	
	//getter method 
	
	public void getempID()
	{
		System.out.println("My name is " + empname);
		
	}
	
	//getter method 
	
	
	public void getempname() {
		
		System.out.println("My Employee id is" + empID );
	}
	
	//setter method
	
	public void setid(int n) {
		this.empID = n;
	}
	
	//setter method

	
	public void setempname(String name) {
		
		this.empname = name;
	}
	
	public static void main(String[] args) {
		
		EncapsulationEg obj = new EncapsulationEg();
		
		obj.setid(78);
		
		obj.setempname("dhrubb");
		
		obj.getempID();
		
		obj.getempname();
		
	}
}


