class reverseorder_in_array 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5,6};
		int n=a.length-1;
		int b[]=new int[n+1];
		for (int i=n;i>=0 ;i-- )
		{

            b[i]=a[i];
			System.out.println(b[i]);
		}
		System.out.println("-----------------------------------");
		//another way of reverese
		int c[]=new int[n+1];
		String s="";
		for (int i=0;i<n ;i++ )
		{
		//	
			for (int j=0;j<=n-1 ;j++ )
			{
				if (a[j]<a[j+1])
				{
				
				int ele=a[j];
				a[j]=a[j+1];
				a[j+1]=ele;
				// c[i]=ele;
			}
		}
		}  
			
		
		for (int k=0;k<=n ;k++ )
		{
			System.out.println(a[k]);
		}

		firsthalfreverse();
		secondhalfreverse();
	}  


 public static void firsthalfreverse()
	{
	 System.out.println("1st half reverse ");
	 int b[]={1,2,3,4,5,6};
		int n=b.length-1;
		int a[]=new int[n+1];
	 	for (int i=n/2;i>=0 ;i-- )
		{
		 
		
		 a[i]=b[i];
			
			System.out.println(a[i]);
		}  
			
		
		for (int k=0;k<=n ;k++ )
		{
		//	System.out.println(b[k]);
		}  
	}  

public static void secondhalfreverse()
	{
	 System.out.println("2st half reverse ");
	 int b[]={1,2,3,4,5,6};
		int n=b.length-1;
		int a[]=new int[n+1];
	 	for (int i=n;i>=n/2 ;i-- )
		{
		 
		
		 a[i]=b[i];
			
			System.out.println(a[i]);
		}  
			
		
//		for (int k=0;k<=n ;k++ )
		{
		//	System.out.println(b[k]);
		}
	}  

	}


