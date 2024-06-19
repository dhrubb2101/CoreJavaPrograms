package CoreJava;

public class Exceptionarrayoutbound {

	public static void main(String[] args) {
		
		try {
			
			int a[] = new int [5];
			a[0]= 23;
			
			a[1]= 78;
			
			a[2]= 45;
			
			a[3]= 56;
			
			a[4]= 12;
			
			a[5]= 89;
			
			for(int i=0;i<a.length ; i++) {
				System.out.println(a[i]);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Close the connection");
		}
	}
}
