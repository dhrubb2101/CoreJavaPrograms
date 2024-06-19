package CoreJava;

public class MethodwithParameters {
	
	public int add(int a,int b) {
		int c = a + b;
		return c;
	}
	

	public static void main(String[] args) {
		
		MethodwithParameters mp = new MethodwithParameters();
		System.out.println(	mp.add(4, 7));
		System.out.println(	mp.add(4, -7));
		System.out.println(	mp.add(-4, 7));
		System.out.println(	mp.add(-4, -7));
	
		
		

	}

}
