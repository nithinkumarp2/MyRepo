class program11 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		String res=(a>b)&&(a>c)&&(a>d)&&(a>e)?a+"is largest":(b>c)&&(b>d)&&(b>e)?b+"is largest":(c>d)&&(c>e)?c+"is largest"(d>e)?d+"is largest":e+"is largest";

		System.out.println(res);
	}
}
