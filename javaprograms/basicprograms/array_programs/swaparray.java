class swaparray 
{
	public static void main(String[] args) 
	{
		int []a={16,17,4,5,2,15,0,1,1,33};
		int n=a.length-1;
		for (int i=0;i<=n ;i++ )
		{
		//	for (int j=i+1;j<n ;j++ )
		for (int j=0;j<=n-1 ;j++ )
			{
				//if (a[j]<a[i])
                     if (a[j]>a[j+1])
				{
						 int ele=a[j];
						 a[j]=a[j+1];
						 a[j+1]=ele;

                       //int ele=a[i];
                       //a[i]=a[j];
					   //a[j]=ele;
				}
			}
		}
		int n1[]=new int[n+1];
		for (int i=0;i<=n1.length-1 ;i++ )
		{
			for (int j=0;j<=a.length-2 ;j++ )
			{
				if (a[i]!=a[j+1])
				{

                      a[i]=n1[j];
				}
			}
		}
		for (int k=0;k<=n1.length-1 ;k++ )
		{
		System.out.println(n1[k]);
		}
	}
}
