class  array2
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5};
		int n=a.length;
		int[] b=new int[n];
		 for (int i=0;i<n ;i++ )
		 {
			  int n1=a[i];
			 // b=b+n1;
			 a[i]=b[i];
			 System.out.println(b);
		 }
		System.out.println("Hello World!");
	}
}
