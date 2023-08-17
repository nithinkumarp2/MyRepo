//write a program to check whether the fiven value is positive nunber or character or special chararrcter
class  Else_if_1
{
	public static void main(String[] args) 
	{
		int n=-10;
		char c='&';
		if (n>=0)
		{
			System.out.println("postive number");		
		}
			else if((c>='a')&&(c<='x'))
		{
		System.out.println("character");
		}
		else
		{
			System.out.println("special character");
		}
	}
}
