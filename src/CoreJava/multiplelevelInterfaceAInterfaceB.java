package CoreJava;

 class multiplelevelInterfaceAInterfaceB implements multiplelevelInterfaceA,multiplelevelInterfaceB{
	 
	 

	public static void main(String[] args) {
		multiplelevelInterfaceAInterfaceB obj = new multiplelevelInterfaceAInterfaceB();
		obj.employeehours();
		obj.officehours();

	}

	@Override
	public void employeehours() {
         System.out.println("This is my office hours " + a1);		
	}

	@Override
	public void officehours() {
		 System.out.println("This is my office hours " + a2);	
	}

}
