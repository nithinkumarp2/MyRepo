package wirteoperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class flewirte {

	public static void main(String[] args) throws IOException {
		 File f=new File("./sample1.txt");
		 if(f.exists())
		 {
			 f.createNewFile();
		 }
		 String str="assignment on the file handing";
		 FileWriter fw= new FileWriter(f);
		 fw.write(str);
		 //System.out.println();
		 fw.close();
	}

}
