package CoreJava;

public class methodOveridingChildClass extends methodOveridingParentClass {
	
	String companyP = "Adobe";
	int employeeid = 46;
	
	
	public void companyemployeedetails()
	{
		System.out.println("You are genuis, you are in " + companyP);
		System.out.println("and your employee ID is " + employeeid);
		
		
	}
	public static void main(String[] args) {
		
		methodOveridingChildClass obj = new methodOveridingChildClass();
		
		obj.companyemployeedetails();
		System.out.println(obj.employeeid);
		System.out.println(obj.companyP);
		
		

	}

}
