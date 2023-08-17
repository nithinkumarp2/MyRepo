class  interview_example
{
	public static void main(String[] args) 
	{
		int[]a={3,4,5,1,2};
		int n=a.length-1;
		for (int i=0;i<=2  ;i++ )
		{
		   if (i>1)
		   {
			   System.out.println("yes");
		   }	
			for (int j=1;j<=n ;j++ )
			{
				//if (a[j]<a[j-1])
				{
			
                  int ele=a[j];
				  a[j]=a[j-1];
				  a[j-1]=ele;
			}
				}
		}
			for (int k=0;k<=n ;k++ )
		{

		System.out.println(a[k]);
		}
	}
}
