package CoreJava;

abstract class AbstractClassEG {
	
	static String S1 = "KLE college of engineering";
	
	//concrete method
	
	public void studentdept() {
		
		System.out.println("The student belongs to CS dept");
	}

	//abstract  
	
	abstract void studentID();
	
	//final
	
	public final void studentname() {
		System.out.println("The student name is Rama");
	}
	
	//constructors
	
	AbstractClassEG(){
		System.out.println("The student batch year is 2022");
	}
}
