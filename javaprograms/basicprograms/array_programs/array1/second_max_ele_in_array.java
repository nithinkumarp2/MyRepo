class second_max_ele_in_array 
{
	public static void main(String[] args) 
	{
		int[]a={2,1,6,7};
		int n=a.length-1;
	//	int []b=new int[n+1];
		int max=0;
		 for (int i=0;i<=n ;i++ )
		 { 
			// for (int k=0;k<=n ;k++ )
			 {
		
			 for (int j=0;j<=n-1 ;j++ )
			 {
				 if (a[j]<a[j+1])
				 {
					 int ele=a[j];
					 a[j]=a[j+1];
					 a[j+1]=ele;
				 }
				//b[j]=a[j];
			 }
			// max=a[i];
			 }
			  
			
		 }
		// for (int i=0;i<=n ;i++ )
		 { 
			  System.out.println(a[1]);
		 }
	}
}
