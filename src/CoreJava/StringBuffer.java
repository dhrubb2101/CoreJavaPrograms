package CoreJava;

public class StringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		s1 = sb.append("cheenai");
		StringBuffer s1 = SB.APPEND("Chennai");
		System.out.println(s1);
		
		//reverse
		System.out.println(s1.reverse());
		
		//insert
		System.out.println(s1.insert(0,"P"));
		
		//delete
		System.out.println(s1.delete(3,5));
		
		//capacity character maximum
		
		System.out.println(s1.capacity());
		
		//char count
		
		System.out.println(s1.length());
	}

}
