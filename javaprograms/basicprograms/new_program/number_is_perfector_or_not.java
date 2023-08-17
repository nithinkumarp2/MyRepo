class number_is_perfector_or_not 
{
	public static void main(String[] args) 
	{
		int n=7 ,m=1,sum=0;
		while (m<n)
		{
		 if (n%m==0)
		 {
			 sum+=m;
		 }
             m++;
		}
		
		if (sum==n)
		{
			System.out.println("the given number is perfect"+sum);
		}
			else
		{
		System.out.println("the given number is not perfect"+sum);
		}
	}
}
