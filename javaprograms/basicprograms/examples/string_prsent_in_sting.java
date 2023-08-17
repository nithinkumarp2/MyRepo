class string_prsent_in_sting 
{
	public static void main(String[] args) 
	{
		String[] str={"naveen","av"};
		int n=str.length-1;
		for (int i=0; i<=n;i++ )
		{
			String s=str[i];
			//char [] ch=s.toCharArray();
			for (int j=;j<=str.length-1 ;j++ )
			{
              if (str[i]==str[j])
              {
                 System.out.println("yes"+str[i]+"=="+str[j]);
              }         
			}
		}
		System.out.println("Hello World!");
	}
}
