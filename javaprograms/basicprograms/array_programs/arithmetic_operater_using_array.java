class arithmetic_operater_using_array 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4};
		int[] b={5,6,7,8};
		int add=0;
		int sub=0;
		int mul=1;
		int div=0;
		for (int i=0;i<a.length ;i++ )
		{
			 add=a[i]+b[i];
			 sub=a[i]-b[i];
			 mul=a[i]*b[i];
			 div=a[i]%b[i];
		System.out.println("addition ="+add);
			System.out.println("subtraction ="+sub);
				System.out.println("multiplication ="+mul);
					System.out.println("division ="+div);
		}
	}
}
