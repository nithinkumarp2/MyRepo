class even_index_element_avg_in_array 
{
	public static void evenindex() 
	{
		int a[]={1,2,3,4,5,6,7,8};
		int n=a.length-1;
		int b[]=new int[n+1];
		
		int avg=0;
		int  sum=0;
		for (int i=0;i<=n ;i++ )
		{
			if (i%2==0&&i!=0)
			{
				b[i]=a[i];
				sum+=a[i];
			}
		
		//	if (b[i]!=0)
			{
          	avg=sum/b.length;
		}
		}
		System.out.println(avg+"  "+sum+"  "+b.length);
	}
        public static void oddindex()
		{
			int a[]={1,2,3,4,5,6,7,8};
		int n=a.length-1;
		int b[]=new int[n+1];
		
		int avg=0;
		int  sum=0;
		for (int i=0;i<=n ;i++ )
		{
			if (i%2!=0&&i!=0)
			{
				b[i]=a[i];
				sum+=a[i];
			}
		
		//	if (b[i]!=0)
			{
          	avg=sum/b.length;
		}
		}
		System.out.println(avg+"  "+sum+"  "+b.length);
		}
		public static void main(String[] args)
		{
			evenindex();
			oddindex();
		}
	
}
