package CoreJava;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class writingToFile {

	public static void main(String[] args) {
		
		try {
		    Path path = Paths.get("C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Desktop\\ex2 RS_Emp_Tran2 (002).txt");
		    
		    
			//FileOutputStream fout = new FileOutputStream("C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Desktop\\ex2 RS_Emp_Tran2 (002).txt");
			        
			
					String str = "Hi how are you";
					
					//fout.write(65);
					
					Files.writeString(path, str, StandardCharsets.UTF_8);
					
					//fout.close();
					
					
		    }catch(Exception e) {
		    	System.out.println(e);
		    }
		
	}

}
