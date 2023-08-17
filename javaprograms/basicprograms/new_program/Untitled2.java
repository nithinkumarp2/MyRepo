class whilepattern 
{
	public static void main(String[] args) 
	{
		int i=1,j=1;
		while (i<=5)
		{
			while (j<=5)
			{
				System.out.print("* ");
				j++;
			}
			System.out.print("  ");
			i++;
		}
		System.out.println();
	}
}
