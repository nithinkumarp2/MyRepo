class tri6

{
	public static void main(String[] args) 
	{
	    int n=1;
 
		 for (int i=1;i<=5 ;i++ )
		 {
			
			   char c='A';
			 for (int j=1;j<=5 ;j++ )
			 {
				 if (i>=j)
				 {
					 
						 System.out.print(n++ );
					 
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
