class tri4

{
	public static void main(String[] args) 
	{
	   
 
		 for (int i=1;i<=5 ;i++ )
		 {
			   char c='A';
			 for (int j=1;j<=5 ;j++ )
			 {
				 if (i>=j)
				 {
					 if (i%2!=0)
					 {
						 System.out.print(c++);
					 }
					 else if (i%2==0)
					 {
						 System.out.print(j );
					 }
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	}
}
