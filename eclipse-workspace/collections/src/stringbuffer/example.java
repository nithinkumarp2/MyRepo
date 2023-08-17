package stringbuffer;

public class example {

	public static void main(String[] args) {
		 StringBuffer s=new StringBuffer("nithin");
		 s.append(" kumar");
		 s.deleteCharAt(6);
		 s.delete(0, 1);
		 s.insert(0, 'n');
		// s.reverse();
		 s.replace(0, 6, "N");
		 s.replace(1, 6, "K");
		 System.out.println(s);
		 
	}

}
