 class array1 
{
	public static void main(String[] args) 
	{
		String[] a={"manish","akhil","nithin"};
		
		for (int i=0;i<a.length;i++)
		{
			int count=0,c1=1;
			for (int j=0;j<a[i].length() ;j++ )
			{
				char ch=a[i].charAt(j);
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					count++;
				}
				if (count==c1)
         		{

		        }
              		System.out.println(ch);

			}
		}
		
	}
}
