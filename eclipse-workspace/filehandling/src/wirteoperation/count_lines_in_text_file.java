package wirteoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class count_lines_in_text_file {

	public static void main(String[] args) throws IOException {
		 File f=new File("./sample1.txt");
		 
		 BufferedReader br=new BufferedReader(new FileReader(f));
		 String str="";
		 int count=0;
		 while((str=br.readLine())!=null)
		 {
			 count++;
			 System.out.println(str);
		 }
         System.err .println("number of lines in a text file is "+count);
	}

}
