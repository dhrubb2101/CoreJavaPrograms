package CoreJava;

public class ExceptionHandlingEg {
	
	public static void main(String[] args)  {
		try {
			int a = 100;
			int c = 100/0;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
