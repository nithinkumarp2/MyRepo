class sum_of_dublicate_elements_in_array 
{
	public static void main(String[] args) 
	{
		int[]a={81,31,31,32,5,3,5,83,65,70,32};
		int n=a.length-1;
		for (int i=0;i<=n ;i++ )
		{
			for (int j=0;j<=n-1 ;j++ )
			{
				if (a[j]>a[j+1])
				{
					int ele=a[j];
					a[j]=a[j+1];
					a[j+1]=ele;
				}
			//	System.out.println(a[j]);
			}
		}
		int sum=0;
		for (int k=0;k<=n-1 ;k++ )
		{
			if(a[k]==a[k+1]) 
			{
				sum=sum+a[k];
			}
		} 
            for (int i=0;i<=n ;i++ )
		{
			System.out.println(a[i]);
			//	System.out.println(sum);
		}
		
	}
}
