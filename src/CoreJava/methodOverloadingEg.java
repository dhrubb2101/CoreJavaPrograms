package CoreJava;

public class methodOverloadingEg {
	
	//same method add() with 2 parameters 
	
	public static void add(int a,float b) {
		float c = a + b;
		
		System.out.println(c);
		
	}
		
	//same method add() with 3 parameters 
		
	public static void add(int a,float b,int c) {
		float d = a + b + c;
			
		System.out.println(c);
	}
	
	//same method add() with 4 parameters 
	
    public static void add(int a,float b,int c,int d) {
	    float e = a + b + c+d;
				
		System.out.println(e);
	}
    
    //same method add() with 5 parameters 
	
    public static void add(int a,float b,short c,int d,int e) {
	    float g = a + b + c + d + e;
				
		System.out.println(g);
	}
		
	
	public static void main(String[] args) {
		
		
		add(1,2.6f);
		
		add(1,4.6f,3389);
		
		add(1,2.6f,6787,89);
		
	

	}

}
