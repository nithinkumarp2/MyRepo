class  maxxx
{
	public static void main(String[] args) 
	{
		int a[]={8,10,12,18,81,32,53};
		int n=a.length-1;
		int  l=0;
		for (int i=0;i<=n ;i++ )
		{
			int max=a[i];
			for (int j=i;j<=n ;j++ )
			{
				if (a[i]<a[j])
				{
				//	a[i]=a[j];
                    //max=a[j];
					//a[i]=max;
					l=a[j];
				}
				l=max;
			}
		//	System.out.println(a[i]);
		}
		System.out.println(l);
	}
}
