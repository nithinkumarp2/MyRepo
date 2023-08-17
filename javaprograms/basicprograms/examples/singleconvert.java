class singleconvert 
{
	public static void main(String[] args) 
	{
		int []a={10,20,30,40};
		int n=a.length-1;
		int sub=0;
		int []b=new int[n+1];
		int []c=new int[n+1];
		int sub1=0;
		for (int i=0;i<=n ;i++ )
		{
			int num=a[i];

			// int digit=num%10;
                sub=num-4;
		b[i]=sub;
	//	System.out.println(sub);
		}
		
		int n1=b.length-1;
		for (int i=0;i<=n1 ;i++ )
		{
			int num1=b[i];

			// int digit=num%10;
                sub1=num1-4;
				c[i]=sub1;
		}
			for (int j=0;j<=n1 ;j++ )
		{
			int	num2=c[j];
		 if (num2%2==0)
		 {
                
		 System.out.println(num2);	
		 }
		 
		}
		

	}
}
