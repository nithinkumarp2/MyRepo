class tri1 
{
	public static void main(String[] args) 
	{ 

		for (int i=1;i<=5 ;i++ )
	  {
		  for (int j=1;j<=5 ;j++ )
		  {
			  if (i==j||j==1||i==5||(i==3&&j<=2)||(i==4&&j<=3))
			  {
				  System.out.print("1");
			  }
			 // else if ()
			  //{
			//	  System.out.print("1");
			  //}
			  else
			  {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	}
}
