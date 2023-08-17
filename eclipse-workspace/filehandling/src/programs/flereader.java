package programs;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class flereader {
  @SuppressWarnings("resource")
public static void main(String[] args) throws IOException
  {
	  File f=new File("./sample.txt");
	  if (!f.exists())
	  {
		  f.createNewFile();
	  }
	  @SuppressWarnings("unused")
	FileReader fis= new FileReader(f);
	  String str="";
	  int asciicode;
	  while((asciicode=fis.read())!=-1)
	  {
		  str += (char)asciicode;
	  }
	  System.out.println(str);
	  fis.close();
  }
}
