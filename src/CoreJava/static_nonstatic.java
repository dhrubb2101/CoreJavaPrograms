package CoreJava;

public class static_nonstatic {
	
	static String s1 = "bengaluru";
	int a = 2;
	int b = 3;	
	
	public static void read() {
		System.out.println("Read what is given");
	}
	
	public void sub1()
	{
		int c = a + b;
		System.out.println("Print the result");
	}
	
	public void sub() {
		int b1 = 34; //(you can't create objects inside methods they can only be created in main method)
		int c2 = 23;
	
	}

	
	public static void main(String[] args) {
		
		static_nonstatic obj = new static_nonstatic();
		
		System.out.println(s1);
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		read();
		
		obj.sub();
		
		obj.sub1();

	}
	
	
}
