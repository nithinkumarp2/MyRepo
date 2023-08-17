package programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class bfrreader {

	public static void main(String[] args) throws IOException {
	        File f=new File("./sample.txt");
	        if (!f.exists())
	        {
	        	f.createNewFile();
	        }
             FileReader fis = new FileReader(f);
             BufferedReader br=new BufferedReader(fis);
             String str="";
             while((str=br.readLine())!=null)
             {
            	 System.out.println(str);
             }
	}

}
