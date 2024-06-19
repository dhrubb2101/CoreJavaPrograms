package CoreJava;

public class HierarchialInheritanceClassChild1 extends HierarchialInheritanceParentClass {
	
	String CompanyS = "Google India";
	
	String baselocation = "Bengaluru";

	public void companycountrydetails() {
		
		System.out.println("The company in country is " + CompanyS);
		
		System.out.println("The location in country is " + baselocation);
	
	}
	
	public static void main(String[] args) {
		
		HierarchialInheritanceClassChild1 obj = new HierarchialInheritanceClassChild1();
		
		obj.companycountrydetails();
		
		obj.getcompanydetails();
	}
	
	

}
