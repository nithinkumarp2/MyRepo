class even_index_in_array 
{
	public static void main(String[] args) 
	{
		String[] s={"nithin","mota","akhil","vamshi"};
		int n=s.length-1;
		for (int i=0;i<=n ;i++ )
		{
			//int m=s[i].length()-1;
			if (i%2==0)
			{
				System.out.println(s[i]);
			}
		}
		
	}
}
