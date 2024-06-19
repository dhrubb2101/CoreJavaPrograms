package CoreJava;

public class InterfaceSubclass implements interfaceA {
	
	public void readdata() {
		System.out.println("reading");
	}
	
	public void write() {
		System.out.println("writing");
	}

	public static void main(String[] args) {
		InterfaceSubclass obj = new InterfaceSubclass();
		
		System.out.println(S1);
		
		obj.readdata();
		obj.write();
		
	}

}
