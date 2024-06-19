package CoreJava;

public class StringExercises {

	public static void main(String[] args) {
		String s1 = "The quick brown fox jumps over the lazy dog.";
		String s2 ="   Java Exercises";
		//first exercise
		System.out.println(s1.substring(9));
		
		System.out.println(s1.substring(9,25));
		//second exercise
		
		System.out.println(s2.replace("   ","  "));
		
		//Third Exercise
		System.out.println();
		
		//6th Exercises
		int count = 0;
		String s3 = "Dhrrubbb";
		for(int i=0;i<s3.length();i++) {
			char ch = s3.charAt(i);
			if(ch>='A' && ch<='Z') {
				count++;
				
			}
			System.out.println(count);
		}
		

	}

}
