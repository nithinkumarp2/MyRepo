class tri5

{
	public static void main(String[] args) 
	{
	   
 
		 for (int i=1;i<=5 ;i++ )
		 {
			 int n=1;
			   char c='A';
			 for (int j=1;j<=5 ;j++ )
			 {
				 if (i>=j)
				 {
					 if (j%2!=0)
					 {
						 System.out.print(n++);
					 }
					 else if (j%2==0)
					 {
						 System.out.print("* " );
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
