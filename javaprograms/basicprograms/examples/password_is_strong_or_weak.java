class password_is_strong_or_weak 
{
	public static void main(String[] args) 
	{
		String str="Nithinkuamr123@";
		int n=str.length()-1;
		int uppercase=0;
		int lowercase=0;
		int digit=0;
		int symbol=0;
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (ch>=65&&ch<=90||ch>=97&&ch<=122)
			{
				if (ch>=65&&ch<=90)
				{
					uppercase++;
				}
				else
				{
					lowercase++;
				}
			}
			else 
			{	
			if (ch>=48&&ch<=57)
			{
				digit++;
			}
				else
			{
					symbol++;
			}
		}
		}
		if (uppercase>0&&lowercase>0&&digit>0&&symbol>0&&str.length()>8)
		{
			System.out.println("the gvien pasword is strong");
		}
		else
		{
		System.out.println("the given password is weak");
		}
	}
}
