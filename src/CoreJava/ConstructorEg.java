package CoreJava;

public class ConstructorEg {
	
	int id;
	String name;
	
	public void write() {
		System.out.println("Writing");
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		ConstructorEg obj = new ConstructorEg();		
		obj.write();
		
	}

}
