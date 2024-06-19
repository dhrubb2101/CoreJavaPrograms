package CoreJava;

import java.io.FileInputStream;

public class FileInputStreamEg {
	
	public static void  main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Desktop\\ex2 RS_Emp_Tran2 (002).txt");
					
					int content;
					
					while((content=fin.read()) !=-1) {
						
						System.out.print((char)content);

					}
		
					
					fin.close();
					
					
		    }catch(Exception e) {
		    	System.out.println(e);
		    }
		
		
	}

}
