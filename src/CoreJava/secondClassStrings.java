package CoreJava;

public class secondClassStrings {

	public static void main(String[] args) {
				String s1 = "New Delhi";
				String s2 = "Mumbai";
				String s3 = "Greek&gods";
				String s4 = "Reema";
				String s5 = "Angel";
 	
				//equals
				System.out.println(s1.equals(s2));
			
				//concat
				System.out.println(s1.concat(s2));

				//contains
				System.out.println(s1.contains("z")); //false

				//substring
				System.out.println(s1.substring(4));
				System.out.println(s1.substring(0,3));

				// isEmpty

				System.out.println(s1.isEmpty());  //false

				//replace
				System.out.println(s1.replace("New","Old"));

				//ends with
				System.out.println(s1.endsWith("i"));

				//char at
				System.out.println(s1.charAt(8));
				
				//split
				
				String []arr=s3.split("@",4);
				for(String a:arr) {
					System.out.println(a);
				}
				
				//compare
				System.out.println(s1.compareTo(s2));
				
				System.out.println(s4.compareTo(s5));

				
				
	}
}