class program13 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		String res1=(a>b)&&(b>c)?a+"is largest":(b>c)?b+"is largest":c+"is largest";
		String res2=(a<b)&&(b<c)?a+"is smallest":(b<c)?b+"is smallest":c+"is smallest";

		System.out.println(res1);
		System.out.println(res2);
	}
}
