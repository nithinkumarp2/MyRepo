class interview_exam 
{
	public static void main(String[] args) 
	{  
		int a[]={1,0,2,6,0,4};
		int n=a.length-1;
		for (int i=0; i<=n ;i++ )
		{
		for (int k=0; k<=n ;k++ )
		{	
				for (int j=0;j<=n-1 ;j++ )
				{
					if (a[i]==0)
			{
					if (a[j]<a[j+1])
					{
						int ele=a[j];
						a[j]=a[j+1];
						a[j+1]=ele;
					}
				}
				
			}
		}
			System.out.println(a[i]);
		}
		
        for (int i=0; i<=n ;i++ )
		{
			
		
		}
		System.out.println("Hello World!");
	}
}
