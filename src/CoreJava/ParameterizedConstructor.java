package CoreJava;

public class ParameterizedConstructor {
	
	ParameterizedConstructor(int x) {
		int y= x*x;
		System.out.println(y);
		
	}

	public static void main(String[] args) {
		
		ParameterizedConstructor obj = new ParameterizedConstructor(4);
		
	}

}
