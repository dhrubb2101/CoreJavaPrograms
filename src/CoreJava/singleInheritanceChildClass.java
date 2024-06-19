package CoreJava;

public class singleInheritanceChildClass extends MultiInheritanceMiddleClass {
		
		String EmpBU = "HR";
		
		public void getemployeeBU() {
			
			System.out.println("The employee name is" + EmpBU);
		}
		
		public static void main(String[] args) {
			
			singleInheritanceChildClass obj = new singleInheritanceChildClass();
			
			//PArent class
			
			obj.getemployeedetails();
			
			//child class data 
			
			obj.getemployeeBU();	
			
			//Middle class data
			
			obj.empchildetails();
		}

	}


