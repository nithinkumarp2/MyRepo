class count_owels_in_each_word 
{
	public static void main(String[] args) 
	{
		String str="hello good morning";
		String ch[]=str.split(" ");
		int count=0;
		int n=ch.length-1;
		for (int i=0;i<=n ;i++ )
		{
			String ch2=ch[i];
			int count1=0;
			for (int j=0;j<=ch2.length()-1 ;j++ )
			{
				char ch1=ch2.charAt(j);
				if (ch1=='a'||ch1=='A'||ch1=='e'||ch1=='E'||ch1=='i'||ch1=='I'||ch1=='o'||ch1=='O'||ch1=='u'||ch1=='U')
				{
					count1++;
				}
			}
			count=count1;
			System.out.println(count+"="+ch2 );
		}
		
	}
}
