package CoreJava;

public class LocalVariables {
	
	public void add() {
		
		int a = 23;
		
		int b = 24;
		
		int c = a + b;
		
		System.out.println(c);
	}
	
	public void sub() {
		
		int a = 23;
		
		int b = 24;
		
		int c = a + b;
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		LocalVariables obj = new LocalVariables();
		
		obj.add();
		obj.sub();
	}

}
