package CoreJava;

public class ThrowCustomException {
	
	//Thread.sleep(500);
	
	public void validateage(int age) {
		
		if(age<18) {
			throw new ArithmeticException("person is not eligible for voting");
		}else {
			System.out.println("The person is eligible for voting");
		}
	}
	
	public static void main(String[] args) {
		ThrowCustomException obj = new ThrowCustomException();
		
		obj.validateage(16);
	}

}
