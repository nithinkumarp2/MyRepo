package filereading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class inputstream {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
	
       File f=new File("./sample.txt");
       if(!f.exists()) {
    	   f.createNewFile();
       }
       FileInputStream fis= new FileInputStream(f);
       int asciicode;
       String str="";
       while ((asciicode=fis.read()) !=-1) {
		
    	   str += (char)asciicode;
    	  
	}
       System.out.println(str); 
      fis.close();
}
}