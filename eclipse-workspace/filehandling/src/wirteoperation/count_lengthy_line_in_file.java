package wirteoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class count_lengthy_line_in_file {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		File f=new File("./sample1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int asciicode;
		String str="";
		int max=0;	int count1=0; int count=0;
		while((str=br.readLine())!=null)
		{ max++;
		while((asciicode=br.read()) !=-1)
		{
			 count++;
                  
                   count1=max;
	//		count=count1;
		//	System.out.println(count);
			
		}
		if(max<count1)
		{
			System.out.println(max);
		}
		}
		 
	}

}
