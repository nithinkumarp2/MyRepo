package programs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class scnrreading {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		 File f=new File("./sample.txt");
		 if (!f.exists())
		 {
			 f.createNewFile();
		 }
		 Scanner sc=new Scanner(f);
		 String str="";
		 while(sc.hasNext())
		 {
			 //System.out.println(sc.nextLine());
			 str += sc.nextLine()+"\n";
		 }
		 System.out.println(str);
		 sc.close();
	}

}
