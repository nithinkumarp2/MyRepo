class  character_print_in_array
{
	public static void main(String[] args) 
	{ 
		String[] s={"kantara","rrr","kgf"};
		for (int i=0;i<=s.length-1 ;i++ )
		{
			for (int j=0;j<=s[i].length()-1 ; j++)
			{
				char ch=s[i].charAt(j);
				System.out.println( ch);
			}
			System.out.println();
		}
		
	}
}
