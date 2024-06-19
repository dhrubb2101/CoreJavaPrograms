package CoreJava;

public class capatalizeStrings {

	public static void main(String[] args) {
		int count = 0;
		String s3 = "Dhrrubbb";
		for(int i=0;i<s3.length();i++) {
			char ch = s3.charAt(i);
			if(ch>='A' && ch<='Z') {
				count++;
				System.out.println(ch);
				
			}
			
		}
		System.out.println(count);

	}

}
