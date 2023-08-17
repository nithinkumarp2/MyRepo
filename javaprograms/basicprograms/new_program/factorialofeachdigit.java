class factorialofeachdigit 
{
	public static void main(String[] args) 
	{
		int n=1,fact=1;
		while (n>0)
		{
			int digit=n%10;
			fact*=digit;
			n/=10;
			System.out.println(fact);
		}
		System.out.println("Hello World!");
	}
}
