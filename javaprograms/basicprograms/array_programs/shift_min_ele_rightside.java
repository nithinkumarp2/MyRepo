class shift_min_ele_rightside 
{
	public static void main(String[] args) 
	{
		int[] a={6,2,5,1};
		int n=a.length-1;
		for (int i=0;i<=n ;i++ )
		{
			for (int j=i+1;j<=n-1 ;j++ )
			{
				if (a[j]<a[i])
				{
				 a[i]=a[j];
				break;
				}
			}
			a[n]=0;
		}
		for (int i=0;i<=n ;i++ )
		{
		System.out.println(a[i]);
		}
	}
}
