package CoreJava;

public class ConstructorAsPrecondition {
	
	ConstructorAsPrecondition(){
		
		System.out.println("launching Browser");
	}
	
	public void testcase1() {
		System.out.println("Testcase 1 is executed");
	}
	public void testcase2() {
		System.out.println("Testcase 2 is executed");
	}
	

	public static void main(String[] args) {
		
		ConstructorAsPrecondition obj = new ConstructorAsPrecondition();
		
		obj.testcase1();
		obj.testcase2();

	}

}
