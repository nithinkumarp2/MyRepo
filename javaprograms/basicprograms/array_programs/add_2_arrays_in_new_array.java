class add_2_arrays_in_new_array 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4};
		int b[]={5,6,7,8};
		int[] c=new int[a.length+b.length];
		  int c1=0;
		for (int i=0;i<a.length ;i++ )
		{
			  c[i]=a[i];
			 c1++;
		}
			for (int j=0;j<b.length ;j++ )
			{
				  c[c1++]=b[j];
			}		 
				 for (int i=0; i<c.length;i++ )
				 {
					System.out.print(c[i]);
				 }
				 System.out.println(c1);
	}
}
