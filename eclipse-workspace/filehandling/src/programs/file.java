package programs;

import java.io.File;
import java.io.IOException;

public class file {

		public static void main(String[] args) throws  IOException  {
//			 File f = new File("F:\\testfiles\\resume.txt");//("f:/resume.txt");
//			 if (f.exists()) {
//				f.delete();
				//System.out.println( f.createNewFile());
//			}
			//System.out.println(f.exists());
			//System.out.println(f.delete());
		    // System.out.println(f.createNewFile());   
	          //System.out.println(f.isHidden());
//			 System.out.println(f.canWrite());
//			 f.setWritable(true);
//			 System.out.println(f.canWrite());
		
		File f = new File("./resources/");
		 System.out.println(f.mkdir());
		 f.delete();
		}

	}
	 

