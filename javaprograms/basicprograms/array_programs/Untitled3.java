class max_value_to_right_handside 
{
	public static void main(String[] args) 
	{
		int[]a={2,8,6,4};
		int n=a.length-1;
		for (int i=0;i<=n ;i++ )
		{
          if (a[i]>a[i+1])
          {
			  int ele=a[i];
			  a[i]=a[i+1];
			  a[i+1]=ele;
          }
		  System.out.println(a[i]);
		}
		
	}
}
