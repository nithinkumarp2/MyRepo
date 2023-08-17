class  nithin_ramuk
{
	public static void main(String[] args) 
	{
		String str="nithin kumar niiiiiithin";
		String [] str1=str.split(" ");
		String str2="";
		int n=str1.length-1;
		for (int i=0;i<n ;i++ )
		{
			String s=str1[i];
		//for (int k=0;k<1 ;k++ )
		{
		if(i%2!=0&&i!=0)
			{ 		
				for (int j=0;j<=s.length()-1 ;j++ )
				{
				
					char ch=s.charAt(j);
                    
			{   
					str2=ch+str2;

				}
					}
			}
		}
		System.out.print(s+" "+str2);
		}
		
	}
}
