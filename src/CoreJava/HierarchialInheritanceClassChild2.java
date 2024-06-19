package CoreJava;

public class HierarchialInheritanceClassChild2 extends HierarchialInheritanceParentClass {
	
	String CompanyP = "Google India";
	
	String baselocationP = "Bengaluru";
	
public void companycountrydetailsP() {
		
		System.out.println("The company in country is " + CompanyP);
		
		System.out.println("The location in country is " + baselocationP);
	
	}
	

	public static void main(String[] args) {
		
HierarchialInheritanceClassChild2 obj = new HierarchialInheritanceClassChild2();
		
		obj.companycountrydetailsP();
		
		obj.getcompanydetails();
		
		

	}

}
