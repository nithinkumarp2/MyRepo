package exception;

  class nithinException extends Exception
{
 	public String toString() {
 		return "this is nithiin exception";
 	}
}

 
public class ownexception {
	public static void main(String[] args) {

        int a=10;
        int b=20;
		try
		{
			int c=a/b;
			System.out.println(c);
			
			throw new nithinException();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
