package CoreJava;

public class StaticVariable {
 	
	static String S1 = "Bangalore";
	
	public static void read() {
		
		System.out.println("Reading the static method");
		
	}

	public static void main(String[] args) {
		
		System.out.println(S1);
		
		read();

	}

}
