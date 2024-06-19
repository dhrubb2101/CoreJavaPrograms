package CoreJava;

public class IfElseEg {
	
	public void agevalidate(int age) {
		if(age >18) {
			System.out.println("eligible for voting");
		}
	}


	public static void main(String[] args) {
		IfElseEg obj = new IfElseEg();
		
		obj.agevalidate(17);
	}
		
		

}
