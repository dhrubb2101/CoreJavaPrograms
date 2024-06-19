package CoreJava;

public class subClass extends AbstractClassEG {
	
	

	public static void main(String[] args) {
		
		subClass obj  = new subClass();
		System.out.println(S1);
		obj.studentdept();
		obj.studentname();
		
		

	}

	@Override
	void studentID() {
		System.out.println("This is my student ID please find yours");
		
	}

}
