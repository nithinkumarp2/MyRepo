class dublicatestring_using_array 
{
	public static void main(String[] args) 
	{
		String str="nithin";
		char[] c=str.toCharArray();
		int n=c.length-1;
		for (int i=0; i<=n; i++)
		{
		String str1="";
			char[] c1=str.toCharArray();
			int n1=c1.length-1;
			char ch=c[i];
			for (int j=0;j<=n ;j++ )
			{
				char ch1=c[j];
				if (ch==ch1)
				{
					ch=ch1;
						str1=str1+ch;
				}
				//str1=str1+ch1;
				//ch=ch1;
				//System.out.println(str1);
	     //   str=str1;
			}
			//if (ch==ch1)
			{
                  
			}
	
		System.out.println(str1);
	}
}
}





//		String str4="nithin";
//		int n=str4.length()-1;
//		String str5="";
//		for (int i=0;i<=n ;i++ )
//		{
//			char ch=str4.charAt(i);
//			
//			int n1=str5.length()-1;
//			boolean res=false;
//			for (int j=0;j<=n1 ;j++ )
//			{
//				char ch1=str5.charAt(j);
//				if (ch1==ch)
//				{
//					res=true;
//				}
//			}
//			if (res==false)
//			{
//				str5=str5+ch;
//				System.out.println(str5);
//			}
//		}
//	}
//}