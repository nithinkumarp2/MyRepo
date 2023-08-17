package wirteoperation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fle_op_strm {
      @SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	 File f=new File("./sample1.txt");
	 if(!f.exists())
	 {
		// f.delete();
		 f.createNewFile();
	 }
	 FileOutputStream fos=new FileOutputStream(f);
	 String str="assignment on file operation";
	    char[] s=str.toCharArray();
	// for(char ch=0;ch<=s.length-1;ch++)
		for(char ch:str.toCharArray()) 
	 {
		 fos.write((int)ch);
		 System.out.print(ch );
	 }
}
}
