package wirteoperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class bufrwriter {
    public static void main(String[] args) throws IOException {
		File f= new File("./sample1.txt");
//		if(f.exists())
//		{
//			f.createNewFile();
//		}
		String existingtxt= new String();
		String line="";
		BufferedReader br=new BufferedReader(new FileReader(f));
		while((line=br.readLine())!=null)
		{
			existingtxt+=line+"\n";
		}
		
		
		
		//Adding new text to files
		String str="how u rrrr";
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		bw.write(existingtxt + str);
		bw.close();
		
	}
}
