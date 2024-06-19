package CoreJava;

public class SubClassInterface1a1b implements Interface1b {
	
	
	

	public static void main(String[] args) {
		
		SubClassInterface1a1b obj = new SubClassInterface1a1b();
		
		System.out.println(A);
		System.out.println(B);

		obj.readdata();
		obj.writedata();
		obj.singdata();

	}



	@Override
	public void singdata() {
		System.out.println("The singer of school is " + B);
		
	}



	@Override
	public void readdata() {
		System.out.println("The reader of school is " + A);
	}



	@Override
	public void writedata() {
		System.out.println("The writer of school is " + A);
	}

}
