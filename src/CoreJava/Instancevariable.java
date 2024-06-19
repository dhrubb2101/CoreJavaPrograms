package CoreJava;

public class Instancevariable { 
	
	        //class level variables - Global Scope
	
			String s1 = " New Delhi";
			
			int empid = 6789;
			
		    public void display() {
		    	int age =78;
		    	
		    	System.out.println(s1);
		}



	public static void main(String[] args) {
		
		Instancevariable obj = new Instancevariable();
		
		System.out.println(obj.s1);
		
		System.out.println(obj.empid);
		
		obj.display();		
	}		
}
